public class Main
{
    public static void main(String[] args)
    {
        Banco banco = new Banco("Santander");

        Conta cc = new ContaCorrente(new Cliente("Roberto", "Firmino",
                "12345678901", 35));
        Conta cp = new ContaPoupanca(new Cliente("Allison", "da Silva",
                "98765432110", 25));
        Conta cc2 = new ContaCorrente(new Cliente("Sadio", "Mane",
                "65498731021", 29));
        Conta cp2 = new ContaPoupanca(new Cliente("Mohammed", "Salah",
                "21198547630", 32));

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cp2);

        cc.depositar(100);
        cc2.depositar(500);

        cc.transferir(cp, 50);
        cc2.transferir(cp2, 100);

        cc2.sacar(150);

        banco.exibirContas();
        System.out.println();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();
    }
}
