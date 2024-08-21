package org.example;

public class PedidoNacional extends Pedido {
    @Override
    public void validarPedido() {
        // Validação específica para pedidos nacionais
        System.out.println("Validando pedido nacional...");
    }

    @Override
    public void enviarPedido() {
        // Envio específico para pedidos nacionais
        System.out.println("Enviando pedido nacional...");
    }
}