package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_34 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Days :");
		int days = input.nextInt();
		int amt;
		if(days>0 && days<= 5) 
		{
			amt = (int)0.50 * days;
			System.out.println("Fine Amount Pay to Rs :"+ amt);
		}
		else if(days >= 6 && days <= 10) 
		{
			amt = 1 * days;
			System.out.println("Fine Amount Pay to Rs :"+ amt);
		}
		else if(days > 10) 
		{
			amt = 5 * days; 
			System.out.println("Fine Amount Pay to Rs :"+ amt);
                if(days>30)
	            {
			       System.out.println("Your Membership would be Cancelled..");				
		        }
        }
		else
		{
			System.out.println("Invalid");
		}
		
    }
}
