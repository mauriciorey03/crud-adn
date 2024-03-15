package com.exercise.adn.service;

import java.util.List;

import com.exercise.adn.repositories.entities.Persona;

public interface PersonaService {

    List<Persona> findAll();

    Persona findById(Long id);

    Persona save(Persona persona);

    void delete(Long id);
}