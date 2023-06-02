class Livro {
    private String titulo;
    private int quantidadeExemplares;
    private int exemplaresEmprestados;
    private String tema;

    public Livro(String titulo, int quantidadeExemplares, String tema) {
        this.titulo = titulo;
        this.quantidadeExemplares = quantidadeExemplares;
        this.tema = tema;
        this.exemplaresEmprestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeExemplares() {
        return quantidadeExemplares;
    }

    public int getExemplaresEmprestados() {
        return exemplaresEmprestados;
    }

    public String getTema() {
        return tema;
    }

    public void emprestar() {
        if (exemplaresEmprestados < quantidadeExemplares) {
            exemplaresEmprestados++;
            System.out.println("Livro " + titulo + " emprestado com sucesso!");
        } else {
            System.out.println("Não há exemplares disponíveis para empréstimo do livro " + titulo);
        }
    }

    public void devolver() {
        if (exemplaresEmprestados > 0) {
            exemplaresEmprestados--;
            System.out.println("Livro " + titulo + " devolvido com sucesso!");
        } else {
            System.out.println("Não há exemplares emprestados do livro " + titulo);
        }
    }
}
