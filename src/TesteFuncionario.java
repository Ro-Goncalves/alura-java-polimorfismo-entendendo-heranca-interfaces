
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Rodrigo Gonçalves");
		funcionario.setCpf("123.123.123-12");
		funcionario.setSalario(26000.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}
