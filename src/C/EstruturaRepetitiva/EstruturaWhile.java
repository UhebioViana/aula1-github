package C.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Quando usar o while => quando n�o se sabe a quantidade de repeti��es que ser� feita
 * sintaxe
 * while (condi��o)
 * {
 * 		comandos;
 * 		comandos;
 * }
 * 
 * V = executa e testa novamente
 * F = sai do la�o
*/

public class EstruturaWhile
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, soma = 0;
				
		x = sc.nextInt(); // recebe um valor 
		
		while (x != 0) // se for diferente de 0 entra no la�o se for igual sai do la�o
		{ 
 			soma += x; // soma recebe o seu valor + o valor de x	
			x = sc.nextInt(); // recebe um novo valor
		}
				
		// exibe o valor da vari�vel soma 
		System.out.println(soma);

		sc.close();
	}

}
