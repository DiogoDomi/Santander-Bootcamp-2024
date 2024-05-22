public class Cliente
{
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public Cliente(String nomeCliente, String sobrenomeCliente, String cpf,
                   int idade)
    {
        this.nome = nomeCliente;
        this.sobrenome = sobrenomeCliente;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public int getIdade()
    {
        return idade;
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.nome.concat(" ").concat(this.sobrenome)
                + ", CPF: " + this.cpf
                + ", Idade: " + this.idade;

    }
}
