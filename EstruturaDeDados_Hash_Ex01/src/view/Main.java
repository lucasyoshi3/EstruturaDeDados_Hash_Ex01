package view;
import java.util.HashMap;
import java.util.Scanner;

import controller.CtrlHash;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CtrlHash controle=new CtrlHash();
		HashMap<String, Integer> tabela = new HashMap<String, Integer>();
		
		System.out.println("Inserir nome: ");
//		String nome;
//		for(int i=1;i<5;i++) {
//			nome=sc.next();
//			tabela.put(nome, i);
//		}
		tabela.put("Zoe", 26);
	    tabela.put("Yara", 25);
	    tabela.put("Xavier", 24);
	    tabela.put("Wellington", 23);
	    tabela.put("Valdemar", 22);
	    tabela.put("Uberlandiano", 21);
	    tabela.put("Tayse", 20);
	    tabela.put("Sérgio", 19);
	    tabela.put("Roberto", 18);
	    tabela.put("Quentin", 17);
	    tabela.put("Patricia", 16);
	    tabela.put("Otto", 15);
	    tabela.put("Nathan", 14);
	    tabela.put("Mariana", 13);
	    tabela.put("Lais", 12);
	    tabela.put("Keila", 11);
	    tabela.put("Josuel", 10);
	    tabela.put("Iago", 9);
	    tabela.put("Heitor", 8);
	    tabela.put("Gabriel", 7);
	    tabela.put("Fabio", 6);
	    tabela.put("Edison", 5);
	    tabela.put("Daniel", 4);
	    tabela.put("Carol", 3);
	    tabela.put("Bruno", 2);
	    tabela.put("Alan", 1);
	 
//	    Map<String, Integer> ordemAlfa = new TreeMap<String, Integer>(tabela);
//	    ordemAlfa.keySet().forEach(System.out::println);
	    int opcao=1;
	    while(opcao>0 && opcao<6) {
	    	System.out.println("Selecione:\r\n"
	    			+ "1)inserir um novo nome na estrutura de dados\r\n"
		    		+ "2)pesquisar se um determinado nome consta na estrutura de dados\r\n"
		    		+ "3)remover um dado nome da estrutura de dados\r\n"
		    		+ "4)verificar se a estrutura de dados está cheia\r\n"
		    		+ "5)imprimir todos os dados da estrutura de dados\r\n"
		    		+ "qualquer numero)Fim");
		    opcao=sc.nextInt();
		    switch (opcao) {
			case 1:
				 controle.inserirNome(tabela); break;
			case 2:
				System.out.println(controle.pesquisarNome(tabela)); break;
			case 3:
				controle.remover(tabela); break;
			case 4:
				System.out.println(controle.verificarCheia(tabela,26)); break;
			case 5:
				controle.imprimir(tabela); break;
			default:
				break;
			}
	    }
//	    ordemAlfa = new TreeMap<String, Integer>(tabela);
//	    ordemAlfa.keySet().forEach(System.out::println);
	}
}
