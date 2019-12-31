package C.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Quando usar o while => quando não se sabe a quantidade de repetições que será feita
 * sintaxe
 * while (condição)
 * {
 * 		comandos;
 * 		comandos;
 * }
 * 
 * V = executa e testa novamente
 * F = sai do laço
*/

public class EstruturaWhile
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, soma = 0;
				
		x = sc.nextInt(); // recebe um valor 
		
		while (x != 0) // se for diferente de 0 entra no laço se for igual sai do laço
		{ 
 			soma += x; // soma recebe o seu valor + o valor de x	
			x = sc.nextInt(); // recebe um novo valor
		}
				
		// exibe o valor da variável soma 
		System.out.println(soma);

		sc.close();
	}

}
