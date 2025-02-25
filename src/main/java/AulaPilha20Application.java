package com.example.aulapilha20;

import com.example.aulapilha20.pilha.Pilha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaPilha20Application {

	public static void main(String[] args) {
		SpringApplication.run(AulaPilha20Application.class, args);

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos pratos você deseja empilhar?:");
		int quantidade = teclado.nextInt();
		Pilha pilha = new Pilha(quantidade);
		teclado.nextLine();
		for (int i = 0; i < quantidade; i++) {
			System.out.println("De um nome ao prato adicionado: " + (i + 1) + ":");
			String prato = teclado.nextLine();
			pilha.empilhar(prato);
		}
		System.out.println("Pilha final:");
		pilha.mostrarPilha();
		String resposta;
		do {
			System.out.println("Deseja desempilhar um prato? (s/n)");
			resposta = teclado.nextLine();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("Prato removido: " + pilha.desempilhar());
			} else {
				System.out.println("Pratos desejados removidos");
			}
		} while (resposta.equalsIgnoreCase("s"));
		{
			System.out.println("Resultado final da sua pilha: ");
			pilha.mostrarPilha();
		}
	}
}
