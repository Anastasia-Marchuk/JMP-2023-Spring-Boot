package com.amarchuk.jmp.task4.dao;


import com.amarchuk.jmp.task4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anastasia Marchuk 6.06.2023
 */


@Repository
public interface UserDao extends JpaRepository<User,Long> {
    List<User> findByEmailLike(String likeName);
}
