package C.EstruturaRepetitiva;

import java.util.Scanner;

public class ExerciciosWhile
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		
		/*
 		// quest�o 1 - senha
		int senha = 2002;
		int x;
		
		x = ent.nextInt();
		while(x != senha)
		{
			System.out.println("Senha inv�lida!!!");
			x = ent.nextInt();
		}
		
		System.out.println("Acesso permitido");
		*/
		
		/*
		// quest�o 2 - plano cartesiano
		int x, y;
		x = ent.nextInt();
		y = ent.nextInt();
		
		while(x != 0 && y != 0)
		{
			if(x > 0 && y > 0)
			{
				System.out.println("Primeiro");
			}
			else if(x < 0 && y > 0)
			{
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0)
			{
				System.out.println("Terceiro");
			}
			else if(x > 0 && y < 0)
			{
				System.out.println("Quarto");
			}
			
			x = ent.nextInt();
			y = ent.nextInt();
		}
		*/
		
		/*
		// quest�o 3 - posto de combust�vel
		int x;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.println("1. Alcool\n2. Gasolina\n3. Diesel\n4. Fim\n");
		
		x = ent.nextInt();
		while(x < 1 || x > 4)
		{
			System.out.println("Opc�o inv�lida, tente novamente!!!");
			x = ent.nextInt();
		}
		
		while(x != 4)
		{
			if(x == 1)
			{
				alcool++;
			}
			else if(x == 2)
			{
				gasolina++;
			}
			else if(x == 3)
			{
				diesel++;
			}
			
			x = ent.nextInt();
			while(x < 1 || x > 4)
			{
				System.out.println("Opc�o inv�lida, tente novamente!!!");
				x = ent.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO!!!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);		
		*/
	
		ent.close();
	}

}
