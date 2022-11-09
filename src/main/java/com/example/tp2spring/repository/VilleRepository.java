package com.example.tp2spring.repository;

import com.example.tp2spring.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VilleRepository extends JpaRepository<Ville, String> {

    List<Ville> findVillesByCodePostal(String codePostal);

}