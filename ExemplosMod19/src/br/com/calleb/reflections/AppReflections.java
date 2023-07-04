package br.com.calleb.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] args) {
        Class clazz = Produto.class;
        System.out.println(clazz);

        System.out.println();

        Produto prod = new Produto();
        Class clazz1 = prod.getClass();
        System.out.println(clazz1);

        System.out.println();

        try {
            Constructor cons = clazz.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            System.out.println();

            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields) {
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

            System.out.println();

            Method[] Method = prod1.getClass().getDeclaredMethods();
            for (Method m : Method) {
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);

                System.out.println("Executando métodos");
                if (m.getName().startsWith("get")) {
                    System.out.println(m.invoke(prod1));
                } else {
                    for (Class classesTypes : m.getParameterTypes()) {

                    }
                }
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
