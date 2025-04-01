package com.example.EjercicioEndPoints.controller;


import org.springframework.web.bind.annotation.*;

import com.example.EjercicioEndPoints.models.Proyecto;
import com.example.EjercicioEndPoints.service.Servicio;

import java.util.*;

@RestController
@RequestMapping("/projects")
public class Controller {

    private final Servicio projectService;

    public Controller(Servicio projectService) {
        this.projectService = projectService;
    }

    
    @GetMapping
    public List<Proyecto> getAllProjects() {
        return projectService.getAllProjects();
    }

    
    @GetMapping("/{id}")
    public Proyecto getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    
    @PostMapping
    public Proyecto createProject(@RequestBody Proyecto project) {
        return projectService.createProject(project);
    }

    
    @PutMapping("/{id}")
    public Proyecto updateProject(@PathVariable Long id, @RequestBody Proyecto project) {
        return projectService.updateProject(id, project);
    }

    
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}