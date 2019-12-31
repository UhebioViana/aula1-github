package B.EstruturaCondicional;

import java.util.Scanner;

public class EstruturaIFElse
{
	public static void main(String[] args)
	{
		// Estrutura condicional simples
		// Se acondição for verdadeira executa o bloco, se for falsa pula o bloco
		int idade;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		
		if(idade > 18)
		{
			System.out.println("Maior de idade!!!");
		}
		
		// ***************************************************************************		
		// Estrutura condicional composta
		// Se a condição for verdadeira executa o bloco true, se for falsa executa o bloco false
		if(idade > 18)
		{
			System.out.println("Maior de idade!!!");
		}
		else
		{
			System.out.println("Menor de idade!!!");
		}
		
		// ***************************************************************************
		
		// Estrutura condicional múltipla
		if(idade > 18)
		{
			System.out.println("Maior de idade!!!");
		}
		else if(idade == 18)
		{
			System.out.println("Adolescente!!!");
		}
		else
		{
			System.out.println("Menor de idade!!!");
		}
		
		sc.close();
		
	}

}
