
public class EditorVideo extends Funcionario{
		
	public double getBonificacao() {
		System.out.println("Bonificação do editor de vídeo");
		return (super.getBonificacao() + 100);
	}

}
