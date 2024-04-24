package com.ProjetoCloud.SpotifyAPI.Repository;

import com.ProjetoCloud.SpotifyAPI.Models.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscriptions, Integer> {
}