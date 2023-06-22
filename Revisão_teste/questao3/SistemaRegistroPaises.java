package questao3;

public class SistemaRegistroPaises {
    public static void main(String[] args) {
        // Criando os países
        PaisComFronteiras brasil = new PaisComFronteiras("Brasil");
        PaisComFronteiras alemanha = new PaisComFronteiras("Alemanha");

        // Definindo as fronteiras do Brasil
        brasil.adicionarFronteira(new Pais("Suriname"));
        brasil.adicionarFronteira(new Pais("Guiana"));
        brasil.adicionarFronteira(new Pais("Venezuela"));
        brasil.adicionarFronteira(new Pais("Guiana Francesa"));
        brasil.adicionarFronteira(new Pais("Colômbia"));
        brasil.adicionarFronteira(new Pais("Peru"));
        brasil.adicionarFronteira(new Pais("Bolívia"));
        brasil.adicionarFronteira(new Pais("Paraguai"));
        brasil.adicionarFronteira(new Pais("Argentina"));
        brasil.adicionarFronteira(new Pais("Uruguai"));

        // Definindo as coordenadas do Brasil
        brasil.adicionarCoordenada("Norte");
        brasil.adicionarCoordenada("Noroeste");
        brasil.adicionarCoordenada("Oeste");
        brasil.adicionarCoordenada("Sudoeste");
        brasil.adicionarCoordenada("Sul");

        // Definindo as fronteiras da Alemanha
        alemanha.adicionarFronteira(new Pais("País 1"));
        alemanha.adicionarFronteira(new Pais("País 2"));
        alemanha.adicionarFronteira(new Pais("País 3"));

        // Definindo as coordenadas da Alemanha
        alemanha.adicionarCoordenada("Norte");
        alemanha.adicionarCoordenada("Sul");

        // Exibindo as fronteiras do Brasil
        System.out.println(brasil.getNome() + " faz fronteira com:");
        for (Pais pais : brasil.getFronteiras()) {
            System.out.println("Ao " + pais.getNome());
        }

        // Exibindo as coordenadas do Brasil
        System.out.println("Coordenadas do " + brasil.getNome() + ":");
        for (String coordenada : brasil.getCoordenadas()) {
            System.out.println(coordenada);
        }
    }
}

