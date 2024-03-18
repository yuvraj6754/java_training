package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_2 
{
        public static void main(String[] args)
    {
        Scanner B = new Scanner(System.in);           // Scanner B = new Scanner(System.in);     
        System.out.println("Enter the  first number");
        int num1 = B.nextInt();
        System.out.println("Enter the  second number");
        int num2 = B.nextInt();
        System.out.println("Enter the thrd number");
        int num3 = B.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("maximum number is:" +num1);
        }
        else if(num1<num2 && num3<num2)
        {
            System.out.println("maximum number is:" +num2);
        }
        else
        {
            System.out.println("maximum number is:" +num3);
        }
    }
}
