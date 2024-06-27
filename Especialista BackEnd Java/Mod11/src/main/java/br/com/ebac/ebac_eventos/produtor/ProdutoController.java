package br.com.ebac.ebac_eventos.produtor;

import br.com.ebac.ebac_eventos.servico.ServicoEnvioMensagensKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutoController {

    @Autowired
    private ServicoEnvioMensagensKafka servicoEnvioMensagensKafka;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){
        servicoEnvioMensagensKafka.enviarMensagem(mensagem);
    }
}
