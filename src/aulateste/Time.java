package aulateste;

import java.util.ArrayList;
import java.util.Scanner;

public class Time {
    
    String nomeTime;
    ArrayList <Jogador> jogador = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    
    public Time(){
        System.out.println("Time: ");
        this.nomeTime = sc.next();
        
    }
    
    public void criarTime(){
        
    }
    
    public void adicionarJogador(Jogador jogador){
        this.jogador.add(jogador);
    }
    
    public void exibirTime(){
        System.out.println("Time: "+ this.nomeTime);
        
        for(Jogador jogador : jogador){
            System.out.println("Nome: " + jogador.nomePessoa + " Posição: " + jogador.posicao);
        }
    }
    
}
