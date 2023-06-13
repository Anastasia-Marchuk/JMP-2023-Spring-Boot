package com.amarchuk.jmp.task5.dao;


import com.amarchuk.jmp.task5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Anastasia Marchuk 02.06.2023
 */


public interface UserDao extends JpaRepository<User,Long> {
}
