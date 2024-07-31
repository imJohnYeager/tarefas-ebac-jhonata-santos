package com.br.jyeager.memelandia.categoriameme.controller;

import com.br.jyeager.memelandia.categoriameme.entity.CategoriaMeme;
import com.br.jyeager.memelandia.categoriameme.service.CategoriaMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class CategoriaMemeController {

    private static final Logger logger = LoggerFactory.getLogger(CategoriaMemeController.class);

    @Autowired
    private CategoriaMemeService categoriaMemeService;

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        logger.info("Buscando todas as categorias de memes");
        List<CategoriaMeme> categorias = categoriaMemeService.listaTodasCategorias();
        logger.info("Número de categorias encontradas: {}", categorias.size());
        return categorias;
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        logger.info("Criando uma nova categoria de meme com os dados: {}", categoriaMeme);
        CategoriaMeme novaCategoria = categoriaMemeService.novaCategoriaMeme(categoriaMeme);
        logger.info("Nova categoria de meme criada com sucesso: {}", novaCategoria);
        return novaCategoria;
    }
}
