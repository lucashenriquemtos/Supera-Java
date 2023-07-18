package br.com.lhmatos.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de valores a serem ordenados:");
		int N = scanner.nextInt();
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		System.out.print("Digite os valores:");

		for (int i = 0; i < N; i++) {
			int valor = scanner.nextInt();
			if (valor % 2 == 0) {
				pares.add(valor);
			} else {
				impares.add(valor);
			}
		}

		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());

		System.out.println("Valores ordenados:");

		for (int par : pares) {
			System.out.println(par);
		}

		for (int impar : impares) {
			System.out.println(impar);
		}
	}
}
