package com.amarchuk.jmp.task4.dao;


import com.amarchuk.jmp.task4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Anastasia Marchuk 06.06.2023
 */


public interface UserDao extends JpaRepository<User,Long> {
}
