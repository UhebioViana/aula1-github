package B.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadorTernario
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double preco, desconto;
				
		// sintaxe 
		// (condição) ? verdaeiro : falso;
		
		// exemplo		
		//System.out.println((2 < 5) ? 1 : 0);
		
		System.out.println("Insira uma valor: ");
		preco = sc.nextDouble();
		
		/*
		// usando if else
		if(preco < 20.00)
		{
			desconto = preco * 0.05;
		}
		else 
		{
			desconto = preco * 0.10;
		}
		
		System.out.println(desconto);		
		*/
		
		// usando o operador ternário
		// se a condição for verdadeira o valor da primeira equação é atribuido para a variável desconto, se for falso atribui a segunda equação 
		desconto = (preco <= 20.00) ? preco * 0.05 : preco * 0.10;
		
		System.out.println(desconto);
		
		sc.close();		
	}

}
