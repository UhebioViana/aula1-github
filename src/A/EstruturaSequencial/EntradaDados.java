package A.EstruturaSequencial;

import java.util.Scanner; // importa��o para uso do Scanner

public class EntradaDados
{
	public static void main(String[] args)
	{
		// declara��o obrigat�ria para entrada de dados (cria��o do objeto sc do tipo Scanner)
		Scanner sc = new Scanner(System.in); 
		
		String x;
		int i;
		double d;
		
		/*
		 * Quando utilizamos alguma entrada de dados diferente antes do nextline, isso gera uma quebra de linha extra, para resolver esse problema
		 * adicionamos mais uma nextline no algoritmo
		 */
		
		System.out.println("Insira a sua idade: ");
		i = sc.nextInt(); // i recebe um inteiro digitado pelo usu�rio		
		System.out.println("Insira seu nome completo: ");
		sc.nextLine(); // limpando o buffer
		x = sc.nextLine(); // x recebe a string digitada pelo o usu�rio		
		System.out.println("Insira o valor do seu sal�rio: ");		
		d = sc.nextDouble(); // d recebe um ponto flutuante digitado pelo usu�rio
		
		/*
		 * para double (sc.nextDouble()) => localidade do sistema, � preciso usar antes Locale.setDefault(Locale.US)
		 * para char (sc.next().charAt(0))
		 * para int (sc.nextInt());
		 * para String (sc.next()) => para entrada de apenas uma string
		 * para String (sc.nextLine()) => para entrada de m�ltiplas strings at� a quebra de linha
		 * 
		 */
		
		System.out.println("Seu nome �: " + x + " e a sua idade �: " + i + " anos e seu sal�rio � R$ " + d);
		
		sc.close(); // fechamento do objeto 
		
	}
}
