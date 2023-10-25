public class CarrinhoEstadoRemover extends CarrinhoEstado{
    private CarrinhoEstadoRemover() {};
    private static CarrinhoEstadoRemover instance = new CarrinhoEstadoRemover();
    public static CarrinhoEstadoRemover getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Remover";
    }

    @Override
    public String CarrinhoEstado() {
        return null;
    }
}
