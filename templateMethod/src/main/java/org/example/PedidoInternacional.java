package org.example;

public class PedidoInternacional extends Pedido {
    @Override
    public void validarPedido() {
        // Validação específica para pedidos internacionais
        System.out.println("Validando pedido internacional...");
    }

    @Override
    public void enviarPedido() {
        // Envio específico para pedidos internacionais
        System.out.println("Enviando pedido internacional...");
    }
}