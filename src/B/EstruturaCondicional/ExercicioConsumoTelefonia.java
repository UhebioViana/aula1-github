package B.EstruturaCondicional;

import java.util.Scanner;

public class ExercicioConsumoTelefonia
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int consumoMinutos;
		final double valorFranquia = 50.00;
		final int minutosFranquia = 100;
		
		System.out.println("Informe o consumo em minutos: ");
		consumoMinutos = sc.nextInt();
				
		if(consumoMinutos <= minutosFranquia )
		{
			System.out.printf("Valor a pagar: R$ %.2f\n", valorFranquia);
		}
		else
		{
			System.out.printf("Valor a pagar: R$ %.2f\n", valorFranquia + ((consumoMinutos - minutosFranquia) * 2.00));
		}		
		
		sc.close();
	}

}
