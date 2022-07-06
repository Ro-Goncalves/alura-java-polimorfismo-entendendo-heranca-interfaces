package biblioteca;

public abstract class Pessoa {	
	private String nome;
	private String sobrenome;
	private double pontuacao;
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getApresentacao() {
		System.out.println("Classe Pessoa:");
		return this.sobrenome + ", " + this.nome + ". Pontuação: " + (this.getPontuacao() + this.getPontuacaoComBonus());
	}
	
		
	public abstract double getPontuacaoComBonus();
	
	public double getPontuacao() {
		return this.pontuacao;
	}
	
	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public String setNome(String nome) {
		if(nome.contains(" ")) {
			return "999@Nome Inválido, inserir um novo";
		} else {
			this.nome = nome;
			return "000@Nome gravado.";
		}
		
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
