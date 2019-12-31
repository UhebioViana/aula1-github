package D.TopicosBasicos;

public class FuncaoString
{

	public static void main(String[] args)
	{
		String original = "abcde FGHIJ ABC abc DEFG   ";
		System.out.println("Original: - " + original + "-");
		
		// coloca todos os carateres em min�sculo 
		String s1 = original.toLowerCase();
		System.out.println("Min�sculo: - " + s1 + "-");
		
		// coloca todos os caracteres em mai�sculo
		String s2 = original.toUpperCase();
		System.out.println("Mai�sculo: - " + s2 + "-");
		
		// elimina os espa�os antes e depois da string
		String s3 = original.trim();
		System.out.println("Sem espa�os: - " + s3 + "-");
		
		// criar uma nova string a partir da original a partir do indice indicado 		 
		String s4 = original.substring(4);  
		System.out.println("Substring indice inicial: - " + s4 + "-");
		
		// criar uma nova string a partir da original a partir do indice inicial at� antes do indice final
		String s5 = original.substring(4, 9);
		System.out.println("Substring indice inicial e final: - " + s5 + "-");
		
		// substituir partes da string
		String s6 = original.replace("abc", "xy");
		System.out.println("substiti��o: : - " + s6 + "-");
		
		// retorna o primeiro indice da substring
		int i = original.indexOf("F");
		System.out.println("Primeiro indice da substring: " + i);
		
		// retorna o �ltimo indice da substring
		int j = original.lastIndexOf("F");
		System.out.println("�ltimo indice da substring: " + j);
		
		// divide uma string toda vez que encontrar um divisor
		String Orig = "potato aplle lemon laranje";
		String[] vect = Orig.split(" "); // toda vez que o algoritmo achar aum delimitador (" ") a string ser� dividido
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}

}
