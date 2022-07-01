package biblioteca;

public class TestaSobrescrita {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Escritor escritor = new Escritor();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Rodrigo");
		pessoa.setSobrenome("Pessoa");
		pessoa.setPontuacao(100);
		
		System.out.println(pessoa.getSobrenome() + "   - " + pessoa.getNome() + 
				": Pontos com bonificação - " + pessoa.getPontuacaoComBonus());
		
		leitor.setNome("Rodrigo");
		leitor.setSobrenome("Leitor");
		leitor.setPontuacao(100);
		
		System.out.println(leitor.getSobrenome() + "   - " + leitor.getNome() + 
				": Pontos com bonificação - " + leitor.getPontuacaoComBonus());
		
		escritor.setNome("Rodrigo");
		escritor.setSobrenome("Escritor");
		escritor.setPontuacao(100);
		
		System.out.println(escritor.getSobrenome() + " - " + escritor.getNome() + 
				": Pontos com bonificação - " + escritor.getPontuacaoComBonus());

	}

}
