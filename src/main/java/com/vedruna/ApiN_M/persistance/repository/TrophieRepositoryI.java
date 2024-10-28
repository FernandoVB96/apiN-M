package com.vedruna.ApiN_M.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vedruna.ApiN_M.persistance.models.Trophie;

@Repository
public interface TrophieRepositoryI extends JpaRepository<Trophie, Integer> {

}