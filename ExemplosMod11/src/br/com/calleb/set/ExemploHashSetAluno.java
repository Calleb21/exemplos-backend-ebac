package br.com.calleb.set;

import br.com.calleb.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

/**
 * @author calle
 */
public class ExemploHashSetAluno {

    public static void main(String[] args) {
        exemploSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("\n****** exemploRemover ******");
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("João da Silva", "linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno e = new Aluno("Teste", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }

    private static void exemploConsultando() {
        System.out.println("\n****** exemploConsultando ******");
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("João da Silva", "linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno e = new Aluno("Teste", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente o equals e hashcode
     */
    private static void exemploSimples() {
        System.out.println("****** exemploSimples ******");
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("João da Silva", "linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
