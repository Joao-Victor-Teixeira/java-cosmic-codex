package com.joaodev.cosmic_codex.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaodev.cosmic_codex.entities.CelestialBody;
import com.joaodev.cosmic_codex.repositories.CelestialBodyRepository;

@RestController
@RequestMapping(value = "/bodies")
public class CelestialBodyController {

    @Autowired
    private CelestialBodyRepository repository; 

    @GetMapping(value = "/{id}")
    public ResponseEntity<CelestialBody> findById(@PathVariable Long id) {
        Optional<CelestialBody> result = repository.findById(id);
        
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        
        return ResponseEntity.ok(result.get());
    }
}
