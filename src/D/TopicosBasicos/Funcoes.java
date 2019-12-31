package D.TopicosBasicos;

import java.util.Scanner;

/*
 * As fun��es podem ou n�o retornar algo
 */

// classe
public class Funcoes {

	// fun��o 
	public static void main(String[] args) {
		double x = 25.0;
		
		// A fun��o sqrt(raiz quadrada) recebe como par�metro um double
		System.out.println(Math.sqrt(x));
		
		// Programa que l� tr�s n�meros e retorna o maior
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe tr�s n�meros: ");		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// chamada da fun��o que � atribuido a vari�vel maior
		int maior = max(a, b, c);
		// chamada da fun��o para imprimir na tela
		imprimir(maior);
				
		sc.close();
	}
	
	// ***********************************************************************
	// declara��o de uma fun��o que retorna um inteiro
	public static int max(int x, int y, int z)
	{
		int aux;
		if(x > y && x > z)
		{
			aux = x;
		}
		else if(y > z)
		{
			aux = y;
		}
		else
		{
			aux = z;
		}
		
		return aux;
	}
	
	// declara��o de uma fun��o para imprimir na tela
	public static void imprimir(int valor)
	{
		System.out.println("Maior valor: " + valor);
	}

}
