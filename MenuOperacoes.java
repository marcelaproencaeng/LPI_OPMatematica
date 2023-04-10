package lPIaula06;

public class MenuOperacoes {
	public void mostrarMenu() {
		Teclado teclado = new Teclado();

		while (true) {

			imprimirMenu();
			int opcao = teclado.lerInt("Digite uma opção:");

			switch (opcao) {
			case 1:
				OperacaoMatematica soma = new Soma;

				break;
			case 2:
				OperacaoMatematica subtracao = new Subtracao;

				break;
			case 3:
				OperacaoMatematica multiplicacao = new Multiplicacao;
				break;
			case 4:
				OperacaoMatematica divisao = new Divisao;

				break;

			case 0:

				return;

			default:
				System.out.println("Opção inválida!");
			}

		}
	}

	private void imprimirMenu() {

		System.out.println("+---------------------------------+");
		System.out.println("|  Menu Operações                 |");
		System.out.println("+---------------------------------+");
		System.out.println("| Digite:                         |");
		System.out.println("|  [1]-Soma                       |");
		System.out.println("|  [2]-Subtração                  |");
		System.out.println("|  [3]-Multiplicação              |");
		System.out.println("|  [4]-Divisão                    |");
		System.out.println("|  [0]-Retornar                   |");
		System.out.println("+---------------------------------+");

	}

}
