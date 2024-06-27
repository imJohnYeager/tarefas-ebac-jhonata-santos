package br.com.ebac.ebac_troggle_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/mensagens")
public class MessageController {
    @Value("${client.message:Hello, not message here.}")
    private String message;

    @Value("${client.ligadesliga:false}")
    private boolean ligaDesliga;


    @GetMapping
    public String getMessage() {
        if (ligaDesliga) {
            return this.message;
        }
        return "Funcionalidade desligada";
    }

}
