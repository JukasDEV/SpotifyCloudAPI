package com.ProjetoCloud.SpotifyAPI.Repository;

import com.ProjetoCloud.SpotifyAPI.Models.Musics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Musics, Integer> {
}