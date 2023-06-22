package questao2;

public class Rodoviario extends Transporte{
    private String placa;
    private String kmrodado;
    
    public Rodoviario(String modelo, String combustivel, String velocidade, Double cargaMax, int anoFabricacao,
            String placa, String kmrodado) {
        super(modelo, combustivel, velocidade, cargaMax, anoFabricacao);
        this.placa = placa;
        this.kmrodado = kmrodado;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getKmrodado() {
        return kmrodado;
    }
    public void setKmrodado(String kmrodado) {
        this.kmrodado = kmrodado;
    }
    
}
