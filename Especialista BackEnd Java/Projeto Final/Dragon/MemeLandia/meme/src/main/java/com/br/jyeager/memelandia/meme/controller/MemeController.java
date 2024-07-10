package com.br.jyeager.memelandia.meme.controller;

import com.br.jyeager.memelandia.meme.entity.Meme;
import com.br.jyeager.memelandia.meme.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class MemeController {
    @Autowired
    private MemeService memeService;

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return memeService.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme){
        return memeService.novoMeme(meme);
    }
}