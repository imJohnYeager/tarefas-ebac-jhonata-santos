package com.br.jyeager.memelandia.usuario.controller;

import com.br.jyeager.memelandia.usuario.entity.Usuario;
import com.br.jyeager.memelandia.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        return usuarioService.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return usuarioService.novoUsuario(usuario);
    }
}