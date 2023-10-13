package controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CtrlHash {
	Scanner sc=new Scanner(System.in);
	public void inserirNome(HashMap<String, Integer> tabela) {
		// TODO Auto-generated method stub
		
		String nome;
		String opcao="s";
		int i=26;
		System.out.println("Novo nome para inserir: ");
		while(opcao.equals("s")|opcao.equals("S")) {
			nome=sc.next();
			tabela.put(nome, i);
			System.out.println("Deseja inserir outro nome? S/N");
			opcao=sc.next();
		}
	}

	public boolean pesquisarNome(HashMap<String, Integer> tabela) {
		// TODO Auto-generated method stub
		System.out.println("Nome para pesquisar: ");
		String nome=sc.next();
		return tabela.containsKey(nome);
	}

	public void remover(HashMap<String, Integer> tabela) {
		// TODO Auto-generated method stub
		String opcao="s";
		while(opcao.equals("s")) {
			System.out.println("Nome que deseja remover:");
			String nome=sc.next();
			tabela.remove(nome);
			System.out.println("Deseja remover outro nome? s/n");
			opcao=sc.next();
		}
	}

	public String verificarCheia(HashMap<String, Integer> tabela, int tamanhoOriginal) {
		// TODO Auto-generated method stub
		int tamanhoTabela=tabela.size();
		if(tamanhoTabela >= tamanhoOriginal) return "A matriz esta cheia";
		else return "A matriz nao esta cheia";
	}

	public void imprimir(HashMap<String, Integer> tabela) {
		// TODO Auto-generated method stub
		Map<String, Integer> ordemAlfa = new TreeMap<String, Integer>(tabela);
		ordemAlfa = new TreeMap<String, Integer>(tabela);
	    ordemAlfa.keySet().forEach(System.out::println);
	}

}
