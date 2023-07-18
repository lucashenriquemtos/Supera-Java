package br.com.lhmatos.ex04;

import java.util.Scanner;

public class Ex04 {
	public static String desembaralhar(String linha) {
		int tamanho = linha.length();
		StringBuilder sb = new StringBuilder(tamanho);

		// Construir a string desembaralhada
		for (int i = tamanho / 2 - 1; i >= 0; i--) {
			sb.append(linha.charAt(i));
		}
		for (int i = tamanho - 1; i >= tamanho / 2; i--) {
			sb.append(linha.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de casos de teste:");
		int N = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite a linha a ser desembaralhada:");
			String linha = scanner.nextLine();
			String linhaDesembaralhada = desembaralhar(linha);
			System.out.println("Frase decifrada: " + linhaDesembaralhada);
		}
	}
}
