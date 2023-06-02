import java.util.Scanner;


public class Sistema {
    
public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        biblioteca.mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        switch (opcao) {
            case 1:
                System.out.println("Digite o título do livro:");
                String tituloLivro = scanner.nextLine();
                System.out.println("Digite a quantidade de exemplares:");
                int quantidadeExemplares = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do teclado
                System.out.println("Digite o tema do livro:");
                String temaLivro = scanner.nextLine();
                biblioteca.cadastrarLivro(tituloLivro, quantidadeExemplares, temaLivro);
                break;
            case 2:
                System.out.println("Digite o nome do usuário:");
                String nomeUsuario = scanner.nextLine();
                biblioteca.cadastrarUsuario(nomeUsuario);
                break;
            case 3:
                System.out.println("Digite o nome do leitor:");
                String nomeLeitor = scanner.nextLine();
                biblioteca.cadastrarLeitor(nomeLeitor);
                break;
            case 4:
                System.out.println("Digite o título do livro para devolução:");
                String tituloDevolucao = scanner.nextLine();
                biblioteca.devolverLivro(tituloDevolucao);
                break;
            case 5:
                System.out.println("Digite o título do livro para empréstimo:");
                String tituloEmprestimo = scanner.nextLine();
                System.out.println("Digite o nome do usuário:");
                String nomeEmprestimo = scanner.nextLine();
                biblioteca.emprestarLivro(tituloEmprestimo, nomeEmprestimo);
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
        System.out.println();
    } while (opcao != 0);

    scanner.close();
}
}