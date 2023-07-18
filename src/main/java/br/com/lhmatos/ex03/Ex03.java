package br.com.lhmatos.ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {
	public static int contarParesComDiferenca(int k, int[] arr) {

		int count = 0;
		Map<Integer, Integer> freqMap = new HashMap<>();


		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}


		for (int num : arr) {
			int alvo1 = num + k;
			int alvo2 = num - k;

			if (freqMap.containsKey(alvo1)) {
				count += freqMap.get(alvo1);
			}
			if (freqMap.containsKey(alvo2) && alvo2 != num) {
				count += freqMap.get(alvo2);
			}
		}

		return count / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de k:");
		int k = scanner.nextInt();

		System.out.print("Digite o tamanho do array:");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Digite os elementos do array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int numPares = contarParesComDiferenca(k, arr);
		System.out.println("Número de pares com diferença igual a " + k + ": " + numPares);

	}
}
