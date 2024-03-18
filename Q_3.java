package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_3 
{
    public static void main(String[] args) 
    {
        Scanner yuvraj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = yuvraj.nextInt();
        
        if(num>0)
        {
            System.out.println("number is Positive");
        }
        else if(num<0)
        {
           System.out.println("number is Negative");
        }
        else
        {
            System.out.println("the number is Zero");
        }
    }
    
}
