public class Main {
    public static void main(String[] args) {

        Cliente wallace = new Cliente();
        wallace.setNome("Wallace");

        Conta contacorrente = new ContaCorrente(wallace);
        Conta contapoupanca = new ContaPoupanca(wallace);

        contacorrente.depositar(200);
        contacorrente.transferir(50, contapoupanca);

        contacorrente.imprimirExtrato();
        contapoupanca.imprimirExtrato();
    }
}