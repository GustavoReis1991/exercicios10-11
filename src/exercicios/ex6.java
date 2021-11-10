package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int x,x3=0,i=0;
		double media=0;
		do
		{
			System.out.println("Digite um numero: ");
			x= leia.nextInt();
			if (x%3==0)
		{
				x3=x3+x;
				i++;
			}
		}
		while ( x!=0);
		if ((i-1)==0)
		{
			System.out.println("Não exise numero divisivel por 3");
		}
		else
		{
		media= (double)x3/(i-1);
		System.out.println("A media dos numeros multiplos de 3 é: "+ media);
		}
		leia.close();
	}

}
