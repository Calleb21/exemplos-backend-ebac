public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Olá Calleb!");

        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 10, Q.45, N 371, Lt 12");
        cliente.setCodigo(143);
        System.out.println(cliente.getCodigo());

        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());
    }
}
