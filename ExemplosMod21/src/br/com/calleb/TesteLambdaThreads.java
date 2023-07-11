package br.com.calleb;

/**
 * @author calle
 */
public class TesteLambdaThreads {

    public static void main(String[] args) {

        Runnable rLambda = () -> System.out.println("Executando comum");
        new Thread(rLambda).start();

        new Thread(() ->System.out.println("Executando Lambda 1")).start();
    }
}
