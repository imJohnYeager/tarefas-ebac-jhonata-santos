package com.br.jyeager.memelandia.categoriameme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {

		"com.br.jyeager.memelandia.meme.entity",

		"com.br.jyeager.memelandia.categoriameme.entity",

		"com.br.jyeager.memelandia.usuario.entity"

})
public class CategoriamemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriamemeApplication.class, args);
	}

}
