package com.joaodev.cosmic_codex.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_celestial_body")
public class CelestialBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageUrl;
    
    @Column(columnDefinition = "TEXT")
    private String description;

    private Double mass;
    private Double radius;
    private Double orbitalPeriod;
    private Double gravity;
    
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public CelestialBody(){
    }


    public CelestialBody(Long id, String name, String imageUrl, String description, Double mass, Double radius,
            Double orbitalPeriod, Double gravity, Section section) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.mass = mass;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
        this.gravity = gravity;
        this.section = section;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Double getMass() {
        return mass;
    }


    public void setMass(Double mass) {
        this.mass = mass;
    }


    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }


    public void setOrbitalPeriod(Double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }


    public Double getGravity() {
        return gravity;
    }


    public void setGravity(Double gravity) {
        this.gravity = gravity;
    }


    public Section getSection() {
        return section;
    }


    public void setSection(Section section) {
        this.section = section;
    }

    
}
