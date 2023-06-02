public class Fornecedor {
    private int codigo;
    private String nome;

    public Fornecedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // getters e setters

    @Override
    public String toString() {
        return "Fornecedor [codigo=" + codigo + ", nome=" + nome + "]";
    }
}
