package br.com.calleb.observer;

public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo notícia via TV! " + subject.toString());
    }
}
