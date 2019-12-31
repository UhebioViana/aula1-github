package I.ExercicioMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de linhas: ");
		int linhas = sc.nextInt();
		System.out.println("Informe o número de colunas: ");
		int colunas = sc.nextInt();
		
		// declaração da matriz
		int[][] mat = new int[linhas][colunas];
		
		// preenchimento da matriz
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o valor a ser procurado na matriz: ");
		int valor = sc.nextInt();
		
		int cont = 0;
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if(mat[i][j] == valor) {
					cont++;
					System.out.println("posição: " + i + ", " + j);
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);						
					}
					if(j < mat.length - 1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}					
					if(i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		if(cont == 0) {
			System.out.println("Valor não encontrado!!!!");
		}		
		
		sc.close();

	}

}
