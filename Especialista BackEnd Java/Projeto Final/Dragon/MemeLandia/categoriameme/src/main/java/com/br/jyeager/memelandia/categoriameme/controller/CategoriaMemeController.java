package com.br.jyeager.memelandia.categoriameme.controller;

import com.br.jyeager.memelandia.categoriameme.entity.CategoriaMeme;
import com.br.jyeager.memelandia.categoriameme.service.CategoriaMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class CategoriaMemeController {
    @Autowired
    private CategoriaMemeService categoriaMemeService;

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return categoriaMemeService.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return categoriaMemeService.novaCategoriaMeme(categoriaMeme);
    }
}