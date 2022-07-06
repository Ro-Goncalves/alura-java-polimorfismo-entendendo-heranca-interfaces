
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Rodrigo");
		gerente.setSalario(5000);
		String nomeGerente = gerente.getNome();
		
		System.out.println(nomeGerente);
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.setNome("Funcionário Nome");
		//funcionario.setSalario(2000);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		//Criando um gerente com o tipo mais generico. Ao contrário não funciona
		//Nesse caso ele criará um funcionario, o copilador olha o tipo
		Funcionario fakeGerente = new Gerente();
		
		//Não da, pois não está no funcionario
		//fakeGerente.setSenha();
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		//controle.registra(funcionario);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());

	}

}
