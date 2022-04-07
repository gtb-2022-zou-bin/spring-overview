package com.tw.springoverview;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final List<User> users = Arrays.asList(
            new User(1, "Obama"),
            new User(2, "Clinton")
    );

    @GetMapping
    public List<User> getUsers(){
        return users;
    }
}
