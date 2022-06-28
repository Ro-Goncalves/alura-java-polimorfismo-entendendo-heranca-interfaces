package biblioteca;

public class Leitor extends Pessoa{
	private String senha;
	private String status; //Ativo;Inativo
	
	
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
	
	
}
