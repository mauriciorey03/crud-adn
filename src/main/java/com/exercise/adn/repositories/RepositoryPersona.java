package com.exercise.adn.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exercise.adn.repositories.entities.Persona;

public interface RepositoryPersona extends CrudRepository<Persona, Long>{

    
}
