package com.archicode.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public abstract class AbstractMapService<T, ID> {

    private Map<ID, T> map = new HashMap<>();

    T save(ID id, T entity) {
        map.put(id, entity);
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

}
