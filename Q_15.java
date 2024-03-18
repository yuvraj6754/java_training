package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_15 
{
     public static void main(String[] args) 
   {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if((side1 + side2) > side3)
		{
           System.out.println("Triangle is valid.");
        }                                                             // if((side2 + side3) > side1)
        else if((side2 + side3)> side1)                              //((side1 + side3) > side2) 
		{
           System.out.println("Triangle is not valid.");
        }
		else if((side3 + side1)> side2)                                 //((side2 + side3) > side1)
        { 
			System.out.println("Triangle is not valid.");
        }
		else
        { 
			System.out.println("Triangle is not valid.");
        }

   } 
}
