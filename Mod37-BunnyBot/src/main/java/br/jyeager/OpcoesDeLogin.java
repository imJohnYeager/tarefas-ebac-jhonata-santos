package br.jyeager;

import br.jyeager.serializer.BunnySerializer;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import it.auties.whatsapp.api.*;
import it.auties.whatsapp.model.companion.CompanionDevice;
import it.auties.whatsapp.model.mobile.VerificationCodeMethod;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpcoesDeLogin {
    private final String myNumber = "5571992748362L"; // 5571992748362L - outro número - 5571991316188L

    public void LogarQRCode() {
//        QrHandler qrHandler = qr -> {
//            String outputPath = "C:\\Users\\jhons\\Desktop\\Projeto Yeager\\qrcode.png";
//            generateQRCode(qr, outputPath);
//        };


        Whatsapp.webBuilder()
                //.serializer(new BunnySerializer())

                //.newConnection(myNumber)
                .lastConnection()
                .name("Bunny Bot")
                .autodetectListeners(true)
                .textPreviewSetting(TextPreviewSetting.ENABLED_WITH_INFERENCE)
                .checkPatchMacks(true)
                .historyLength(WebHistoryLength.ZERO)
                //.registered()
                //.get()
                .unregistered(QrHandler.toTerminal())
                .addLoggedInListener(() -> System.out.println("Conectado!"))
                .addNewMessageListener(Comandos::onNewMessage) // Usando o método onNewMessage da classe Comandos
                .connectAwaitingLogout().join();

        //System.out.println((QrHandler.toTerminal()));
    }

    private void generateQRCode(String text, String filePath) {
        int width = 300;
        int height = 300;
        String format = "png";

        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
            BufferedImage qrImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    qrImage.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
                }
            }

            File qrFile = new File(filePath);
            ImageIO.write(qrImage, format, qrFile);

            System.out.println("QR Code gerado com sucesso: " + qrFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Erro ao gerar o QR Code: " + e.getMessage());
        }
    }

    public void LogarUID(){
        String id1 = "20cac758-aca6-4780-90f2-6afff490d222";
        Whatsapp.webBuilder()
                //.serializer(new BunnyBotSerializer())
                .newConnection(id1);
    }

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
                }).register(5571992748362L).join()
                .addLoggedInListener(() -> System.out.println("Conectado!"))
                .addNewMessageListener(Comandos::onNewMessage) // Usando o método onNewMessage da classe Comandos
                .connectAwaitingLogout().join();}

}
