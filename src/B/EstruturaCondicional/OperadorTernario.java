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
		// (condi��o) ? verdaeiro : falso;
		
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
		
		// usando o operador tern�rio
		// se a condi��o for verdadeira o valor da primeira equa��o � atribuido para a vari�vel desconto, se for falso atribui a segunda equa��o 
		desconto = (preco <= 20.00) ? preco * 0.05 : preco * 0.10;
		
		System.out.println(desconto);
		
		sc.close();		
	}

}
