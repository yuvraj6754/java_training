package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_26 
{
    public static void main(String[] args) 
    {
        Scanner driver = new Scanner(System.in);
		System.out.print("Enter The Age :");
		int age = driver.nextInt();
        System.out.print("Enter the Gender  :");  //Male/Female 
		char gen = driver.next().charAt(0);
		System.out.print("Enter the Marital Status :");  //Married/Unmarried
		char status = driver.next().charAt(0);
		if(status == 'M' || status == 'm')
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
		{			
			System.out.println("Driver should be Insured.");
		}
		else
		{			
			System.out.println("Driver should not be Insured.");
		}
    }
}
