package com.archicode.petclinic.services;

import java.util.Set;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public interface CrudService<T, ID> {

    T save(T entity);

    T findById(ID id);

    Set<T> findAll();

    void delete(T entity);

    void deleteById(ID id);

}
