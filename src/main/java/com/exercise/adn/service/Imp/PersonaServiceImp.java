package com.exercise.adn.service.Imp;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.adn.repositories.RepositoryPersona;
import com.exercise.adn.repositories.entities.Persona;
import com.exercise.adn.service.PersonaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonaServiceImp implements PersonaService {

    private RepositoryPersona repositoryPersona;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) repositoryPersona.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(Long id) {
        return repositoryPersona.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Persona save(Persona Persona) {
        return repositoryPersona.save(Persona);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Persona> PersonaOptinal=repositoryPersona.findById(id);
        if(PersonaOptinal.isPresent()){
            repositoryPersona.delete(PersonaOptinal.get());
        }       
    }


}
