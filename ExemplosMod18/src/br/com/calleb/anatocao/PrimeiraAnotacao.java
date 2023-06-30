package br.com.calleb.anatocao;

import java.lang.annotation.*;

/**
 * @author calle
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface PrimeiraAnotacao {
    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default  10d;
}
