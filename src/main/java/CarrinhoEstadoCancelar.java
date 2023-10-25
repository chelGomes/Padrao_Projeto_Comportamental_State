public class CarrinhoEstadoCancelar extends CarrinhoEstado{
    private CarrinhoEstadoCancelar() {};
    private static CarrinhoEstadoCancelar instance = new CarrinhoEstadoCancelar();


    public String getEstado() {
        return "Cancelado";
    }

    public boolean remover(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoCancelar.getInstance());
        return true;
    }

    public static CarrinhoEstadoAdicionar getInstance() {
        return instance;
    }

    public boolean concluir(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoConcluir.getInstance());
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

    public boolean enviar(Carrinho carrinho) {
        carrinho.setEstado(CarrinhoEstadoEnviar.getInstance());
        return true;
    }
}
