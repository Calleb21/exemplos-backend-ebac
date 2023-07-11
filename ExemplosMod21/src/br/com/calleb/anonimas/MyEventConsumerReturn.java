package br.com.calleb.anonimas;

/**
 * @author calle
 */
@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);
}
