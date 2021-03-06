package biblioteca;

public class Leitor extends Pessoa implements Menus{
	private String senha;
	private String status; //Ativo;Inativo
	
	public Leitor (String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	public String getApresentacao() {
		System.out.println("Classe Leitor:");
		return super.getSobrenome() + ", " + super.getNome() + ". Pontuação: " + (super.getPontuacao() + this.getPontuacaoComBonus());
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getPontuacaoComBonus() {
		return super.getPontuacao() * 0.4;
	}
	
	@Override
	public String MenusTelaInicial() {		
		return "Perfil;Livros";
	}
}
