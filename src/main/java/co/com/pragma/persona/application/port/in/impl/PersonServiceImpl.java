package co.com.pragma.persona.application.port.in.impl;

import co.com.pragma.persona.application.port.in.PersonaService;
import co.com.pragma.persona.application.port.out.PersonaRepository;
import co.com.pragma.persona.domain.model.Persona;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;

    @Override
    public Persona getPersonaById(Long id) {

        return personaRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona no encontrada"));
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.savePersona(persona).orElseThrow(() -> new RuntimeException("No se pudo guardar Persona"));
    }
}
