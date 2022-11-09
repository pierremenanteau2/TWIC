package com.example.tp2spring.service;

import com.example.tp2spring.model.Ville;

import java.util.List;

public interface VilleService {
    List<Ville> getVilles();

    List<Ville> getVillesByCodePostal(String codePostal);
}
