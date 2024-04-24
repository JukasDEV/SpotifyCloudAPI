package com.ProjetoCloud.SpotifyAPI.Repository;

import com.ProjetoCloud.SpotifyAPI.Models.Plans;
import com.ProjetoCloud.SpotifyAPI.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlansRepository extends JpaRepository<Plans, Integer> {
}


