package biblioteca;

public class TestaMenus {

	public static void main(String[] args) {
		Leitor leitor = new Leitor("Rodrigo", "Gonçalves");
		Escritor escritor = new Escritor("Arthur", "Connan Doyle");
		
		TelaInicial ti = new TelaInicial();
		
		ti.Menus(leitor);
		ti.Menus(escritor);

	}

}
