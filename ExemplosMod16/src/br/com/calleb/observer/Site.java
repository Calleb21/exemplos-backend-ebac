package br.com.calleb.observer;

public class Site implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo noticía via online! " + subject.toString());
    }
}
