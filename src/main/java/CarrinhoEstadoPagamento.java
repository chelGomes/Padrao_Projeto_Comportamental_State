public class CarrinhoEstadoPagamento extends CarrinhoEstado {
    private static CarrinhoEstadoPagamento instance = new CarrinhoEstadoPagamento();
    public static CarrinhoEstadoAdicionar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pagamento";
    }

    @Override
    public String CarrinhoEstado() {
        return null;
    }
}
