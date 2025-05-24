package co.com.pragma.persona.infrastructure.adapter.in.web.mapper;

import co.com.pragma.persona.domain.model.Persona;
import co.com.pragma.persona.infrastructure.adapter.in.web.dto.PersonaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Mapping(target = "id", ignore = true)
    Persona personaRequestToPersona (PersonaRequest personaRequest);
}
