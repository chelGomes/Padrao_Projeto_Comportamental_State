public abstract class CarrinhoEstado {
    public abstract String CarrinhoEstado();

    public boolean adicionar(Carrinho carrinho) {
        return false;
    }

    public boolean remover(Carrinho carrinho) {
        return false;
    }

    public boolean pagamento(Carrinho carrinho) {
        return false;
    }

    public boolean cancelar(Carrinho carrinho) {
        return false;
    }

    public boolean devolucao(Carrinho carrinho) {
        return false;
    }

    public boolean enviar(Carrinho carrinho) {
        return false;
    }


}
