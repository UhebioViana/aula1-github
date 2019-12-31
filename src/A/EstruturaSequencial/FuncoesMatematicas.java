/*
 * A = Math.sqrt(x) = Vari�vel A recebe a raiz quadrada de x
 * A = Math.pow(x,y) = Vari�vel de A recebe o resultado de x elevado a y
 * A = Math.abs(x) = Vari�vel A recebe o valor absoluto de x
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
		System.out.println("Raiz quadrada de " + x + " �: " + a);
		
		b = Math.sqrt(y);
		System.out.println("Raiz quadrada de " + y + " �: " + b);
		
		c = Math.sqrt(25);
		System.out.println("Raiz quadrada de " + 25 + " �: " + c);
		
		// potencia��o 
		d = Math.pow(x, y);
		System.out.println(x + " Elevado a " + y + " �: " + d);
		
		e = Math.pow(x, 3.0);
		System.out.println(x + " Elevado a " + 3 + " �: " + e);
		
		f = Math.pow(5.0, 2.0);
		System.out.println(5.0 + " Elevado a " + 2.0 + " �: " + f);
		
		// N�meros Absolutos
		g = Math.abs(z);
		System.out.println("O valor absoluto de " + z + " �: " + g);
		
		h = Math.abs(x);
		System.out.println("O valor absoluto de " + x + " �: " + h);
		
		// Equa��o do segundo grau
		/*
		 * 		delta = Math.pow(b, 2.0) - 4*a*c;
				x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 */
	
	}

}
