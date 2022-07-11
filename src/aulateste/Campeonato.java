package aulateste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Campeonato {
	
	private String nome;
	private List<Time> times = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addTime(Time time) {
		this.times.add(time);
	}
	
	public void criarCampeonato() {
		
		System.out.print("Time: ");
		this.nome = sc.next();
		
	}
	
	public void exibirCampeonato() {
		
		System.out.println("Competição: " + this.nome);
		
		System.out.println("Clubes");
		
		for(Time t : this.times) {
			System.out.println("Clube: " + t.nomeTime);
			for (Jogador j : t.jogador) {
				System.out.println("Nome: " + j.getNomePessoa());
				System.out.println("Nome: " + j.getPosicao());
			}
		}
		
	}

}
