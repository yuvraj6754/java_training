package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_40 
{
        public static void main(String[] args) 
    {
        Scanner multiple_five = new Scanner(System.in);
        System.out.print("Enter the number of multiple 5 : ");
        int num = multiple_five.nextInt();

        if(num%5==0)
        {
            System.out.println("Number is multiple of five");
        }
        else
        {
            System.out.println("Number is not multiple five");
        }
    }
}
