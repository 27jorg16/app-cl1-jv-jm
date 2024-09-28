package com.cibertec.Proyecto_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {
    private Long id;
    private String descripcion;
    private boolean completada;
}