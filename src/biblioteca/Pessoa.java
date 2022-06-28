package biblioteca;

public class Pessoa {
	/*
	 * Quanto existir algum erro, iremos retornar o c�digo 999 no inicio da String 
	 */
	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public String setNome(String nome) {
		if(nome.contains(" ")) {
			return "999@Nome Inv�lido, inserir um novo";
		} else {
			this.nome = nome;
			return "000@Nome gravado.";
		}
		
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
