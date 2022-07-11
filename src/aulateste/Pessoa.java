package aulateste;

import java.util.Scanner;

public class Pessoa {
    
    private String nomePessoa;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarPessoa(){
        System.out.println("Nome: ");
        this.nomePessoa = sc.next();
    }

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
    
    
    
}
