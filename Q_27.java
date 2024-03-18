package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_27 
{
        public static void main(String[] args) 
    {
        Scanner salary_calculate = new Scanner(System.in);
		System.out.print("Enter the Years of Service :");
		int ys = salary_calculate.nextInt();
		System.out.print("Enter the Gender M/F :");         // male /Female
		char gen = salary_calculate.next().charAt(0);
		System.out.print("Enter the Qualification G==0/PS=1:");              //graduate -1, post graduate-0
		int qual = salary_calculate.nextInt();
		int salary=0;
		if(gen=='m' && ys>=10 && qual==0)
		{			
			salary = 15000;
		}
		else if( (gen=='m' && ys>=10 && qual==1))
		{			
			salary = 10000;
		}
		else if(gen=='m' && ys<10 && qual==0)
		{			
			salary = 7000;
		}
		else if(gen=='f' && ys>=10 && qual==1)
		{			
			salary = 12000;
		}
		else if(gen=='f' && ys>=10 && qual==0)
		{			
			salary = 9000;
		}
		else if(gen=='f' && ys<10 && qual==1)
		{			
			salary = 6000;
		}
		System.out.println("Salary : " + salary);

    }
}
