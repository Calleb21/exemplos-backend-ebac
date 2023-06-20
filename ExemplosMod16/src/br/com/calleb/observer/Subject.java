package br.com.calleb.observer;

public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyAll(String titulo);
}
