public class Fabricante {
    private int codigo;
    private String nome;

    public Fabricante(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // getters e setters

    @Override
    public String toString() {
        return "Fabricante [codigo=" + codigo + ", nome=" + nome + "]";
    }
}
