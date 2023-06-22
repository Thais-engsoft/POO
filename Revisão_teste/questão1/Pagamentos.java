//Identifique as classes, atributos, métodos e a herança entre classes em um sistema de controle de pagamentos. Os pagamentos são de diversos tipos, principalmente via boleto e cartão de crédito, mas futuramente novos tipos vão surgir no sistema.

public class Pagamentos{
    public String nome;
    private double cpf;
    public String  banco;

    public Pagamentos(String nome, double cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    
    
}