package app;

import entities.pessoas;
public class CadAmigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		pessoas p1 = new pessoas();
		pessoas p2 = new pessoas();
		pessoas p3 = new pessoas();
		
		
		p2.nome = "Laisa";
		p2.anoNascimento = 1998;
		p3.nome = "Gaby";
		p3.anoNascimento = 2015;
		
		p1.nome = "Laiane";
		p1.email = "lannekarla03@gmail.com";
		p1.pronome = 'o';
		p1.anoNascimento = 1999;
		
		System.out.println(p1.nome);
		System.out.println(p1.nome+"sua idade é "+(2021-p1.anoNascimento));
		System.out.println(p2.nome+"sua idade é "+(2021-p2.anoNascimento));

		System.out.println(p1.nome+"sua idade é "+p1.calcularIdade());
		System.out.println(p3.nome+"sua idade é "+p3.calcularIdade(2030));

		
		
	}

}
