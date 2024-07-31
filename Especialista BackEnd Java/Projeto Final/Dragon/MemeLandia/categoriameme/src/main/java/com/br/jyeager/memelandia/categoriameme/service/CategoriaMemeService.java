package com.br.jyeager.memelandia.categoriameme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jyeager.memelandia.categoriameme.IFeignClient.IUsuarioClient;
import com.br.jyeager.memelandia.categoriameme.entity.CategoriaMeme;
import com.br.jyeager.memelandia.categoriameme.repository.CategoriaMemeRepository;
import com.br.jyeager.memelandia.usuario.entity.Usuario;


@Service
public class CategoriaMemeService {
    @Autowired
    private CategoriaMemeRepository categoriaMemeRepository;

    @Autowired
    private IUsuarioClient usuarioClient;

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return categoriaMemeRepository.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return categoriaMemeRepository.findAll();
    }

    public Usuario getUsuario(Long id){
        return usuarioClient.getUsuarioById(id);
    }

}
