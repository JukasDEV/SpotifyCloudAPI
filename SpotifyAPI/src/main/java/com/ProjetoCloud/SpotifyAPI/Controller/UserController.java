package com.ProjetoCloud.SpotifyAPI.Controller;


import com.ProjetoCloud.SpotifyAPI.Models.Users;
import com.ProjetoCloud.SpotifyAPI.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/Get{id}")
    public ResponseEntity<Users> getById(@PathVariable("id") Integer id) {
        return this.userRepository.findById(id).map(user -> {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/CreateUser")
    public ResponseEntity<Users> addUser(@Valid @RequestBody Users user) {
        Users savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/Delete{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        return userRepository.findById(id).map(user -> {
            userRepository.delete(user);
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        }).orElse(new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable Integer id, @RequestBody Users userDetails) {
        return userRepository.findById(id).map(users -> {
            users.setName(userDetails.getName() != null ? userDetails.getName() : users.getName());
            users.setEmail(userDetails.getEmail() != null ? userDetails.getEmail() : users.getEmail());
            users.setPassword(userDetails.getPassword() != null ? userDetails.getPassword() : users.getPassword());
            users.setLikedSongs(userDetails.getLikedSongs() != null ? userDetails.getLikedSongs() : users.getLikedSongs());
            users.setCurrentPlan(userDetails.getCurrentPlan() != null ? userDetails.getCurrentPlan() : users.getCurrentPlan());

            Users updatedUser = userRepository.save(users);
            return ResponseEntity.ok(updatedUser);
        }).orElse(ResponseEntity.notFound().build());
    }


    }



