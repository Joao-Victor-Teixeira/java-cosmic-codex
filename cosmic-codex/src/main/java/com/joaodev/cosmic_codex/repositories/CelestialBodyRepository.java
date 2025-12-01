package com.joaodev.cosmic_codex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.cosmic_codex.entities.CelestialBody;

public interface CelestialBodyRepository extends JpaRepository<CelestialBody, Long> {

}
