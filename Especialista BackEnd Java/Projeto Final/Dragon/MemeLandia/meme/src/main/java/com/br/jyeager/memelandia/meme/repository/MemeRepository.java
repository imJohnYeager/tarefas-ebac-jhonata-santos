package com.br.jyeager.memelandia.meme.repository;

import com.br.jyeager.memelandia.meme.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {
}
