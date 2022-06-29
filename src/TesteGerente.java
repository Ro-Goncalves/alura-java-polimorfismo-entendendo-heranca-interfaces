
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Rodrigo Gon�alves");
		gerente.setCpf("123.123.123-12");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		
		boolean autentica = gerente.autentica(222);		
		System.out.println(autentica);
		
		gerente.setSenha(222);
		autentica = gerente.autentica(222);		
		System.out.println(autentica);
		
		System.out.println(gerente.getBonificacao());

	}

}
