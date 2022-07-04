package biblioteca;

public class Apresentacao {
	public String getApresentacao (Pessoa p) {
		System.out.println("Classe Apresentação:");
		return p.getSobrenome() + ", " + p.getNome() + ". Pontuação: " + (p.getPontuacao() + p.getPontuacaoComBonus());
	}
}
