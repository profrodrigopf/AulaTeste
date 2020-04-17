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
        
        System.out.println("Adicionar jogador?");
        System.out.println("Digite 1 para sim");
        System.out.println("Digite 2 para não");
        int addJogador = sc.nextInt();
        
        
    }
    
    public void criarTime(){
        
    }
    
    public void adicionarJogador(Jogador jogador){
        this.jogador.add(jogador);
    }
    
    public void exibirTime(){
        System.out.println("Time: "+ this.nomeTime);
        
        for(int i = 1; i <= this.jogador.size(); i++){
            System.out.println("Nome: " + jogador);
        }
    }
    
}
