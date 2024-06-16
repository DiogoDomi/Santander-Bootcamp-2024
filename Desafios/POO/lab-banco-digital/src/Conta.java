public abstract class Conta implements IConta
{
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente)
    {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0d;
        this.cliente = cliente;
    }

    public void depositar(double valorDeposito)
    {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque)
    {
        this.saldo -= valorSaque;
    }

    public void transferir(Conta contaDestino, double valorTransferencia)
    {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    public int getAgencia()
    {
        return agencia;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    @Override
    public String toString()
    {
        return  "{Cliente: " + this.cliente.getNome().concat(" ").concat(cliente.getSobrenome()) +
                ", Agencia: " + this.agencia +
                ", Numero: " + this.numero +
                ", Saldo: " + this.saldo
                +"}\n";

    }
}
