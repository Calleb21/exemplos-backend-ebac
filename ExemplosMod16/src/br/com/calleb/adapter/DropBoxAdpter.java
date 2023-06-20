package br.com.calleb.adapter;

import java.io.File;

public class DropBoxAdpter implements IPersistenciaArquivos{

    private DropBox dropBox;

    public DropBoxAdpter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());
    }
}
