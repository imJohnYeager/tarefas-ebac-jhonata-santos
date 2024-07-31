package com.br.jyeager.memelandia.meme.controller;

import com.br.jyeager.memelandia.meme.entity.Meme;
import com.br.jyeager.memelandia.meme.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/memelandia")
public class MemeController {
    private static final Logger logger = LoggerFactory.getLogger(MemeController.class);

    @Autowired
    private MemeService memeService;

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        logger.info("Chamando buscaMemes");
        List<Meme> memes = memeService.listaTodosMemes();
        logger.info("Memes encontrados: {}", memes.size());
        return memes;
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        logger.info("Chamando novoMeme com o meme: {}", meme);
        Meme novoMeme = memeService.novoMeme(meme);
        logger.info("Novo meme criado com sucesso: {}", novoMeme);
        return novoMeme;
    }
}
