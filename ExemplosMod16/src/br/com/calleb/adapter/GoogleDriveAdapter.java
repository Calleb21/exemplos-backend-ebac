package br.com.calleb.adapter;

import java.io.File;

public class GoogleDriveAdapter implements IPersistenciaArquivos{

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googleDrive) {
        this.googleDrive = googleDrive;
    }

    @Override
    public void gravar(File file) {

    }

    @Override
    public File ler(String caminho) {
        return null;
    }
}
