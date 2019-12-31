package B.EstruturaCondicional;

public class EscopoInicializacao 
{

	public static void main(String[] args)
	{
		// toda vari�vel precisa conter um valor
		double preco = 20.00;
		double desconto;
		
		System.out.println(preco);
		
		// usando if else vai garantir que a vari�vel desconto ter� um valor
		if(preco < 20.00)
		{
			desconto = preco * 0.10;					
			//double x = desconto; // vari�vel local, s� est� ativa dentro do escopo do if
		}
		else
		{
			desconto = preco * 0.20;
		}
		
		System.out.println(desconto);
		
		// se eu tentar exibir o valor da x dar� erro pois ela s� faz parte do escopo do if
		//System.out.println(x);

	}

}
