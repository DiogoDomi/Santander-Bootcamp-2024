public interface IConta
{
    void depositar(double valorDeposito);

    void sacar(double valorSaque);

    void transferir(Conta contaDestino, double valorTransferencia);

    void imprimirExtrato();
}
