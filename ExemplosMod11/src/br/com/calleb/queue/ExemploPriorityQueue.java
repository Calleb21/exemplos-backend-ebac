package br.com.calleb.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Possui ordenação natural
 *
 * @author calle
 */

public class ExemploPriorityQueue {

    public static void main(String[] args) {
        //Ordenção Natural
        Queue<String> queue= new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
