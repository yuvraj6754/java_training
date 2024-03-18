package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_6 
{
    public static void main(String[] args)
    {
        Scanner yyy = new Scanner(System.in);
        System.out.println("Enter the number");
        int year = yyy.nextInt();
        boolean flag= false;
        if(year%400==0)
            flag = true;
        else if(year%100==0)
            flag = false; 
        else if(year%4==0)
            flag = true;
        else
            flag = false;

        if(flag)
        {
           System.out.println("year "+year+" is Leap year" );
        }
        else
        {
           System.out.println("year "+year+" is Not a Leap year" );
        }
    }
}
