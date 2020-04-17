package aulateste;

public class Programa {

    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        
        Time time1 = new Time();
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.adicionarJogador(jogador3);
        time1.exibirTime();
        
    }
    
}