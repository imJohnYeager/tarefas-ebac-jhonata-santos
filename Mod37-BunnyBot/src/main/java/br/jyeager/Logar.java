package br.jyeager;

import it.auties.whatsapp.api.*;
import it.auties.whatsapp.model.companion.CompanionDevice;
import it.auties.whatsapp.model.contact.ContactJid;
import it.auties.whatsapp.model.info.MessageInfo;
import it.auties.whatsapp.model.message.standard.TextMessage;
import it.auties.whatsapp.model.mobile.VerificationCodeMethod;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;
@Deprecated
public class Logar {
    Long myNumber = 5571992748362L;
    //Long myNumber = 5571991316188L;

    Path caminho = Path.of("C:\\Users\\jhons\\Desktop\\Projeto Yeager\\BunnyBot");
    String nomeArquivo = UUID.randomUUID() + ".jpg";
    QrHandler qrHandler = QrHandler.toTerminal();
    public void LogarNumero(){

        Whatsapp.mobileBuilder()
                //.serializer(new BunnyBotSerializer())
                .newConnection(myNumber)
                .name("Bunny Bot")
                .autodetectListeners(true)
                .textPreviewSetting(TextPreviewSetting.ENABLED_WITH_INFERENCE)
                .checkPatchMacks(true)
                .device(CompanionDevice.android())
                .unregistered()
                .verificationCodeMethod(VerificationCodeMethod.SMS)
                .verificationCodeSupplier(() -> {
                    System.out.println("Insira o código SMS: ");
                    return new Scanner(System.in).nextLine();
                }).register(myNumber).join().connectAwaitingLogout().join();
    }
    public void LogarQRCode(){


        //QrHandler qrHandler = QrHandler.toFile(caminho.resolve(nomeArquivo),
        //        QrHandler.ToFileConsumer.discarding());


        Whatsapp.webBuilder()
                //.serializer(new BunnyBotSerializer())
                .newConnection(myNumber)
                .name("Bunny Bot")
                .autodetectListeners(true)
                .textPreviewSetting(TextPreviewSetting.ENABLED_WITH_INFERENCE)
                .checkPatchMacks(true)
                .unregistered(qrHandler)
                .addNewMessageListener(Logar::onMessage)
                .connectAwaitingLogout().join();
    }

    private static void onMessage(Whatsapp api, MessageInfo info) {
        if (!(info.message()
                .content() instanceof TextMessage textMessage)) {
            return;
        }

        if (!textMessage.text()
                .toLowerCase()
                .contains("/ban")) {
            return;
        }

        if (info.chatJid().hasServer(ContactJid.Server.GROUP)) {
            api.sendMessage(info.chatJid(), "[WhatsappBot] This command is only supported in groups", info);
            return;
        }

        var quoted = info.quotedMessage();
        if (quoted.isEmpty()) {
            api.sendMessage(info.chatJid(),
                    "[WhatsappBot] Please quote a message sent by the person that you want to ban", info);
            return;
        }

        var victim = quoted.get()
                .sender()
                .orElse(null);
        if (victim == null) {
            api.sendMessage(info.chatJid(), "[WhatsappBot] Missing contact, cannot ban target", info);
            return;
        }

        api.removeGroupParticipant(info.chat(), victim)
                .thenRunAsync(() -> api.sendMessage(info.chatJid(), "[WhatsappBot] The contact was successfully banned", info));
    }

// public void LogarQRCode2(){
//
//     WebOptionsBuilder webOptionsBuilder = Whatsapp.webBuilder().newConnection();
//     return webOptionsBuilder.unregistered(qr -> {
//                 try {
//                     String urlQrcode = fileActions.salvarArquivo(HandlerQrCodeUtil.onQrCode(qr));
//                     qrcodeActions.salvarNovaUrlDoQrcode(urlQrcode, command.getKey());
//                 } catch (IOException e) {
//                     throw new RuntimeException(e);
//                 }
//             })
//             .addLoggedInListener(whatsapp -> qrcodeActions.deletar(command.getKey()))
//             .addDisconnectedListener(onDisconnectedActions::onDisconnected)
//             .addNewMessageListener(newMessageActions::onNewMessage)
//             .connect()
//             .join();
//
// }
}