
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Rodrigo");
		String nomeGerente = gerente.getNome();
		
		System.out.println(nomeGerente);

	}

}
