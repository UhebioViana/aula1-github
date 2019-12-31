/*
 * 1. Declara��o de vari�veis
 * 2. Tipos primitivos 
 * 		N�meros inteiros (byte, short, int, long)
 * 		N�meros com ponto flutuante (float, double)
 * 		Valor verdade (boolean)
 * 		Um caracter unicode (char)
 * 3. Tipo String (cadeia de caracteres => palavras e textos)
 * 4. Nomes das vari�veis
 * 5. Padr�o Camel Case (ex: opcaoaDeEscolha)
 * 6. System.out.print // System.out.printl // System.out.printf ( %f (ponto flutuante) ## %d (inteiro) ## %s (texto))
 * 7. Locale.setDefault(Locale.US)
 * 8. Concatenar v�rios elementos em um mesmo comando de escrita 
 * 9. CTRL + SHIFT + F => autoendenta��o 

*/
package A.EstruturaSequencial;

import java.util.Locale; // Necess�rio para uso do Locale.setDefault(Locale.US)

public class SaidaDados
{

	public static void main(String[] args)
	{
		// Configura��o para usar o padr�o americano
		// como o double pega o padr�o da m�quina que est� sendo usada � (o uso de virgula) � necess�rio colocar o padr�o americano (uso do ponto)
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		String nome = "Uhebio";
		String sobrenome = "Viana";
		
		// saida de dados (escrita)
		System.out.println("Ol� Mundo!!!"); // println termina com uma quebra de linha
		System.out.print ("Ol� MUndo!!!"); // print n�o quebra a linha no final da string
				
		System.out.println("\n"); // quebra de linha
		
		// Escrevendo na tela o valor da vari�vel x
		System.out.println(y);
		
		// Escrevendo na tela o valor da vari�vel y
		System.out.println(x);		
		
		// Controlando as casas decimais na vari�vel double
		System.out.printf("%.2f\n", x);
		
		// Concatenando a escrita na tela
		System.out.println("Seu nome completo: " + nome + " " + sobrenome);
		
		// Usando o printf		
		System.out.printf("Seu nome completo: %s %s\n", nome, sobrenome);
	}

}
