package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_30 
{
    public static void main(String[] args) 
    {
        Scanner sumALLtringle = new Scanner(System.in);
		System.out.print("Enter Triangle Side 1 :");
		int s1 = sumALLtringle.nextInt();
		System.out.print("Enter Triangle Side 2 :");
		int s2 = sumALLtringle.nextInt();
		System.out.print("Enter Triangle Side 3 :");
		int s3 = sumALLtringle.nextInt();
		int sum = s1 + s2 + s3; 
		if(sum == 180) 
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
    }
}
