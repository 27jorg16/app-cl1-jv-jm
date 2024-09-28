package com.cibertec.Proyecto_api.controller;

import com.cibertec.Proyecto_api.model.Tarea;
import com.cibertec.Proyecto_api.repository.TareaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

private final TareaRepository tareaRepository = new TareaRepository();

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }
}
