package controller;

import java.util.Arrays;
import java.util.Scanner;

import model.Hash;

public class CtrlHash {
	Scanner sc=new Scanner(System.in);
	int qntNomes=26;
	Hash []tabela=new Hash[qntNomes];
	
	
	public CtrlHash() {
		for(int i=0;i<qntNomes;i++) {
			tabela[i]=new Hash();
		}
	}
	
	public void inserirNome() {
		String[] listaNomes = {
	            "Isaac", "Zachary", "Michael", "Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace",
	            "Hannah", "Linda", "Nancy", "Oliver", "Pamela", "Quincy", "Rachel", "Samuel", "Tina",
	            "Ulysses", "Victoria", "Walter", "Xena", "Yvonne", "Roberto", "Wesley"
	        };
		
		for(int i=0;i<qntNomes;i++) {
			tabela[i].nome=listaNomes[i];
			tabela[i].chave=qntDeLetras(tabela[i].nome);
		}
		ordemAlfa();
	}
	
	public void inserirNovoNome() {
		if(cheia()) {
			System.out.println("A tabela esta cheia!");
			return;
		}
		System.out.println("Nome:");
		String nome=sc.next();
		for(int i=0;i<qntNomes;i++) {
			if(tabela[i].nome.equals("")) {
				tabela[i].nome=nome;
				tabela[i].chave=qntNomes;
				break;
			}
		}
		ordemAlfa();
	}
	
	public void pesquisarNome(String nome){
		for(Hash nomeTabela:tabela) {
			if(nomeTabela.nome.equals(nome)) {
				System.out.println("O nome esta na lista!");
				return;
			}
		}
		System.out.println("O nome nao esta na lista");
	}
	
	public void remover(String nome) {
		for(int i=0;i<qntNomes;i++) {
			if(tabela[i].nome.equals(nome)) {
				tabela[i].nome="";
				tabela[i].chave=0;
				return;
			}
		}
		System.out.println("O nome não existe na tabela!");
	}
	
	private int qntDeLetras(String nome) {
		// TODO Auto-generated method stub
		if(nome.equals("")) return 0;
		
		char []nomeChar=nome.toCharArray();
		return nomeChar.length;
	}

	public void ordemAlfa() {
		Arrays.sort(tabela, (p1, p2) -> p1.nome.compareTo(p2.nome));
	}
	
	public void imprimir() {
		for(Hash hashTabela:tabela) {
			if(!hashTabela.nome.equals("")) System.out.println("Chave: "+hashTabela.chave+"; nome: "+hashTabela.nome);
		}
	}
	
	public boolean cheia() {
		for(Hash hashTabela:tabela) {
			if(hashTabela.nome.equals("")) return false;
		}
		return true;
	}
}