package Ex11;

public class Pedido {

    private Produto produto;
    private int quantidade;

    private FormaPagamento formaDePagamento;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
