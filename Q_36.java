package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_36 
{
    public static void main(String[] args) 
    {
        Scanner num_equal = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = num_equal.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = num_equal.nextInt();
		System.out.print("Enter Third Number: ");
		int num3 = num_equal.nextInt();
 
		if (num1 == num2 && num1 == num3 && num2 == num3)
		{
			System.out.println("All Numbers are equal");
		}
		else if (num1 == num2 || num1 == num3 || num3 == num2)
		{
			System.out.println("All Numbers are Not equal");
		}
		else
		{
			System.out.println("All Numbers are Different");
		}

    }
}
