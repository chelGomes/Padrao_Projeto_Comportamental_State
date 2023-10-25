public class Carrinho {

    private String cliente;
    private CarrinhoEstadoAdicionar estado;

    public Carrinho(){
        this.estado = CarrinhoEstadoAdicionar.getInstance();
    }

    public void setEstado(CarrinhoEstadoAdicionar estado){
        this.estado = estado;
    }


}
