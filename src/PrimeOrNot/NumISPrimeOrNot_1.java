package PrimeOrNot;

import java.util.Scanner;

public class NumISPrimeOrNot_1 
{
	public static void main(String[] args)
	{
	   
	   /*System.out.println("Check given number is even or odd");
	   System.out.println("Plese enter number");*/
	   //Scanner sc=new Scanner(System.in);
	   int n=2 ;
		int count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
		      count++;
		      break;
			}
			if(count ==0)
				System.out.println("It is prime number");
			else
				System.out.println("It is not prime number");
				
		}
    }
}

