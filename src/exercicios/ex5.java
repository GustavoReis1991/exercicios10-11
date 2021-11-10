package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int x,soma=0;
		do
		{
			System.out.println("Digite um numero: ");
			x = leia.nextInt();
			soma=soma+x;
		}
		while (x !=0);
		System.out.println("A Soma dos valores é: "+ soma);
		leia.close();	

	}

}
