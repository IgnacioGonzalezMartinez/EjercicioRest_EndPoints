package com.example.EjercicioEndPoints.service;

import org.springframework.stereotype.Service;
import com.example.EjercicioEndPoints.models.Proyecto;

import java.util.*;

@Service
public class Servicio {

    private static final Map<Long, Proyecto> proyecto = new HashMap<>();
    private static Long idCounter = 1L;  

    
    public List<Proyecto> getAllProjects() {
        return new ArrayList<>(proyecto.values()); 
    }

    
    public Proyecto getProjectById(Long id) {
        return proyecto.get(id); 
    }

    
    public Proyecto createProject(Proyecto project) {
        project.setId(idCounter++); 
        proyecto.put((long) project.getId(), project); 
        return project;
    }

    
    public Proyecto updateProject(Long id, Proyecto project) {
        if (proyecto.containsKey(id)) {
            project.setId(id); 
            proyecto.put(id, project); 
            return project;
        }
        return null; 
    }

    
    public void deleteProject(Long id) {
    	proyecto.remove(id); 
    }
    
    
}
