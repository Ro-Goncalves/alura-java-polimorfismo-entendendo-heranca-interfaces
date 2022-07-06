package biblioteca;

public class Escritor extends Pessoa{
	private boolean possuiReview;
	private int numeroDeLivros;
	
	public Escritor(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public String getApresentacao() {
		System.out.println("Classe Escritor:");
		return super.getSobrenome() + ", " + super.getNome() + ". Pontuação: " + (super.getPontuacao() + this.getPontuacaoComBonus());
	}
	
	
	public boolean isPossuiReview() {
		return possuiReview;
	}
	
	public void setPossuiReview(boolean possuiReview) {
		this.possuiReview = possuiReview;
	}
	
	public int getNumeroDeLivros() {
		return numeroDeLivros;
	}
	
	public void setNumeroDeLivros(int numeroDeLivros) {
		this.numeroDeLivros = numeroDeLivros;
	}
	
	public double getPontuacaoComBonus() {
		return ((super.getPontuacao() * 0.5) + (super.getPontuacaoComBonus() * 0.5));
	}
}
