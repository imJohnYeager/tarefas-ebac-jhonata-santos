package br.com.jyeager.adapter;

import java.io.File;

public interface IPersistencia {
    public void gravar(File file);
    public File ler(String caminho);
}
