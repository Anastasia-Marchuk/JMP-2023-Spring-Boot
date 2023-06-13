package com.amarchuk.jmp.task5.web;


import com.amarchuk.jmp.task5.entity.User;
import com.amarchuk.jmp.task5.service.UserCommonServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by Anastasia Marchuk 02.06.2023
 */

@Controller
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


    @Autowired
    UserCommonServiceImpl userServiceImpl;


    @GetMapping("/")
    public String getAllUsers(Model model)  {

        List<User> allUsers = userServiceImpl.getAll();
        LOGGER.debug("get all users => {}", allUsers);
        model.addAttribute("allUsers", allUsers);
        model.addAttribute("heading", "List of all users in DB");
        LOGGER.info("Method start. UserController (-- / --)");
        return "list_users";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        LOGGER.debug("Delete user with id ({})", id);
        userServiceImpl.delete(id);
        LOGGER.info("Method start. UserController (-- /delete/{id} --)");
        return "redirect:/";
    }

    @GetMapping("/new")
    public String create() {
        LOGGER.debug("Create new user ");
        return "new_user";
    }

    @GetMapping("/create")
    public String createUser(@RequestParam("name") String name, @RequestParam("email") String email) {
        LOGGER.debug("Create user with name ({}) and email ({})", name, email);
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userServiceImpl.create(user);
        LOGGER.info("Method start. UserController.");
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model) {
        LOGGER.debug("Update user with id ({}) ", id);
        model.addAttribute("user", id);
        LOGGER.info("Method start. UserController.");
        return "update_user";
    }

    @GetMapping("/updateUser")
    public String updateUserById(@RequestParam("name") String name,@RequestParam("id") long id,@RequestParam("email") String email, Model model) {

        LOGGER.debug("Update user with name ({}) and email ({})", name, email);
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setId(id);
        userServiceImpl.update(user);
        LOGGER.info("Method start. UserController.");
        return "redirect:/";

    }
}

