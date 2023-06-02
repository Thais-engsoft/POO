import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite o nome do produto:");
        String nome = scanner.next();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(codigo, nome, preco);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public GrupoProduto cadastrarGrupoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do grupo do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite o nome do grupo do produto:");
        String nome = scanner.next();
        return new GrupoProduto(codigo, nome);
    }

    public Fornecedor cadastrarFornecedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do fornecedor:");
        int codigo = scanner.nextInt();
        System.out.println("Digite o nome do fornecedor:");
        String nome = scanner.next();
        return new Fornecedor(codigo, nome);
    }

    public Fabricante cadastrarFabricante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do fabricante:");
        int codigo = scanner.nextInt();
        System.out.println("Digite o nome do fabricante:");
        String nome = scanner.next();
        return new Fabricante(codigo, nome);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void deletarProdutoPorCodigo(int codigo) {
        Produto produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Cadastrar grupo do produto");
            System.out.println("3. Cadastrar fornecedor");
            System.out.println("4. Cadastrar fabricante");
            System.out.println("5. Listar todos os produtos");
            System.out.println("6. Buscar produto pelo código");
            System.out.println("7. Deletar produto pelo código");
            System.out.println("0. Sair");
            System.out.println("------------------");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    cadastrarGrupoProduto();
                    break;
                case 3:
                    cadastrarFornecedor();
                    break;
                case 4:
                    cadastrarFabricante();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    System.out.println("Digite o código do produto:");
                    int codigo = scanner.nextInt();
                    Produto produto = buscarProdutoPorCodigo(codigo);
                    if (produto != null) {
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Digite o código do produto:");
                    int codigoDeletar = scanner.nextInt();
                    deletarProdutoPorCodigo(codigoDeletar);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
