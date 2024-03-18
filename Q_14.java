package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_14 
{
     public static void main(String[] args)
    {
        Scanner tringle = new Scanner(System.in);
		System.out.println("Enter Three Angles of Triangle :");
		int angle1 = tringle.nextInt();
		int angle2 = tringle.nextInt();
		int angle3 = tringle.nextInt();
		int sum = angle1 + angle2 + angle3;

		if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) 
		{
			System.out.println("Triangle is a valid");
		}
		else
		{
			System.out.println("Triangle is not a valid");
		}
        
    }
}
