package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_1        // Conditional quetions start...
{
        public static void main(String[] args) 
    { 
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the  first number");
        int num1 = y.nextInt();
        System.out.println("Enter the  second number");
        int num2 = y.nextInt();
        if(num1>num2)
        {
            System.out.println("maximum number is:" +num1);
        }
        else if(num1<num2)
        {
            System.out.println("maximum number is:" +num2);
        }
        else
        {
            System.out.println("Both Are Equal " +num1);
        }

    }
    
}
