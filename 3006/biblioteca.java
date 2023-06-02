import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Leitor> leitores;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        leitores = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, int quantidadeExemplares, String tema) {
        Livro livro = new Livro(titulo, quantidadeExemplares, tema);
        livros.add(livro);
        System.out.println("Livro cadastrado: " + titulo);
    }

    public void cadastrarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + nome);
    }

    public void cadastrarLeitor(String nome) {
        Leitor leitor = new Leitor(nome);
        leitores.add(leitor);
        System.out.println("Leitor cadastrado: " + nome);
    }

    public void emprestarLivro(String titulo, String nomeUsuario) {
        Livro livro = buscarLivro(titulo);
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (livro != null && usuario != null) {
            livro.emprestar();
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }

    public void devolverLivro(String titulo) {
        Livro livro = buscarLivro(titulo);

        if (livro != null) {
            livro.devolver();
        } else {
            System.out.println("Não foi possível realizar a devolução.");
        }
    }

    private Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public void mostrarMenu() {
        System.out.println("Bem-vindo à biblioteca da Unicatolica. Selecione uma opção:");
        System.out.println("Digite 1 para cadastrar livros");
        System.out.println("Digite 2 para cadastrar usuários");
        System.out.println("Digite 3 para cadastrar leitores");
        System.out.println("Digite 4 para realizar a devolução de um livro");
        System.out.println("Digite 5 para realizar o empréstimo de um livro");
        System.out.println("Digite 0 para sair");
    }
}

