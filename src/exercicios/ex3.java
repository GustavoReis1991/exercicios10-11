package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,x21=0,x50=0;
		Scanner leia = new Scanner (System.in);
		while (x!=-99)
		{
			System.out.println("Digite a Idade: ");
			x=leia.nextInt();
			if (0<=x && x<=21)
			{
				x21++;
			}
			if (x>=50)
			{
				x50++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: "+ x21+ "\nPessoas com mais de 50 anos: "+x50);
		leia.close();
	}

}
