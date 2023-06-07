package br.com.calleb.singleton;

/**
 * @author calle
 */
public class DemoSingletonPropriendadeThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread());
        Thread t2 = new Thread(new Thread());
        t1.start();
        t2.start();
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste");
            System.out.println(singletonPropriedade.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste1");
            System.out.println(singletonPropriedade.getValue());
        }
    }
}