package br.com.calleb.observer;

public class Jornal implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo noticía via Jornal! " + subject.toString());
    }
}
