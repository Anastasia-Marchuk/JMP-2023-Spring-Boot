package com.amarchuk.jmp.task5.service;

import java.util.List;

/**
 * Created by Anastasia Marchuk 02.06.2023
 */


public interface CommonService<T> {

    T create(T entity);

    List<T> getAll();

    T findById(long id);

    void update(T entity);

    void delete(long id);

}
