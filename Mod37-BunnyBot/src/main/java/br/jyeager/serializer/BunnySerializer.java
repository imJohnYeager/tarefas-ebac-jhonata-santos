package br.jyeager.serializer;

import it.auties.whatsapp.api.ClientType;
import it.auties.whatsapp.controller.Controller;
import it.auties.whatsapp.controller.Keys;
import it.auties.whatsapp.controller.Store;
import it.auties.whatsapp.model.mobile.PhoneNumber;
import lombok.NonNull;

import java.io.*;
import java.util.LinkedList;
import java.util.Optional;
import java.util.UUID;

public record BunnySerializer() implements it.auties.whatsapp.controller.@lombok.NonNull ControllerSerializer {
    @Override
    public LinkedList<UUID> listIds(@NonNull ClientType type) {
        // Aqui você deve retornar uma lista de UUIDs relacionados ao tipo de cliente
        return new LinkedList<>(); // Exemplo: new LinkedList<>(List.of(UUID.randomUUID()));
    }

    @Override
    public LinkedList<PhoneNumber> listPhoneNumbers(@NonNull ClientType type) {
        // Aqui você deve retornar uma lista de PhoneNumbers relacionados ao tipo de cliente
        return new LinkedList<>(); // Exemplo: new LinkedList<>(List.of(new PhoneNumber("551234567890")));
    }

    @Override
    public void serializeKeys(Keys keys, boolean async) {
        String filename = "BunnyKeys.ser"; // Nome do arquivo de chaves
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(keys); // Salva as chaves no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void serializeStore(Store store, boolean async) {
        String filename = "BunnyStore.ser"; // Nome do arquivo de armazenamento
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(store); // Salva o armazenamento no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Keys> deserializeKeys(@NonNull ClientType type, UUID id) {
        String filename = "BunnyKeys.ser"; // Nome do arquivo de chaves
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Keys keys = (Keys) in.readObject();
            return Optional.of(keys);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }


    @Override
    public Optional<Keys> deserializeKeys(@NonNull ClientType type, long phoneNumber) {
        String filename = "BunnyKeys.ser"; // Nome do arquivo de chaves
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Keys keys = (Keys) in.readObject();
            return Optional.of(keys);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Keys> deserializeKeys(@NonNull ClientType type, String alias) {
        String filename = "BunnyKeys.ser"; // Nome do arquivo de chaves
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Keys keys = (Keys) in.readObject();
            return Optional.of(keys);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Store> deserializeStore(@NonNull ClientType type, UUID id) {
        String filename = "BunnyStore.ser"; // Nome do arquivo de armazenamento
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Store store = (Store) in.readObject();
            return Optional.of(store);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Store> deserializeStore(@NonNull ClientType type, long phoneNumber) {
        String filename = "BunnyStore.ser"; // Nome do arquivo de armazenamento
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Store store = (Store) in.readObject();
            return Optional.of(store);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Store> deserializeStore(@NonNull ClientType type, String alias) {
        String filename = "BunnyStore.ser"; // Nome do arquivo de armazenamento
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Store store = (Store) in.readObject();
            return Optional.of(store);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public void deleteSession(@NonNull Controller<?> controller) {
        // Aqui você deve implementar a lógica para excluir uma sessão de controle
        // Por exemplo, se você estiver usando uma lista de sessões, pode remover a sessão da lista.
    }
}