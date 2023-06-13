package com.amarchuk.jmp.task4.service;

import java.util.List;

/**
 * Created by Anastasia Marchuk 06.06.2023
 */


public interface CommonService<T> {

    T create(T entity);

    List<T> getAll();

    T findById(long id);

    void update(T entity);

    void delete(long id);

}
