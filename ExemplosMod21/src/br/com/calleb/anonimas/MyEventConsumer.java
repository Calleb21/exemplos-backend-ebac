package br.com.calleb.anonimas;

/**
 * @author calle
 */
@FunctionalInterface
public interface MyEventConsumer {

    public void consumer(Object value);
    default void calcular() {

    }
}
