public class Carrinho {

    private String cliente;
    private CarrinhoEstadoAdicionar estado;

    public Carrinho(){
        this.estado = CarrinhoEstadoAdicionar.getInstance();
    }

    public void setEstado(CarrinhoEstadoAdicionar estado){
        this.estado = estado;
    }


    public void limparCarrinho() {
    }

    public int getQuantidadeDeItens() {
    }

    public void adicionarItem(Produto produto1, int i) {
    }

    public void aplicarDesconto(int i) {
    }

    public double getValorTotal() {
    }

    public void removerItem(Produto produto1) {
    }
}
