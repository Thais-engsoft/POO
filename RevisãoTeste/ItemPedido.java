class ItemPedido {
    private String produto;
    private int quantidade;
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ItemPedido(String produto, int quantidade, double d) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }
}
