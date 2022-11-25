package ir.msghobadian.dong.controller;

import ir.msghobadian.dong.dto.PersonEntityInputDTO;
import ir.msghobadian.dong.model.PersonEntity;
import ir.msghobadian.dong.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class PersonController {
    private final PersonService service;
    @PostMapping("/person")
    public ResponseEntity<PersonEntity> savePerson(@RequestBody PersonEntityInputDTO person) {
        return ResponseEntity.ok(service.savePerson(person));
    }

    @GetMapping("/person")
    public ResponseEntity<List<PersonEntity>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }


}
