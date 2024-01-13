package anotacao;

import java.lang.annotation.*;

/**
 * Description of TipoChave
 * Created by calle on 12/01/2024.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
