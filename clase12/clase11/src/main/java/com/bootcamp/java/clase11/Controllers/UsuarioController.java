package com.bootcamp.java.clase11.Controllers;

import com.bootcamp.java.clase11.models.Usuario;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    static List<Usuario> usuarios = List.of(new Usuario(1,"Lucas","Moy","123456789", "lucas@moy.com"));

    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios() {

        return usuarios;
}

    @DeleteMapping("/prueba")
    public void eliminarUsuario(@PathVariable String id) {
        usuarios.remove(0);
    }

    @PostMapping("/prueba")
    public String prueba2() {
        return "Prueba Post";
    }
}
