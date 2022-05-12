package com.example.curso.resources;

import com.example.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> get() {
        return ResponseEntity.ok().body(new User(1L, "Fernando","teste@gmail,com","5198568989","dddddd"));
    }
}
