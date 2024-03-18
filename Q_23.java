package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_23 
{
     public static void main(String[] args) 
    {
        Scanner Employee_Bonus = new Scanner(System.in);
		System.out.print("Enter the Current Year : ");
		int current_year = Employee_Bonus.nextInt();
		System.out.print("Enter the Year of Joining : ");
		int join_year = Employee_Bonus.nextInt();
		int diff = current_year - join_year;                    //Difference = Current Year - Year of Joining
		if(diff>3) 
		{			
			System.out.println("Bonus of Rs : 2500 /-");
		}
		else
		{			
			System.out.println("No Bonus");
		}		
    }
}
