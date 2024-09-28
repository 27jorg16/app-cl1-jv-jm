package com.cibertec.Proyecto_api.repository;

import com.cibertec.Proyecto_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private long currentId = 1;

    public List<Usuario> findAll() {
        return usuarios;
    }

    public Usuario save(Usuario usuario) {
        if (usuario.getId() == null) {
            usuario.setId(currentId++);
            usuarios.add(usuario);
        } else {
            // Actualizar usuario existente
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId().equals(usuario.getId())) {
                    usuarios.set(i, usuario);
                    break;
                }
            }
        }
        return usuario;
    }
}