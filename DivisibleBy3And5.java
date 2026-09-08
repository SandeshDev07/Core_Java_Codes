/*
	Print all Numbers which are divisible by 3 & 5 upto 'n'....
																	*/

import java.io.*;

public class DivisibleBy3And5
{
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

		System.out.print("Till what number you want to print numbers which are Divisible by 3 & 5 : ");
		int num = Integer.parseInt(br.readLine());

		if(num < 1)
		{
			System.out.println("Invalid Input!!...");
			System.exit(0);
		}

		System.out.println("Divisible by 3 & 5 Numbers Are : ");

		for(int i=1; i<=num; i++)
		{
			if( (i%3 == 0) && (i%5 == 0) )
			{
				System.out.println(i);
			}
		}
	}
}