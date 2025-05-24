package co.com.pragma.persona.application.port.out;

import co.com.pragma.persona.domain.model.Persona;

import java.util.Optional;

public interface PersonaRepository {
    Optional<Persona> findById(Long id);
    Optional<Persona> savePersona(Persona persona);
}