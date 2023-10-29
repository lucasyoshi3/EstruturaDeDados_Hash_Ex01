package view;
import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

import controller.CtrlHash;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CtrlHash controle=new CtrlHash();
		int opcao=0;
		String nome;
		
		controle.inserirNome();
		while(opcao!=9) {
			System.out.println("===============================\n"
					+ "Escolha uma opcao\n"
					+ "1)Inserir novo nome;\n"
					+ "2)Pesquisar nome;\n"
					+ "3)Remover nome;\n"
					+ "4)Verificar se a estrutura esta cheia;\n"
					+ "5)Imprimir\n"
					+ "9)Fim\n"
					+ "===============================");
			opcao=sc.nextInt();
			switch (opcao) {
				case 1:
					controle.inserirNovoNome();
				break;
				case 2:
					System.out.println("Nome que deseja pesquisar:");
					nome=sc.next();
					controle.pesquisarNome(nome);
				break;
				case 3:
					System.out.println("Nome que ira remover:");
					nome=sc.next();
					controle.remover(nome);
				break;
				case 4:
					if(controle.cheia()) {
						System.out.println("Esta cheia");
					}else {
						System.out.println("Não esta cheia");
					}
				break;
				case 5:
					controle.imprimir();
				break;
			default:
				break;
			}
		}
	}
}
