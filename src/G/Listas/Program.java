package G.Listas;

import java.util.ArrayList; // para uso da List
import java.util.List; // para uso da List
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// declarando uma lista
		// na lista usa-se os Wrapers dos tipos primitivos int(Integer), double(Double), float(Float)
		List<String> list = new ArrayList<String>();
		
		// adicionando
		list.add("Clara");
		list.add("Uhebio");
		list.add("Kelly");
		list.add("C�cero");
		list.add(2, "Irene"); // adicionando um elemento em uma posi��o especifica
		
		// tamanho da lista
		System.out.println(list.size());
		
		// imprimindo - para cada String x da minhas list exibir na tela 
		for(String x : list) {
			System.out.println(x);
		}
		
		// encontrando a posi��o de um elemento
		System.out.println("Posi�a� de Uhebio: " + list.indexOf("Uhebio"));
		System.out.println("Posi�a� de Marcos: " + list.indexOf("Marcos")); // quando n�o encontra o par�metro retorna -1		
		System.out.println("-----------------------------------------------");
		
		// filtrando 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		
		// retornando o primeiro elemento da lista que segue o par�metro
		String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-----------------------------------------------");		
		
		// removendo
		list.remove("Uhebio"); // a partir de compara��o
		list.remove(1); //a partir da posi��o
		list.removeIf(x -> x.charAt(0) == 'M'); // a partir do predicado
		
		
		// imprimindo - para cada String x da minhas list exibir na tela		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}		
				
		sc.close();

	}

}
