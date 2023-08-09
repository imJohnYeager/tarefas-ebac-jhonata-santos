package br.com.jyeager.adapter;

import java.io.File;

public class Main {
    public static void main(String args[]){
        String file = "nomeDoArquivo.txt";
        DropBox db = new DropBox();
        IPersistencia arquivos = new DropBoxAdapter(db);
        arquivos.gravar(new File(file));
    }
}
