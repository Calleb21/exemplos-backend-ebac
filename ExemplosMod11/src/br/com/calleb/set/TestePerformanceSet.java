package br.com.calleb.set;

import br.com.calleb.domain.Aluno;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author calle
 */
public class TestePerformanceSet {

    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Aluno> hashSet = new HashSet<Aluno>();
        TreeSet<Aluno> treeSet = new TreeSet<Aluno>();
        LinkedList<Aluno> linkedList = new LinkedList<Aluno>();

        // start time
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(100 - 10) + 10;
            hashSet.add(new Aluno("João da Silva", "Linux básico", x));
        }
        // end Time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Aluno("João da Silva", "Linux básico", x));
        }

        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);

        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedList.add(new Aluno("João da Silva", "Linux básico", x));
        }

        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
    }
}
