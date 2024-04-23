package com.ProjetoCloud.SpotifyAPI.Controller;


import com.ProjetoCloud.SpotifyAPI.Models.Users;
import com.ProjetoCloud.SpotifyAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/getAll")
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Users> getById(@PathVariable("id") Integer id) {
        return this.userRepository.findById(id).map(user -> {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}