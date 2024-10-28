package com.vedruna.ApiN_M.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vedruna.ApiN_M.persistance.models.Player;

@Repository
public interface PlayerRepositoryI extends JpaRepository<Player, Integer> {
    public Player findByNombreUsuario(String nombreUsuario);
}
