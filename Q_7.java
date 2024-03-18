package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_7 
{
public static void main(String[] args) 
{
    Scanner character= new Scanner(System.in);
	System.out.print("Enter the Character :");
	char ch = character.next().charAt(0);

	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	{
		System.out.println("This is a Alphabet");
	}
	else
	{
		System.out.println("This is a Not Alphabet");
	}
  
}
}
