package biblioteca;

public class TestaClasses {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Escritor escritor = new Escritor();
		String setNome;		
		
		System.out.println("Testando Valida��o Espa�o: Leitor - Pessoa");
		setNome = leitor.setNome("Rodrigo Gon�alves");			
		String[] retornoSetNome = setNome.split("@");
		
		if(retornoSetNome[0].equals("999")) {
			System.out.println("Mensagem de erro: " + retornoSetNome[1]);
			System.out.println("Nome inserido: " + leitor.getNome());
		} 
		
		System.out.println("");
		System.out.println("Inser��o Correta: Leitor-Pessoa");	
		leitor.setNome("Rodrigo");
		leitor.setSobrenome("Gon�alves");
		
		System.out.println("Atributos Leitor-Pessoa: Nome - " + leitor.getNome() + "; Sobrenome - " + leitor.getSobrenome());
		
		System.out.println("Inser��o Correta: Leitor");
		leitor.setStatus("Ativo");
		leitor.setSenha("1234");
		
		System.out.println("Atributos Leitor: Senha - " + leitor.getSenha() + "; Status - " + leitor.getStatus());
		
		System.out.println("");
		System.out.println("Inser��o Correta: Escritor-Pessoa");	
		escritor.setNome("Arthur");
		escritor.setSobrenome("Connan Doyle");
		
		System.out.println("Atributos Escritor-Pessoa: Nome - " + escritor.getNome() + "; Sobrenome - " + escritor.getSobrenome());
		
		System.out.println("Inser��o Correta: Ecritor");
		escritor.setPossuiReview(true);
		escritor.setNumeroDeLivros(10);
		
		System.out.println("Atributos Escritor: Possui Review - " + escritor.isPossuiReview() + "; Numero De Livros - " + escritor.getNumeroDeLivros());

	}

}
