package com.ProjetoCloud.SpotifyAPI.Repository;

import com.ProjetoCloud.SpotifyAPI.Models.Playlists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlists, Integer> {
}
