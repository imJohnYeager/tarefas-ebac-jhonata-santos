package com.br.jyeager.memelandia.usuario.service;

import com.br.jyeager.memelandia.usuario.entity.Usuario;
import com.br.jyeager.memelandia.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario novoUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return usuarioRepository.findAll();
    }
}