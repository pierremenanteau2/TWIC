package com.example.tp2spring.controller;

import com.example.tp2spring.model.Ville;
import com.example.tp2spring.service.VilleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/villes")
@CrossOrigin("*")
public class VilleController {

    private final VilleService villeService;

    public VilleController(VilleService villeService) {
        this.villeService = villeService;
    }

    @GetMapping
    public List<Ville> villes() {
        return villeService.getVilles();
    }

    @GetMapping("/codePostal/{codePostal}")
    public List<Ville> villesByCodePostal(@PathVariable String codePostal) {
        return villeService.getVillesByCodePostal(codePostal);
    }

}
