package com.archicode.petclinic.services.map;

import com.archicode.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

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
