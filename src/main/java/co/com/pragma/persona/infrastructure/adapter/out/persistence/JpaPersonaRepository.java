package co.com.pragma.persona.infrastructure.adapter.out.persistence;

import co.com.pragma.persona.domain.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPersonaRepository extends JpaRepository<Persona, Long> {
}
