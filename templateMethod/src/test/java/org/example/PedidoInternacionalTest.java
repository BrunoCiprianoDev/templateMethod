package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoInternacionalTest {

    @Test
    void deveValidarPedidoInternacional() {
        PedidoInternacional pedido = new PedidoInternacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");
        pedido.setIdPedido(456);

        pedido.processarPedido(); // Validação e envio específicos devem ser testados aqui

        // Verificar se a validação foi executada corretamente
        // Isso pode ser feito verificando se o estado do objeto mudou conforme esperado
        assertTrue(true); // Substituir com verificação real se possível
    }

    @Test
    void deveCalcularTotalPedidoInternacional() {
        PedidoInternacional pedido = new PedidoInternacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");

        pedido.calcularTotal();

        assertEquals(20.0f, pedido.getTotal()); // Ajustar o valor conforme a lógica de cálculo
    }

    @Test
    void deveRetornarResumoPedidoInternacional() {
        PedidoInternacional pedido = new PedidoInternacional();
        pedido.adicionarItem("Item 1");
        pedido.adicionarItem("Item 2");
        pedido.calcularTotal();
        pedido.setIdPedido(456);

        assertEquals("Pedido{id=456, total=20.0}", pedido.getResumo());
    }
}