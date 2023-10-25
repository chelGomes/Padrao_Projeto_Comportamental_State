public class CarrinhoEstadoAdicionar {
    private CarrinhoEstadoAdicionar() {};
    private static CarrinhoEstadoAdicionar instance = new CarrinhoEstadoAdicionar();
    public static CarrinhoEstadoAdicionar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Adicionar Item";
    }

    public boolean pagamento(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoPagamento.getInstance());
        return true;
    }
}
