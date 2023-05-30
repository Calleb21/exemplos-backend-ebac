package br.com.calleb.abstratas;

/**
 * @author calle
 */
public class Programa {

    public static void main(String[] args) {

        Assalariado assalariado = new Assalariado();
        System.out.println("\n****** Assalariado ******");
        assalariado.setCpf("1");
        assalariado.setNome("Calleb");
        assalariado.setSobrenome("Camargo");
        assalariado.setSalario(100d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        System.out.println("\n****** Comissionado ******");
        comissionado.setCpf("2");
        comissionado.setNome("Calleb2");
        comissionado.setSobrenome("Camargo2");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        System.out.println("\n****** Comissionado ******");
        horista.setCpf("23");
        horista.setNome("Calleb23");
        horista.setSobrenome("Camargo23");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof  Horista) {
            Horista hr = (Horista) empregado;
            System.out.println(hr.getPrecoHora());
        }
        empregado.imorimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " tem salário R$:" + empregado.vencimento());
    }
}
