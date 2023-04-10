package lPIaula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	private Scanner teclado = new Scanner(System.in);

	public int lerInt(String mensagem) {
		System.out.println(mensagem);
		int valor;
		try {
			valor = teclado.nextInt();

		} catch (InputMismatchException excecao) {
			valor = 0;
		}
		teclado.nextLine();
		return valor;
	}
}
