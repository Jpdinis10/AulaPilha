package com.example.aulapilha20.pilha;

public class Pilha {
    private int quantidadeItens;
    private Object[] pratos;
    public Pilha(int capacidade) {
        if (capacidade<quantidadeItens) {
            System.out.println("A Pilha está cheia, não é possivel adicionar mais pratos!");
        }
        this.pratos = new Object[capacidade];
        this.quantidadeItens = 0;
    }
    public void empilhar(Object elemento) {
        pratos[quantidadeItens] = elemento;
        quantidadeItens++;
    }
    public Object desempilhar() {
        if (quantidadeItens == 0) {
            System.out.println("Sua pilha está vazia!");
        }
        Object elemento = pratos[quantidadeItens - 1];
        pratos[quantidadeItens - 1] = null;
        quantidadeItens--;
        return elemento;
    }
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public void mostrarPilha() {
        for (int i = 0; i < quantidadeItens; i++)
        {
            System.out.print(pratos[i] + " ");
        }
        System.out.println();
    }
}


