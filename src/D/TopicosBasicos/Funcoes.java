package D.TopicosBasicos;

import java.util.Scanner;

/*
 * As funções podem ou não retornar algo
 */

// classe
public class Funcoes {

	// função 
	public static void main(String[] args) {
		double x = 25.0;
		
		// A função sqrt(raiz quadrada) recebe como parâmetro um double
		System.out.println(Math.sqrt(x));
		
		// Programa que lê três números e retorna o maior
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe três números: ");		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// chamada da função que é atribuido a variável maior
		int maior = max(a, b, c);
		// chamada da função para imprimir na tela
		imprimir(maior);
				
		sc.close();
	}
	
	// ***********************************************************************
	// declaração de uma função que retorna um inteiro
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
	
	// declaração de uma função para imprimir na tela
	public static void imprimir(int valor)
	{
		System.out.println("Maior valor: " + valor);
	}

}
