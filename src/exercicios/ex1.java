package exercicios;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		System.out.println("Os numeros de 1000 a 1999 que divididos por 11 dão resto 5 são: ");
		for (i=1000; i<=1999; i++ )
		{
			n=i%11;
			if (n==5)
			{
				System.out.println(i);
			}
		}

	}

}
