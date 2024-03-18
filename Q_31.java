package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_31 
{
    public static void main(String[] args) 
    {
        Scanner Absolute = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = Absolute.nextInt();
		if(num<0)
        {
           num = (-1)*num;
        }
		System.out.print("Absolute Number is : "+num);
    } 
}
