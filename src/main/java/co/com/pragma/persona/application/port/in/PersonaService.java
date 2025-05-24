package co.com.pragma.persona.application.port.in;

import co.com.pragma.persona.domain.model.Persona;

public interface PersonaService {
    Persona getPersonaById(Long id);
    Persona savePersona(Persona persona);
}
