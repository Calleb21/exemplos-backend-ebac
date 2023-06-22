package br.com.calleb.generic;

/**
 * @author calle
 */
public class ExemploGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Teste", 10L);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(10L, 11);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
