package aulateste;

import java.util.Scanner;

public class Pessoa {
    
    String nomePessoa;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarPessoa(){
        System.out.println("Nome: ");
        this.nomePessoa = sc.next();
    }
    
}
