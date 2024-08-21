package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    private int idPedido;
    protected List<String> itens;
    private float total;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public List<String> getItens() {
        return itens;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public float getTotal() {
        return total;
    }

    public void calcularTotal() {
        // Implementação padrão para calcular o total com base em itens
        total = itens.size() * 10.0f; // Exemplo simples
    }

    public void processarPedido() {
        validarPedido();
        calcularTotal();
        enviarPedido();
    }

    public abstract void validarPedido();
    public abstract void enviarPedido();

    public String getResumo() {
        return "Pedido{" +
                "id=" + idPedido +
                ", total=" + total +
                '}';
    }
}