package co.com.pragma.persona.infrastructure.adapter.out.persistence;

import co.com.pragma.persona.application.port.out.PersonaRepository;
import co.com.pragma.persona.domain.model.Persona;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class PersonaRepositoryImpl implements PersonaRepository {

    private final JpaPersonaRepository personaRepository;

    @Override
    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Optional<Persona> savePersona(Persona persona) {
        return Optional.of(personaRepository.save(persona));
    }
}
