package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_10 
{
    public static void main(String[] args)
    {
        Scanner upp_loow = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = upp_loow.next().charAt(0);			
		if(ch>='a' && ch<='z')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else
		{
			System.out.println("This is a Uppercase Alphabet");
		}
    }
}
