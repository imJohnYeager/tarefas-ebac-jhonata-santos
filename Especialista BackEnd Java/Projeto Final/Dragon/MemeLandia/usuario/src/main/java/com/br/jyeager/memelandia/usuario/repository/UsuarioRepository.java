package com.br.jyeager.memelandia.usuario.repository;

import com.br.jyeager.memelandia.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
