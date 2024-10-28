package com.vedruna.ApiN_M.services;

import java.util.List;
import com.vedruna.ApiN_M.dto.TrophieDTO;
import com.vedruna.ApiN_M.persistance.models.Trophie;

public interface TrophieServiceI {
    List<TrophieDTO> showAllTrophies();
    void saveTrophie(Trophie trophie);
}