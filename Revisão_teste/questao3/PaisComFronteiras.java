package questao3;

import java.util.ArrayList;
import java.util.List;

class PaisComFronteiras extends Pais {
    private List<String> coordenadas;

    public PaisComFronteiras(String nome) {
        super(nome);
        this.coordenadas = new ArrayList<>();
    }

    public void adicionarCoordenada(String direcao) {
        coordenadas.add(direcao);
    }

    public List<String> getCoordenadas() {
        return coordenadas;
    }
}

