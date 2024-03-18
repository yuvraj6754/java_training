package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_4 
{
    public static void main(String[] args)
   {
    Scanner rrr = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = rrr.nextInt();
    if(num%5==0 && num%11==0)
    {
    System.out.println("This number is divisible by 5 and 11");
    }
    else
    {
        System.out.println("This number is Not divisible by 5 and 11");
    }
   }   
}
