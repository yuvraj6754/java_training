package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_21 
{
     public static void main(String[] args) 
    {
        Scanner unit_charges = new Scanner(System.in);
		System.out.print("Enter The Electricity Unit : ");
		int unit = unit_charges.nextInt();
		float amt,surcharge,bill_amt;
		if(unit<=50)
		{			
			amt = unit*0.50f;
		}
		else if(unit<=150)
		{
			amt = unit*0.75f;
		}
		else if(unit<=250)
		{
			amt = unit*1.20f;
		}
		else
		{
			amt = unit*1.50f;
		}
 
		surcharge = amt*0.2f;
		bill_amt = amt+surcharge;
		System.out.println("Total Electricity Bill : "+bill_amt);

    }
}
