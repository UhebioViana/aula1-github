package C.EstruturaRepetitiva;

import java.util.Scanner;

public class ExerciciosForWhile
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		
		/*
		// quest�o 1 - impares
		int rep = sc.nextInt();
		
		for(int i = 0; i <= rep; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}		
		*/
		
		/*
		// quest�o 2 
		int rep = sc.nextInt();		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < rep; i++)
		{
			int x = sc.nextInt();
			if(x >= 10 && x <=20)
			{
				in++;
			}
			else
			{
				out++;
			}			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		*/
		
		/*
		// quest�o 3 - m�dia
		int rep = sc.nextInt();		
		
		for(int i = 0; i < rep; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble(); 
				double n3 = sc.nextDouble();
				
				double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
				
				System.out.printf("%.1f\n", media);
			}
		}
		*/
		
		/*
		// quest�o 4 - n�meros pares
		int rep = sc.nextInt();
		
		for(int i = 0; i < rep; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b == 0)
			{
				System.out.println("divis�o imposs�vel");
			}
			else
			{
				System.out.println(a / (float) b);
			}
		}
		*/
		
		/*
		// quest�o 5 - fatorial
		int N = sc.nextInt();
		int fatorial = 1;
		
		if(N == 0 || N == 1)
		{
			fatorial = 1;
		}
		else
		{
			while(N != 0)
			{
				fatorial = fatorial * N;
				N--;
			}
		}
		
		System.out.println(fatorial);
		*/
		
		/*
		// quest�o 6 - divisores
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++)
		{
			if(N % i == 0)
			{
				System.out.println(i);
			}
		}
		*/
		
		/*
		// quest�o 7 - dobro e triplo
		int A = sc.nextInt();
		
		for(int i = 1; i <= A; i++)
		{
			int normal = i;
			int dobro = i * i;
			int triplo = i * i * i;
			
			System.out.println(normal + " " + dobro + " " + triplo);
		}
		*/
		
		sc.close();
	}
}
