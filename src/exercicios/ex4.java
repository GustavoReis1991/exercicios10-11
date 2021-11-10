package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int i,idade,sexo,emocional,calmas=0,mnervosa=0,hagressivo=0,ocalmo=0,nervosso40=0,calmo18=0;
		i=0;
		while (i <=150)
		{
			System.out.println("Idade: ");
			idade=leia.nextInt();
			System.out.println("Sexo( 1-feminino 2-masculino 3-outros): ");
			sexo=leia.nextInt();
			System.out.println("Emocional( 1-calmo 2-nervoso 3-agressivo");
			emocional=leia.nextInt();
			if ( emocional==1)
			{
				calmas++;
			}
			if ( sexo==1 && emocional==2)
			{
				mnervosa++;
			}
			if (sexo==2 && emocional==3)
			{
				hagressivo++;
			}
			if (sexo==3 && emocional==1)
			{
				ocalmo++;
			}
			if (idade>=40 && emocional==2)
			{
				nervosso40++;
			}
			if (idade<=18 && emocional==1)
			{
				calmo18++;
			}
			i++;
				
		}
		System.out.println("Pessoas calma: "+ calmas+"\nMulheres nervosas: "+ mnervosa+"\nHomens agressivos: "+hagressivo+"\nOutros calmos: "+ocalmo+"\nNervossos com mais de 40: "+nervosso40+"\nCalmos com menos de 18: "+calmo18);
		leia.close();
	}

}
