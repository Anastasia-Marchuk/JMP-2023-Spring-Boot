package com.amarchuk.jmp.task3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by Anastasia Marchuk 02.06.2023
 * */

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
    }
}
