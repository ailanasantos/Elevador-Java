package aplicacao;

import java.util.Scanner;

import modelo.ReElevador;

public class Principal {
	
	public static void main(String[] args) {
		ReElevador elevador = new ReElevador(
				"Social", 10, 8, 2);
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 7) {
			menu();
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe a qtde de pessoas :");
				elevador.addPessoas(scan.nextInt());
				break;
			case 2:
				System.out.println("Informe a qtde de pessoas:");
				elevador.removerPessoas(scan.nextInt());
				break;
			case 3:
				elevador.abrirPorta();
				break;
			case 4:
				elevador.fecharPorta();
				break;
			case 5:
				System.out.println("Informe o andar:");
				elevador.moverElevador(scan.nextInt());
				break;
			case 6:
				elevador.imprimir();
				break;
				
			case 7:
				System.out.println("Finalizando o elevador. Obrigado.");
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
	}
	
	private static void menu() {
		System.out.println("\nELEVADOR");
		System.out.println("Selecione uma das opções:");
		System.out.println("1 - Adicionar Pessoas");
		System.out.println("2 - Remover Pessoas");
		System.out.println("3 - Abrir Porta");
		System.out.println("4 - Fechar Porta");
		System.out.println("5 - Mover Elevador");
		System.out.println("6 - Imprimir dados do Elevador");
		System.out.println("7 - Sair do Programa");
	}

}
