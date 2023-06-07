package br.com.calleb.factory;

public class Demo {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", false);
        Factory factory = getFacory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFacory(Customer cliente) {
        if (cliente.HasCompanyContract()) {
            return new  ContratosFactory();
        } else {
            return new SemContradosFactory();
        }
    }
}
