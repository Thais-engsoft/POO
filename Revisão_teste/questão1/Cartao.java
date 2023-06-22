public class Cartao extends Pagamentos{
    private String num_cartao;
    private String bandeira;
    private int cvv;

    public Cartao(String banco, String nome, double cpf, String num_cartao, String bandeira, int cvv) {
        super(nome, cpf);
        this.num_cartao = num_cartao;
        this.bandeira = bandeira;
        this.cvv = cvv;
    }

    public String getNum_cartao() {
        return num_cartao;
    }

    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    
}
