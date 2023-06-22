//Modais de transporte são os modos de se realizar a locomoção de uma carga, ou seja, os tipos de transporte. Hoje, contamos com cinco possibilidades: modal rodoviário, modal ferroviário, modal hidroviário, modal dutoviário e modal aeroviário. Em um sistema de logística, uma empresa precisa gerenciar diferentes modais de transporte para realizar suas entregas. Identifique as classes, atributos, métodos e relações de herança para todos os tipos de modais. Considere que todos os modais de transporte possuem uma capacidade de carga máxima.

package questao2;

public class Transporte {
    public String modelo;
    public String combustivel;
    public String velocidade;
    public Double cargaMax;
    private int anoFabricacao;

    public Transporte(String modelo, String combustivel, String velocidade, Double cargaMax, int anoFabricacao) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.cargaMax = cargaMax;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public Double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(Double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    
}
