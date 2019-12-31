package H.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe o tamanho da matriz: ");
		int tam = sc.nextInt();
		
		// criando a matriz
		int[][] mat = new int[tam][tam];

		// inserindo dados
		//linhas = tam(mat.length)
		// colunas = tam[i].length)
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int i = 0; i < tam; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Numeros negativos: ");
		int cont = 0;
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println(cont);
		
		sc.close();
		
	}

}
