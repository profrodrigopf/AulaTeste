package aulateste;

public class Jogador extends Pessoa{
    
    private String posicao;
    
    public Jogador(){
        super.criarPessoa();
        System.out.println("Posição: ");
        this.posicao = this.sc.next();
    }

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
    
    
    
}