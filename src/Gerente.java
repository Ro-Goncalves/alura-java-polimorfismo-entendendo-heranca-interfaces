
public class Gerente extends Autenticavel{	
	
	public double getBonificacao() {
		System.out.println("Bonificação do gerente.");
		return super.getSalario();
	}
}
