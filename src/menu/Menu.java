package menu;

import java.util.Scanner;
import util.Util;

public class Menu {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void executarMenu() {
		
		mostrarMenu();
		//int opcao = pegarOpcao();
		processarOpcao(pegarOpcao());
	}
		
	
	public static void mostrarMenu() {
 		
		System.out.println("\n\t- GERADOR DE PEDIDOS 2MIL! -");
		System.out.println(Util.linhaSimples(40) + "\n" +
						"  ° Escolha uma opção: \t \n" +
							Util.linhaSimples(40) + "\n" +
						" 1- Menu pedido\t\n" +
							Util.linhaSimples(40) + "\n" +
						" 2- Menu cliente\t\n" +
							Util.linhaSimples(40) + "\n" +
						" 3- Menu produto\t\n" + 
							Util.linhaSimples(40) + "\n" 
						
							);
		
	}
		
	private static int pegarOpcao() {
		int opcao = 0;
		while (opcao < 1 || opcao > 4) {
				opcao = Util.pedirOpcaoInt("Digite uma opção válida", scanner);
		}
		return opcao;
		
	}
	
	private static void processarOpcao(int opcao) {
		switch (opcao) {
		case 1: menuPedido(); break;
		case 2: menuCliente(); break;
		case 3: menuProduto(); break; 
		}
		
		
	}
	
	private static void menuPedido() {
		System.out.println("Vacilei");
	}
	
	private static void menuCliente() {
		System.out.println("entrou");
	}
	
	private static void menuProduto() {
		System.out.println("será??");
	}
		
	
}
