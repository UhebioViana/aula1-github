package B.EstruturaCondicional;

public class EscopoInicializacao 
{

	public static void main(String[] args)
	{
		// toda variável precisa conter um valor
		double preco = 20.00;
		double desconto;
		
		System.out.println(preco);
		
		// usando if else vai garantir que a variável desconto terá um valor
		if(preco < 20.00)
		{
			desconto = preco * 0.10;					
			//double x = desconto; // variável local, só está ativa dentro do escopo do if
		}
		else
		{
			desconto = preco * 0.20;
		}
		
		System.out.println(desconto);
		
		// se eu tentar exibir o valor da x dará erro pois ela só faz parte do escopo do if
		//System.out.println(x);

	}

}
