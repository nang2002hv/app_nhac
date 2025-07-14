package com.tinamusic.controller;

import com.tinamusic.model.dto.request.UserRequest;
import com.tinamusic.model.dto.response.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/register")
    public UserDto register(@RequestBody UserRequest userRequest) {

    }

}
