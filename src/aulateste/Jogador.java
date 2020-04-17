package aulateste;

public class Jogador extends Pessoa{
    
    String posicao;
    
    public Jogador(){
        super.criarPessoa();
        this.posicao = this.sc.next();
    }
}