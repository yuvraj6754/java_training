package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_11 
{
       public static void main(String[] args)
    {
        Scanner week_day = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = week_day.nextInt();

		if(num==1)
        {
            System.out.println("This is a Sunday");
        }
		else if(num==2)
		{
            System.out.println("This is a Monday");
        }
		else if(num==3)
        {
            System.out.println("This is a Tuesday");
        }
		else if(num==4)
		{
            System.out.println("This is a Wednesday");
        }
		else if(num==5)
		{
            System.out.println("This is a Thursday");
        }
		else if(num==6)
		{
            System.out.println("This is a Friday");
        }
		else if(num==7)
		{
            System.out.println("This is a Saturday");
        }
		else
        { 
			System.out.println("Enter 1 to 7...");
        }
    } 
}
