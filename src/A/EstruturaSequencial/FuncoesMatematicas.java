/*
 * A = Math.sqrt(x) = Variável A recebe a raiz quadrada de x
 * A = Math.pow(x,y) = Variável de A recebe o resultado de x elevado a y
 * A = Math.abs(x) = Variável A recebe o valor absoluto de x
 */
package A.EstruturaSequencial;

public class FuncoesMatematicas
{

	public static void main(String[] args) 
	{
		double x = 9.0;
		double y = 2.0;
		double z = -5.0;
		double a, b, c, d, e, f, g, h;
		
		// raiz quadrada
		a = Math.sqrt(x);		
		System.out.println("Raiz quadrada de " + x + " é: " + a);
		
		b = Math.sqrt(y);
		System.out.println("Raiz quadrada de " + y + " é: " + b);
		
		c = Math.sqrt(25);
		System.out.println("Raiz quadrada de " + 25 + " é: " + c);
		
		// potenciação 
		d = Math.pow(x, y);
		System.out.println(x + " Elevado a " + y + " é: " + d);
		
		e = Math.pow(x, 3.0);
		System.out.println(x + " Elevado a " + 3 + " é: " + e);
		
		f = Math.pow(5.0, 2.0);
		System.out.println(5.0 + " Elevado a " + 2.0 + " é: " + f);
		
		// Números Absolutos
		g = Math.abs(z);
		System.out.println("O valor absoluto de " + z + " é: " + g);
		
		h = Math.abs(x);
		System.out.println("O valor absoluto de " + x + " é: " + h);
		
		// Equação do segundo grau
		/*
		 * 		delta = Math.pow(b, 2.0) - 4*a*c;
				x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 */
	
	}

}
