package com.example.tp2spring.service.impl;

import com.example.tp2spring.service.VilleService;
import com.example.tp2spring.model.Ville;
import com.example.tp2spring.repository.VilleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleServiceImpl implements VilleService {

    private final VilleRepository villeRepository;

    public VilleServiceImpl(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    @Override
    public List<Ville> getVilles() {
        return villeRepository.findAll();
    }

    @Override
    public List<Ville> getVillesByCodePostal(String codePostal) {
        return villeRepository.findVillesByCodePostal(codePostal);
    }
}