package com.details.user;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public UserRest createUser(@Valid @RequestBody UserDetailsRequestModel requestUserDetails) {
        System.out.println("hello");
        UserRest returnValue = new UserRest();
        returnValue.setFirstName("Sergey");
        returnValue.setLastName("Kargopolov");
        return returnValue;
    }
}