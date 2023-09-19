package br.jyeager;

import it.auties.whatsapp.api.Whatsapp;
import it.auties.whatsapp.model.info.MessageInfo;
import it.auties.whatsapp.model.message.standard.StickerMessage;
import it.auties.whatsapp.model.message.standard.TextMessage;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.UUID;
import java.util.stream.Collectors;

import static it.auties.whatsapp.model.message.standard.StickerMessage.*;

public class Comandos {

    public static void onNewMessage(Whatsapp api, MessageInfo info) {


            /* Nessa parte do código, você está verificando se o conteúdo da mensagem recebida
            é uma instância de TextMessage. Se não for, o método retorna imediatamente,
            o que significa que ele não fará mais nada com essa mensagem.
             */
            if (!(info.message().content() instanceof TextMessage textMessage)) {
                return;
            }
            if(!(info.message().stickerMessage() instanceof StickerMessage stickerMessage)){
                return;
            }


        if (textMessage.text().contains("/test")){
                api.sendMessage(info.chatJid(), "Olá, mundo!");
            }


        else if(textMessage.text().contains("/bot")){
                api.sendMessage(info.chatJid(), "olá! (ChatId: " + info.chatJid());
            }

        else if(textMessage.text().contains("/k")){
                api.sendMessage(info.chatJid(), "jkl");
            }

        var quoted = info.quotedMessage();
        var victim = quoted.get()
                    .sender()
                    .orElse(null);

        // ***Banir****
        if(textMessage.text().contains("/ban")){
                api.removeGroupParticipant(info.chat(), victim);
            }

        if (stickerMessage.hasContextInfo()) {
            api.sendMessage(info.chatJid(), "O id da figurinha enviada é: " + stickerMessage.hasContextInfo());
        }

        // if(StickerMessage.builder().equals())  ***dá para fazer algo com sticker aqui.



            }
        }