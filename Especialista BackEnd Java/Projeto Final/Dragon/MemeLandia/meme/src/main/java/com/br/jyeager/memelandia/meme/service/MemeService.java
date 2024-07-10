package com.br.jyeager.memelandia.meme.service;

import com.br.jyeager.memelandia.meme.entity.Meme;
import com.br.jyeager.memelandia.meme.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {
    @Autowired
    private MemeRepository memeRepository;

    public Meme novoMeme(Meme meme) {
        return memeRepository.save(meme);
    }

    public List<com.br.jyeager.memelandia.meme.entity.Meme> listaTodosMemes() {
        return memeRepository.findAll();
    }
}