package C.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/*
 * Quando usar o do while => quando não se sabe a quantidade de repetições que será feita
 * executa ao menos uma vez
 * 
 * sintaxe
 * do
 * {
 * 		comandos;
 * 		comandos;
 * } while(condição);
 * 
 * V = executa e testa novamente
 * F = sai do laço
 * 
*/ 
public class EstruturaDoWhile
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do
		{
			System.out.println("Digite a temperatura em celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.2f\n", F);
			
			System.out.println("Deseja repetir (s/n)");
			resp = sc.next().charAt(0); // recebe o char
			
		} while(resp != 'n'); // se for verdadeiro volta, se for falsa sai do laço
		
		
		
		sc.close();
	}

}
