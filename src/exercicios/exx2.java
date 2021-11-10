package exercicios;

import java.util.Scanner;

public class exx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int i,x,p=0,im=0;
		for (i=1; i<=10; i++ )
		{
			System.out.println("Digite o numero: ");
			x=leia.nextInt();
			if (x%2==0)
			{
				p++;
			}
			else
			{
				im++;
			}
		}
		System.out.println("Par: " + p + "\nImpar: "+ im);
		leia.close();
	}
}
