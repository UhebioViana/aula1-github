package B.EstruturaCondicional;

import java.util.Scanner;

public class EstruturaSwitchCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Informe um valor: ");
		x = sc.nextInt();

		switch (x)
		{
			case 1:
			{	
				dia = "Domingo";
				break;
			}
			case 2:
			{
				dia = "Segunda";
				break;
			}
			case 3:
			{
				dia = "Ter�a";
				break;
			}
			case 4:
			{
				dia = "Quarta";
				break;
			}
			case 5:
			{
				dia = "Quinta";
				break;
			}
			case 6:
			{
				dia = "Sexta";
				break;
			}
			case 7:
			{
				dia = "S�bado";
				break;
			}
			default:
			{
				dia = "Op��o inv�lida";
				break;
			}
		}
		
		System.out.println(dia);

		sc.close();
	}

}
