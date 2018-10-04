package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.BaseEntity;

import java.util.*;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    private Map<Long, T> map = new HashMap<>();

    public T save(T entity) {
        if (entity != null) {
            if (entity.getId() == null) {
                entity.setId(getNextId());
            }
            map.put(entity.getId(), entity);
        } else {
            throw new IllegalArgumentException("Entity cannot be null");
        }
        return entity;
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public void delete(T entity) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        if (map.keySet().isEmpty()) {
            return 1L;
        } else {
            return Collections.max(map.keySet()) + 1;
        }
    }

}
