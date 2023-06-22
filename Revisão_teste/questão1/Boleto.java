public class Boleto extends Pagamentos{
    private String cod_barras;
    private String beneficiario;

    public Boleto(String nome, double cpf, String cod_barras, String beneficiario) {
        super(nome, cpf);
        this.cod_barras = cod_barras;
        this.beneficiario = beneficiario;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
    
    

}
