package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_35 
{
    public static void main(String[] args) 
    {
        Scanner work_efficienty = new Scanner(System.in);
		System.out.print("Enter the Time Taken by Worker :");
		float hrs = work_efficienty.nextFloat();
		if(hrs>=2 && hrs<=3) 
		{
			System.out.println("Worker is Highly Efficient");
		}
		else if(hrs>3 && hrs <=4) 
		{
			System.out.println("Worker Needs to Improve Speed");
		}
		else if(hrs>4 && hrs <=5) 
		{
			System.out.println("Give Training to Worker");
		}
		else
		{
			System.out.println("Worker is Leave the Company");
		}
    } 
}
