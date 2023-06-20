package br.com.calleb.adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdpter(drop);
        arquivos.gravar(new File(file));
    }
}
