package B.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIfElseComposto 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		// quest�o 1 - negativo ou positivo
		int num;
		
		System.out.println("Informe um n�mero:");
		num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println("N�O NEGATIVO!!!");
		}
		else if (num < 0)
		{
			System.out.println("NEGATIVO!!!");
		}
		else
		{
			System.out.println("NULO!!!");
		}
		*/
		
		/*
		// quest�o 2 - par ou impar
		int num;
		
		System.out.println("Informe um n�mero:");
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("PAR!!!");
		}
		else
		{
			System.out.println("IMPAR!!!");
		}		
		*/
		
		/*
		// quest�o 3 - m�ltiplos
		int num1, num2;
		
		System.out.println("Informe dois n�meros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0)
		{
			System.out.println("S�o mu�ltiplos!!!!");
		}
		else
		{
			System.out.println("N�o s�o m�ltiplos!!!");
		}
		*/
		
		/*
		// quest�o 4 - dura��o de um jogo
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Informe a hora inicial:");
		horaInicial = sc.nextInt();
		System.out.println("Informe a hora final:");
		horaFinal = sc.nextInt();
		
		if(horaFinal > horaInicial)
		{
			duracao = horaFinal - horaInicial;
		}
		else
		{
			duracao = 24 - (horaInicial - horaFinal);
		}
		
		System.out.println("Duracao do jogo: " + duracao);
		*/
		
		/*
		// quest�o 5 - lanchonete
		int codigo, quantidade;
		double total = 0;
		
		System.out.println("Informe o codigo:");
		codigo = sc.nextInt();
		System.out.println("Informe a quantidade:");
		quantidade = sc.nextInt();
		
		if(codigo == 1)
		{
			System.out.println("Cachorro quante");
			total = quantidade * 4.00;
		}
		else if (codigo == 2)
		{
			System.out.println("X - Salada");
			total = quantidade * 4.50;
		}
		else if (codigo == 3)
		{
			System.out.println("X - Bacon");
			total = quantidade * 5.00;
		}
		else if (codigo == 4)
		{
			System.out.println("Torrada Simples");
			total = quantidade * 2.00;
		}
		else if(codigo == 5)
		{
			System.out.println("Refrigerante");
			total = quantidade * 1.50;
		}
		else
		{
			System.out.println("C�digo inv�lido!!!");
		}
		
		System.out.printf("Valor a pagar R$ %.2f\n", total);
		
		*/
		
		/*
		// quest�o 6 - intervalo
		
		double num;
		
		System.out.println("Informe um valor: ");
		num = sc.nextDouble();
		
		if(num >=0 && num <=25.0)
		{
			System.out.println("intervalo [0, 25]");
		}
		else if(num > 25.0 && num <=50.0)
		{
			System.out.println("intervalo (25, 50]");
		}
		else if(num > 50.0 && num <= 75.0)
		{
			System.out.println("intervalo (50, 75]");
		}
		else if(num > 75.0 && num <= 100.0)
		{
			System.out.println("intervalo (75, 100]");
		}
		else
		{
			System.out.println("Fora do intervalo!!!!");
		}
		*/
		
		/*
		// quest�o 7 - plano cartesiano 
		double x, y;
		
		System.out.println("Insira dois valores: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0 && y == 0)
		{
			System.out.println("Origem");
		}
		else if(x == 0)
		{
			System.out.println("Eixo y");
		}
		else if(y == 0)
		{
			System.out.println("Eixo x");
		}
		else if(x > 0 && y > 0)
		{
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("Q3");
		}
		else
		{
			System.out.println("Q4");
		}
		*/		
		sc.close();
	}

}
