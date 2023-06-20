package br.com.calleb.adapter;

import java.io.File;

/**
 * @author calle
 */
public interface IPersistenciaArquivos {



    public void gravar(File file);

    public File ler(String caminho);
}
