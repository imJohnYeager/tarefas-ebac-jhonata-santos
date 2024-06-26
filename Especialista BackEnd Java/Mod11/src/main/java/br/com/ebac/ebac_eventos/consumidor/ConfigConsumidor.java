package br.com.ebac.ebac_eventos.consumidor;

import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {
@RetryableTopic(attempts = "2")
    @KafkaListener(topics = "${kafka.ebac.nome.topico}", groupId = "ebacGroup")
    public void consumirMensagem(String mensagem){
        if(mensagem.contains("DLT")){
            throw new IllegalArgumentException("Teste de DLT");
        }
        
        System.out.println("------------ RECEBENDO MENSAGEM ------------");
        System.out.println("------------ " + mensagem);
        System.out.println("------------ FIM DA MENSAGEM ------------");
    }

    @DltHandler
    public void consumirMensageDLT(String mensagem){
        System.out.println("------------ RECEBENDO MENSAGEM DLT ------------");
        System.out.println("------------ " + mensagem);
        System.out.println("------------ FIM DA MENSAGEM DLT ------------");
    }
}
