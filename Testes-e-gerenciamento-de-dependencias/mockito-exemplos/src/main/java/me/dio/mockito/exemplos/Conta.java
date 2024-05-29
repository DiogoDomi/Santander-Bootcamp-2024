package me.dio.mockito.exemplos;

public class Conta
{
    private int saldo;

    public Conta(int saldo)
    {
        this.saldo = saldo;
    }

    public void pagarBoleto(int valorAPagar)
    {
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviaCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(int valorAPagar)
    {
        if(valorAPagar > saldo)
        {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorAPagar)
    {
        this.saldo -= valorAPagar;
    }

    public void enviaCreditoParaEmissor(int valorAPagar)
    {
        //Envia credito para o emissor
    }
}