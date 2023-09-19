package br.jyeager;
import it.auties.whatsapp.api.Whatsapp;
import it.auties.whatsapp.listener.Listener;
import it.auties.whatsapp.listener.RegisterListener;
import it.auties.whatsapp.model.info.MessageInfo;


@RegisterListener
public record MyListener(Whatsapp whatsapp) implements Listener {
    @Override
    public void onLoggedIn() {
        System.out.println("Hello :)");
    }

    @Override
    public void onNewMessage(Whatsapp whatsapp, MessageInfo info) {
        Listener.super.onNewMessage(whatsapp, info);
    }


}