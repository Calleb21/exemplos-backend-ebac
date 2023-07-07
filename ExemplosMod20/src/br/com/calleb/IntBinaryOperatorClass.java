package br.com.calleb;

import java.util.function.IntBinaryOperator;

/**
 * @author calle
 */
public class IntBinaryOperatorClass implements IntBinaryOperator {

    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}
