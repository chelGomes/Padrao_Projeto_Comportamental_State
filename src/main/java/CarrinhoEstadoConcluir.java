public class CarrinhoEstadoConcluir extends CarrinhoEstado{
    private CarrinhoEstadoConcluir() {};
    private static CarrinhoEstadoConcluir instance = new CarrinhoEstadoConcluir();
    public static CarrinhoEstadoAdicionar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluido";
    }

    public boolean cancelar(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoCancelar.getInstance());
        return true;
    }

    public boolean pagamento(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoPagamento.getInstance());
        return true;
    }

    @Override
    public String CarrinhoEstado() {
        return null;
    }

    public boolean adicionar(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoAdicionar.getInstance());
        return true;
    }
}
