package D.TopicosBasicos;

public class FuncaoString
{

	public static void main(String[] args)
	{
		String original = "abcde FGHIJ ABC abc DEFG   ";
		System.out.println("Original: - " + original + "-");
		
		// coloca todos os carateres em minúsculo 
		String s1 = original.toLowerCase();
		System.out.println("Minúsculo: - " + s1 + "-");
		
		// coloca todos os caracteres em maiúsculo
		String s2 = original.toUpperCase();
		System.out.println("Maiúsculo: - " + s2 + "-");
		
		// elimina os espaços antes e depois da string
		String s3 = original.trim();
		System.out.println("Sem espaços: - " + s3 + "-");
		
		// criar uma nova string a partir da original a partir do indice indicado 		 
		String s4 = original.substring(4);  
		System.out.println("Substring indice inicial: - " + s4 + "-");
		
		// criar uma nova string a partir da original a partir do indice inicial até antes do indice final
		String s5 = original.substring(4, 9);
		System.out.println("Substring indice inicial e final: - " + s5 + "-");
		
		// substituir partes da string
		String s6 = original.replace("abc", "xy");
		System.out.println("substitição: : - " + s6 + "-");
		
		// retorna o primeiro indice da substring
		int i = original.indexOf("F");
		System.out.println("Primeiro indice da substring: " + i);
		
		// retorna o último indice da substring
		int j = original.lastIndexOf("F");
		System.out.println("Ùltimo indice da substring: " + j);
		
		// divide uma string toda vez que encontrar um divisor
		String Orig = "potato aplle lemon laranje";
		String[] vect = Orig.split(" "); // toda vez que o algoritmo achar aum delimitador (" ") a string será dividido
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}

}
