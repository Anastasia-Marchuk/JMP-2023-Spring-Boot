package com.amarchuk.jmp.task4.entity;


import javax.persistence.*;

/**
 * Created by Anastasia Marchuk 06.06.2023
 */

    @Entity
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @Column(nullable = false)
        private String name;
        @Column(unique = true, nullable = false)
        private String email;

        public User() {
        }

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
