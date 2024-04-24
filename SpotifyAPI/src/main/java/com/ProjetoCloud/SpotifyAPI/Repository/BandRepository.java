package com.ProjetoCloud.SpotifyAPI.Repository;

import com.ProjetoCloud.SpotifyAPI.Models.Bands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<Bands, Integer> {
}