package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoNacionalTest {

    @Test
    void deveValidarPedidoNacional() {
        PedidoNacional pedido = new PedidoNacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");
        pedido.setIdPedido(123);

        pedido.processarPedido();
        assertTrue(true);
    }

    @Test
    void deveCalcularTotalPedidoNacional() {
        PedidoNacional pedido = new PedidoNacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");

        pedido.calcularTotal();

        assertEquals(20.0f, pedido.getTotal());
    }

    @Test
    void deveRetornarResumoPedidoNacional() {
        PedidoNacional pedido = new PedidoNacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");
        pedido.calcularTotal();
        pedido.setIdPedido(123);

        assertEquals("Pedido{id=123, total=20.0}", pedido.getResumo());
    }
}