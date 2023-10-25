import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarrinhoTest {

    Carrinho carrinho;

    @BeforeEach
    public void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    public void deveAdicionarItemAoCarrinho() {
        Produto produto = new Produto("Produto 1", 10.0);
        carrinho.adicionarItem(produto, 2);
        assertEquals(2, carrinho.getQuantidadeDeItens());
        assertEquals(20.0, carrinho.getValorTotal(), 0.001);
    }

    @Test
    public void deveRemoverItemDoCarrinho() {
        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 15.0);

        carrinho.adicionarItem(produto1, 2);
        carrinho.adicionarItem(produto2, 1);
        carrinho.removerItem(produto1);

        assertEquals(1, carrinho.getQuantidadeDeItens());
        assertEquals(15.0, carrinho.getValorTotal(), 0.001);
    }

    @Test
    public void naoDeveAdicionarItemComQuantidadeNegativa() {
        Produto produto = new Produto("Produto 1", 10.0);
        assertThrows(IllegalArgumentException.class, () -> carrinho.adicionarItem(produto, -2));
    }

    @Test
    public void deveLimparCarrinho() {
        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 15.0);

        carrinho.adicionarItem(produto1, 2);
        carrinho.adicionarItem(produto2, 1);

        carrinho.limparCarrinho();

        assertEquals(0, carrinho.getQuantidadeDeItens());
        assertEquals(0.0, carrinho.getValorTotal(), 0.001);
    }

    @Test
    public void deveCalcularDescontoNoCarrinho() {
        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 15.0);

        carrinho.adicionarItem(produto1, 2);
        carrinho.adicionarItem(produto2, 1);

        carrinho.aplicarDesconto(10);

        assertEquals(3, carrinho.getQuantidadeDeItens());
        assertEquals(31.5, carrinho.getValorTotal(), 0.001);
    }

    @Test
    public void naoDeveAplicarDescontoNegativo() {
        Produto produto = new Produto("Produto 1", 10.0);
        carrinho.adicionarItem(produto, 2);
        assertThrows(IllegalArgumentException.class, () -> carrinho.aplicarDesconto(-10));
    }

}
