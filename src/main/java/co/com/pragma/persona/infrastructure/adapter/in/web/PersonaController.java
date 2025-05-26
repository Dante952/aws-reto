package co.com.pragma.persona.infrastructure.adapter.in.web;

import co.com.pragma.persona.application.port.in.PersonaService;
import co.com.pragma.persona.domain.model.Persona;
import co.com.pragma.persona.infrastructure.adapter.in.web.dto.PersonaRequest;
import co.com.pragma.persona.infrastructure.adapter.in.web.mapper.PersonaMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
@AllArgsConstructor
public class PersonaController {

    private final PersonaService personaService;
    private final PersonaMapper personaMapper;



    @GetMapping("consultarpersona/{id}")
    public ResponseEntity<Persona> getPersona(@PathVariable Long id){
        return ResponseEntity.ok(personaService.getPersonaById(id));
    }

    @PostMapping("guardarpersona")
    public ResponseEntity<Persona> savePersona(@RequestBody PersonaRequest personaRequest){
        return ResponseEntity.ok(personaService.savePersona(personaMapper.personaRequestToPersona(personaRequest)));
    }
}
