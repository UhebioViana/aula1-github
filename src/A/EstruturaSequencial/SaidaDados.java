/*
 * 1. Declaração de variáveis
 * 2. Tipos primitivos 
 * 		Números inteiros (byte, short, int, long)
 * 		Números com ponto flutuante (float, double)
 * 		Valor verdade (boolean)
 * 		Um caracter unicode (char)
 * 3. Tipo String (cadeia de caracteres => palavras e textos)
 * 4. Nomes das variáveis
 * 5. Padrão Camel Case (ex: opcaoaDeEscolha)
 * 6. System.out.print // System.out.printl // System.out.printf ( %f (ponto flutuante) ## %d (inteiro) ## %s (texto))
 * 7. Locale.setDefault(Locale.US)
 * 8. Concatenar vários elementos em um mesmo comando de escrita 
 * 9. CTRL + SHIFT + F => autoendentação 

*/
package A.EstruturaSequencial;

import java.util.Locale; // Necessário para uso do Locale.setDefault(Locale.US)

public class SaidaDados
{

	public static void main(String[] args)
	{
		// Configuração para usar o padrão americano
		// como o double pega o padrão da máquina que está sendo usada é (o uso de virgula) é necessário colocar o padrão americano (uso do ponto)
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		String nome = "Uhebio";
		String sobrenome = "Viana";
		
		// saida de dados (escrita)
		System.out.println("Olá Mundo!!!"); // println termina com uma quebra de linha
		System.out.print ("Olá MUndo!!!"); // print não quebra a linha no final da string
				
		System.out.println("\n"); // quebra de linha
		
		// Escrevendo na tela o valor da variável x
		System.out.println(y);
		
		// Escrevendo na tela o valor da variável y
		System.out.println(x);		
		
		// Controlando as casas decimais na variável double
		System.out.printf("%.2f\n", x);
		
		// Concatenando a escrita na tela
		System.out.println("Seu nome completo: " + nome + " " + sobrenome);
		
		// Usando o printf		
		System.out.printf("Seu nome completo: %s %s\n", nome, sobrenome);
	}

}
