package br.com.calleb;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TesteLambda {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        intBinaryOperator.applyAsInt(1, 1);

        IntBinaryOperator ope = new IntBinaryOperatorClass();
        int result1 = ope.applyAsInt(1, 1);
        System.out.println(result1);

        BiFunction<Integer, Integer, Integer> biFunctions = (Integer a, Integer b) -> {
            return a + b;
        };
        Integer resultBi = biFunctions.apply(10, 10);
        System.out.println(resultBi);

        BiFunction<Double, Double, String> biFunctionStr = (Double a, Double b) -> {
            Double re = a + b;
            return String.valueOf(re);
        };
        String biFuntion1 = biFunctionStr.apply(10d, 10d);
        System.out.println(biFuntion1);

        Long returLong = calcular(1L, 2L, (Long v1, Long v2) -> {
            return v1 + v2;
        } );
        System.out.println(returLong);
    }

    private static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function) {
        return function.apply(t, u);
    }
}
