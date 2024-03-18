package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_5 
{
    
    public static void main(String[] args) 
    {
        Scanner yy = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = yy.nextInt();
        if(num%2==0)
        {
           System.out.println("Even number");
        }
        else
        {
            System.out.println("odd number");
        }
        
    }
}