package questao3;

import java.util.ArrayList;
import java.util.List;

class Pais {
    private String nome;
    private List<Pais> fronteiras;

    public Pais(String nome) {
        this.nome = nome;
        this.fronteiras = new ArrayList<>();
    }

    public void adicionarFronteira(Pais pais) {
        fronteiras.add(pais);
    }

    public String getNome() {
        return nome;
    }

    public List <Pais> getFronteiras() {
        return fronteiras;
    }
}
