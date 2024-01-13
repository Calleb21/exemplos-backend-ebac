package anotacao;

import java.lang.annotation.*;

/**
 * Description of ColunaTabela
 * Created by calle on 12/01/2024.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ColunaTabela {

    String dbName();

    String setJava();
}
