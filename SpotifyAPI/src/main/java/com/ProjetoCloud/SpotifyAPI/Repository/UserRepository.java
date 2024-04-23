package com.ProjetoCloud.SpotifyAPI.Repository;


import com.ProjetoCloud.SpotifyAPI.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}