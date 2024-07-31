package com.br.jyeager.memelandia.usuario.controller;

import com.br.jyeager.memelandia.usuario.entity.Usuario;
import com.br.jyeager.memelandia.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/memelandia")
public class UsuarioController {
    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        logger.info("Chamando buscaUsuarios");
        List<Usuario> usuarios = usuarioService.listaTodosUsuarios();
        logger.info("Usuários encontrados: {}", usuarios.size());
        return usuarios;
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        logger.info("Chamando novoUsuario com o usuário: {}", usuario);
        Usuario novoUsuario = usuarioService.novoUsuario(usuario);
        logger.info("Novo usuário criado com sucesso: {}", novoUsuario);
        return novoUsuario;
    }
}
