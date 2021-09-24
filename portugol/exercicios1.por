programa
{
	funcao inicio()
	{ 
		cadeia nome
		inteiro anoNascimento 
		inteiro diaNascimento
		inteiro mesNascimento
		inteiro anoAtual
		inteiro mesesVividos
		inteiro diasVividos 
		escreva("qual o seu nome ")
		leia(nome)
		escreva("qual ano voce nasceu? ")
		leia(anoNascimento)
		escreva("qual mes voce nasceu? ")
		leia(mesNascimento)
		escreva("qual dia voce nasceu ")
		leia(diaNascimento)
		escreva("qual o ano atual? ")
		leia(anoAtual)
		mesesVividos= (anoAtual-anoNascimento)*12+mesNascimento
		diasVividos= mesesVividos*30

		escreva("esses são os totais de dias que você está vivo até hoje"+diasVividos)
	
		
	}
	

	}
	
	

		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */