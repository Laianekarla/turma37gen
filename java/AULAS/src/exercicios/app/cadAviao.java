package app;

import java.util.Scanner;

import entities.aviao;


public class cadAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        aviao av1= new aviao();
        
        System.out.println("Digite a empresa aérea: ");
	    av1.empresa= leia.next();
	    System.out.println("Digite quantos funcionários terá no avião: ");
	    av1.funcionarios= leia.nextInt();
	    System.out.println("Digite quantos passageiros irão no voo:  ");
	    av1.passageiros= leia.nextInt();
	    System.out.println(
	    		"Seu voo será pela empresa "+av1.empresa
	    		+" e terá "+av1.funcionarios
	    		+" funcionários e "+av1.passageiros
	    		+" passageiros, totalizando "+av1.totalVoo()
	    		+" tripulantes e sobrando "+av1.assentosVazios()
	    		+" assentos vazios. Boa viagem!"
	    		);
	    
	   

	}
	}
	
	
