public class GrupoProduto {
    private int codigo;
    private String nome;

    public GrupoProduto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // getters e setters

    @Override
    public String toString() {
        return "GrupoProduto [codigo=" + codigo + ", nome=" + nome + "]";
    }
}
