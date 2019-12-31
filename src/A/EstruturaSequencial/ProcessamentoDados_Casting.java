/*
 * 1. Comandos de atribui��o 
 * 2. Casting (Cast)
 * 
 */
package A.EstruturaSequencial;

public class ProcessamentoDados_Casting
{
	public static void main(String[] args) 
	{
		int x, y;
		
		x = 5; // L� se, x recebe 5
		y = 2 * x; // L� se y recebe 2 * x
		
		System.out.println(x);
		System.out.println(y);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		resultado = (double)a / b; // fazendo um cast na vari�vel a
		
		// para que o resultado seja correto � necess�rio fazer um cast, ou seja transformar uma das vari�veis inteiras em ponto flutuante
		System.out.println(resultado);									  
		
		double m = 5.0; 
		int n;
		
		// para que a vari�vel n (inteira) receba a vari�vel m (ponto flutuante) � necess�rio transformar a vari�vel m em inteira atrav�s do cast
		n = (int) m;  
		System.out.println(n);
		
	}
}
