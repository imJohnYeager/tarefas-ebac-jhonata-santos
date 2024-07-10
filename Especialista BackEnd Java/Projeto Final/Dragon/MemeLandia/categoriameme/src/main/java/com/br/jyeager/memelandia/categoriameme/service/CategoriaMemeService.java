package com.br.jyeager.memelandia.categoriameme.service;

import com.br.jyeager.memelandia.categoriameme.entity.CategoriaMeme;
import com.br.jyeager.memelandia.categoriameme.repository.CategoriaMemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMemeService {
    @Autowired
    private CategoriaMemeRepository categoriaMemeRepository;

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return categoriaMemeRepository.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return categoriaMemeRepository.findAll();
    }
}
