package E.VetoreValor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int N = sc.nextInt();
		
		// declaração de um vetor 
		double[ ] vect = new double[N];
		
		double sum = 0.00;
		
		for(int i = 0; i < N; i++)
		{
			System.out.println("Insira o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextDouble();
			
			// a variável sum vai recebendo os valores digitados no vetor
			sum += vect[i];
		}
		
		System.out.printf("Average: %.2f\n", sum/3);
		
		
		sc.close();

	}

}
