package com.example.EjercicioEndPoints.controller;


import org.springframework.web.bind.annotation.*;

import com.example.EjercicioEndPoints.models.Proyecto;
import com.example.EjercicioEndPoints.service.Servicio;

import java.util.*;

@RestController
@RequestMapping("/projects")
public class Controller {

    private final Servicio servicio;

    public Controller(Servicio servicio) {
        this.servicio = servicio;
    }

    
    @GetMapping
    public List<Proyecto> getAllProjects() {
        return servicio.getAllProjects();
    }

    
    @GetMapping("/{id}")
    public Proyecto getProjectById(@PathVariable Long id) {
        return servicio.getProjectById(id);
    }

    
    @PostMapping
    public Proyecto createProject(@RequestBody Proyecto project) {
        return servicio.createProject(project);
    }

    
    @PutMapping("/{id}")
    public Proyecto updateProject(@PathVariable Long id, @RequestBody Proyecto project) {
        return servicio.updateProject(id, project);
    }

    
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
    	servicio.deleteProject(id);
    }
}