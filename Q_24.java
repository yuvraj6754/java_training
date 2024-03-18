package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_24 
{
    public static void main(String[] args) 
    {
        Scanner Employee_salary = new Scanner(System.in);
		System.out.print("Enter the Basic Salary : ");
		float bs = Employee_salary.nextFloat();
		float hra,da,gs;
		if(bs<1500)
		{			
			hra=bs*0.1f;
			da=bs*0.9f;
		}
		else
		{			
			hra=500;
			da=bs*0.98f;
		}		
		gs = bs+hra+da;                                   // Gross Salary = Basic Salary + HRA + DA
		System.out.println("Gross Salary Rs:"+gs);
    }
}
