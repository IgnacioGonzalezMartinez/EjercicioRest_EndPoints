package com.example.EjercicioEndPoints.service;

import org.springframework.stereotype.Service;
import com.example.EjercicioEndPoints.models.Proyecto;

import java.util.*;

@Service
public class Servicio {

    private static final Map<Long, Proyecto> proyectoStore = new HashMap<>();
    private static Long idCounter = 1L;  

    
    public List<Proyecto> getAllProjects() {
        return new ArrayList<>(proyectoStore.values()); 
    }

    
    public Proyecto getProjectById(Long id) {
        return proyectoStore.get(id); 
    }

    
    public Proyecto createProject(Proyecto project) {
        project.setId(idCounter++); 
        proyectoStore.put((long) project.getId(), project); 
        return project;
    }

    
    public Proyecto updateProject(Long id, Proyecto project) {
        if (proyectoStore.containsKey(id)) {
            project.setId(id); 
            proyectoStore.put(id, project); 
            return project;
        }
        return null; 
    }

    
    public void deleteProject(Long id) {
        proyectoStore.remove(id); 
    }
}
