package A.EstruturaSequencial;

import java.util.Locale; // uso do double no padr�o americano (.)
import java.util.Scanner; // uso do Scanner para entrada de dados 

public class Exercicios_Matem�ticos
{

	public static void main(String[] args)
	{	
		Locale.setDefault(Locale.US);
		/*
		// quest�o 1 - Soma de dois inteiros
		double a, b;
		double soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		a = sc.nextDouble();
		
		System.out.println("Insira o segundo valor: ");
		b = sc.nextDouble();
		
		soma = a + b;
		
		System.out.println("A soma de " + a + " e " + b  + " = " + soma);
		sc.close();	
		*/
		
		/*
		// quest�o 2 - �rea de um circulo
		final double Pi = 3.14159;
		double raio = 0;
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		raio = Entrada.nextDouble();
		
		double areaCirculo = Pi * Math.pow(raio, 2);
		
		// formata a saidad e dados para quatro casas decimais
		System.out.printf("A �rea do c�rculo �: %.4f\n", areaCirculo);		
		
		Entrada.close();
		*/
		
		/*
		// Quest�o 3 - Calculo da diferen�a dos produtos
		Scanner Entrada = new Scanner(System.in);
				
		int num1, num2, num3, num4, resultado;
		System.out.println("Insira quatro valores: ");
		
		num1 = Entrada.nextInt();
		num2 = Entrada.nextInt();
		num3 = Entrada.nextInt();
		num4 = Entrada.nextInt();
		
		resultado = (num1 * num2) - (num3 * num4);
		System.out.println("O resultado �: " + resultado);
		*/
		
		/*
		// Quest�o 4 - Sal�rio
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ = %.2f\n", salario);		
		
		sc.close();
		*/
		
		/*
		// Quest�o 5 - Valor a pagar
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2;
		int qtd1, qtd2;
		double valor1, valor2, resultado;
		
		System.out.println("Primeiro produto: ");
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Segundo produto: ");
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		resultado = (qtd1 * valor1)+(qtd2 * valor2);
		
		System.out.printf("Valor a pagar R$: %.2f Reais\n", resultado);
		
		sc.close();		
		*/
		
		// Quest�o 6 - �reas
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRAINGULO: %.3f\n", A * C / 2.0);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * C * C);
		System.out.printf("TRAP�ZIO: %.3f\n", (A + B) / 2 * C);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RET�NGULO: %.3f\n", A * B);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		

	}

}
