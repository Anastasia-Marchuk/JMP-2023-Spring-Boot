package com.amarchuk.jmp.task4.service;

import com.amarchuk.jmp.task4.dao.UserDao;
import com.amarchuk.jmp.task4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasia Marchuk 06.06.2023
 */

@Service
public class UserCommonServiceImpl implements CommonService<User> {

    @Autowired
    UserDao userDao;

    @Override
    public User create(User entity) {
        return userDao.save(entity);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void update(User entity) {
        userDao.save(entity);
    }

    @Override
    public void delete(long id) {
        userDao.deleteById(id);
    }
}
