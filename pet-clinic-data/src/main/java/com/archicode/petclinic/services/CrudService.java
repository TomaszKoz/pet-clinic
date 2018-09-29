package com.archicode.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T save(T entity);

    T findById(ID id);

    Set<T> findAll();

    void delete(T entity);

    void deleteById(ID id);

}
