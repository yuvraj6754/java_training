package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_22 
{
     public static void main(String[] args) 
    {
        Scanner Expenses = new Scanner(System.in);
		System.out.print("Enter the Quantity Purchased : ");
		int qty = Expenses.nextInt();
		System.out.print("Enter the Amount Per Item : ");
		float amt = Expenses.nextFloat();
		float exp;
		if(qty>100)
		{			
			exp = qty * amt;                     //Total Expenses = Quantity Purchased * Amount Per Item
			exp = exp-(exp * 0.1f);            //Total Expenses with Discount = Total Expenses - (Total Expenses * 0.1)
		}
		else
		{
			exp = qty * amt;                         //Total Expenses = Quantity Purchased * Amount Per Item

		}		
		System.out.println("Total Expenses is : "+exp);

    }
}
