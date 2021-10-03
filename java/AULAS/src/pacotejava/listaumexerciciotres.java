package pacotejava;

import java.util.Scanner;

public class listaumexerciciotres {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int horas= 0,minutos= 0,segundos= 0;
        System.out.print("Digite a duração do evento em segundos: ");
        segundos = leia.nextInt();

        horas=(segundos/3600);
        minutos=((segundos % 3600)/60);

        segundos=((segundos % 3600) % 60 );

        System.out.println ("A duração do evento é: "+ horas +"horas"+minutos+"minutos e "+segundos+"segundos"  );






    }

}