/*
 * 1. Comandos de atribuição 
 * 2. Casting (Cast)
 * 
 */
package A.EstruturaSequencial;

public class ProcessamentoDados_Casting
{
	public static void main(String[] args) 
	{
		int x, y;
		
		x = 5; // Lê se, x recebe 5
		y = 2 * x; // Lê se y recebe 2 * x
		
		System.out.println(x);
		System.out.println(y);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		resultado = (double)a / b; // fazendo um cast na variável a
		
		// para que o resultado seja correto é necessário fazer um cast, ou seja transformar uma das variáveis inteiras em ponto flutuante
		System.out.println(resultado);									  
		
		double m = 5.0; 
		int n;
		
		// para que a variável n (inteira) receba a variável m (ponto flutuante) é necessário transformar a variável m em inteira através do cast
		n = (int) m;  
		System.out.println(n);
		
	}
}
