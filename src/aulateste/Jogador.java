package aulateste;

public class Jogador extends Pessoa{
    
    String posicao;
    
    public Jogador(){
        super.criarPessoa();
        System.out.println("Posição: ");
        this.posicao = this.sc.next();
    }
}