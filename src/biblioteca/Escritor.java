package biblioteca;

public class Escritor extends Pessoa{
	private boolean possuiReview;
	private int numeroDeLivros;
	
	
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
}
