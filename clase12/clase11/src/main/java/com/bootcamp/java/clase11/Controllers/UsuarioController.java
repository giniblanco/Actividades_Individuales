package com.bootcamp.java.clase11.Controllers;

import com.bootcamp.java.clase11.models.Usuario;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class UsuarioController {

    // Lista de usuarios
    List<Usuario> usuarios = new ArrayList<>();

    {
        // Agregar un usuario de ejemplo a la lista (inicialización)
        usuarios.add(new Usuario(27, "Lucas", "Moy", "123456789", "lucas@moy.com"));
    }

    // Obtener todos los usuarios
    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarios;
}


    // Eliminar un usuario por su ID
    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario user = iterator.next();
            if (id == user.getId()) {
                iterator.remove();
            }
        }
    }

    // Ruta de prueba
    @PostMapping("/prueba")
    public String prueba2() {
        return "Prueba Post";
    }
}
