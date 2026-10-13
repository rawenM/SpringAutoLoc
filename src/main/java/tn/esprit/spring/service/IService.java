package tn.esprit.spring.service;

import java.util.List;

public interface IService<T> {

    T add(T entity);

    T update(T entity);

    void delete(Long id);

    T findById(Long id);

    List<T> findAll();
}