public class CarrinhoEstadoEnviar extends CarrinhoEstado{
    private CarrinhoEstadoEnviar() {};
    private static CarrinhoEstadoEnviar instance = new CarrinhoEstadoEnviar();
    public static CarrinhoEstadoAdicionar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    @Override
    public String CarrinhoEstado() {
        return null;
    }
}

