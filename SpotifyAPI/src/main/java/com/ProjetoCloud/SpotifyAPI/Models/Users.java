package com.ProjetoCloud.SpotifyAPI.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "liked_songs")  // Assumindo que isso pode ser um texto simples ou uma lista separada por vírgulas
    private String likedSongs;

    @Column(name = "current_plan")
    private String currentPlan;

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLikedSongs() {
        return likedSongs;
    }

    public String getCurrentPlan() {
        return currentPlan;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLikedSongs(String likedSongs) {
        this.likedSongs = likedSongs;
    }

    public void setCurrentPlan(String currentPlan) {
        this.currentPlan = currentPlan;
    }
}