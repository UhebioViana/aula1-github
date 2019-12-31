package C.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Quando usar o for => quando se sabe a quantidade de repeti��es que ser� feita
 * sintaxe
 * for(inicio; condi��o; incremento)
 * {
 * 		comandos1;
 * 		comandos2; 
 * }
 * 
 * inicio => executado apenas a primeira vez
 * condi��o => V (executa e teste) F (sai do la�o)
 * incremento => executa toda vez depois de voltar
 *  
*/
public class EstruturaFor
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		int repeticoes;
		int soma = 0;
		
		repeticoes = sc.nextInt();
		for(int i = 0; i < repeticoes; i++)
		{
			int y = sc.nextInt();			 
			soma += y; 
		}
			
		System.out.println(soma);
	}

}
