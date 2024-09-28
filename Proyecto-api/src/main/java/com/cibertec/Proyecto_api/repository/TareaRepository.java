package com.cibertec.Proyecto_api.repository;

import com.cibertec.Proyecto_api.model.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TareaRepository {
    private List<Tarea> tareas = new ArrayList<>();
    private long currentId = 1;

    public List<Tarea> findAll() {
        return tareas;
    }

    public Tarea save(Tarea tarea) {
        if (tarea.getId() == null) {
            tarea.setId(currentId++);
            tareas.add(tarea);
        } else {
            // Actualizar tarea existente
            for (int i = 0; i < tareas.size(); i++) {
                if (tareas.get(i).getId().equals(tarea.getId())) {
                    tareas.set(i, tarea);
                    break;
                }
            }
        }
        return tarea;
    }
}