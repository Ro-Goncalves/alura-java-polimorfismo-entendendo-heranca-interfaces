package biblioteca;

public class TestaPolimorfismo {
		public static void main(String[] args) {
			Apresentacao apresentacao = new Apresentacao();
			
			//Criando leitor do tipo leitor
			Leitor leitorUm = new Leitor();
			leitorUm.setNome("Rodrigo");
			leitorUm.setSobrenome("Gonçalves");
			leitorUm.setPontuacao(100);	
			System.out.println(apresentacao.getApresentacao(leitorUm));
			System.out.println(leitorUm.getApresentacao());	
			System.out.println("---------------------------------------------------");
			
			//Criando leitor do tipo pessoa
			Pessoa leitorDois = new Leitor();
			leitorDois.setNome("Kamyla");
			leitorDois.setSobrenome("Forim Gonçalves");
			leitorDois.setPontuacao(200);
			System.out.println(apresentacao.getApresentacao(leitorDois));
			System.out.println(leitorDois.getApresentacao());
			System.out.println("---------------------------------------------------");
			
			System.out.println("");
			
			//Criando escritor do tipo escritor
			Escritor escritorUm = new Escritor();
			escritorUm.setNome("Rodrigo");
			escritorUm.setSobrenome("Gonçalves");
			escritorUm.setPontuacao(500);	
			System.out.println(apresentacao.getApresentacao(escritorUm));
			System.out.println(escritorUm.getApresentacao());	
			System.out.println("---------------------------------------------------");
			
			//Criando escritor do tipo pessoa
			Pessoa escritorDois = new Escritor();
			escritorDois.setNome("Kamyla");
			escritorDois.setSobrenome("Forim Gonçalves");
			escritorDois.setPontuacao(1000);	
			System.out.println(apresentacao.getApresentacao(escritorDois));
			System.out.println(escritorDois.getApresentacao());
			System.out.println("---------------------------------------------------");
			
			System.out.println("");
			
		}
}
