package A.EstruturaSequencial;

import java.util.Scanner; // importação para uso do Scanner

public class EntradaDados
{
	public static void main(String[] args)
	{
		// declaração obrigatória para entrada de dados (criação do objeto sc do tipo Scanner)
		Scanner sc = new Scanner(System.in); 
		
		String x;
		int i;
		double d;
		
		/*
		 * Quando utilizamos alguma entrada de dados diferente antes do nextline, isso gera uma quebra de linha extra, para resolver esse problema
		 * adicionamos mais uma nextline no algoritmo
		 */
		
		System.out.println("Insira a sua idade: ");
		i = sc.nextInt(); // i recebe um inteiro digitado pelo usuário		
		System.out.println("Insira seu nome completo: ");
		sc.nextLine(); // limpando o buffer
		x = sc.nextLine(); // x recebe a string digitada pelo o usuário		
		System.out.println("Insira o valor do seu salário: ");		
		d = sc.nextDouble(); // d recebe um ponto flutuante digitado pelo usuário
		
		/*
		 * para double (sc.nextDouble()) => localidade do sistema, é preciso usar antes Locale.setDefault(Locale.US)
		 * para char (sc.next().charAt(0))
		 * para int (sc.nextInt());
		 * para String (sc.next()) => para entrada de apenas uma string
		 * para String (sc.nextLine()) => para entrada de múltiplas strings até a quebra de linha
		 * 
		 */
		
		System.out.println("Seu nome é: " + x + " e a sua idade é: " + i + " anos e seu salário é R$ " + d);
		
		sc.close(); // fechamento do objeto 
		
	}
}
