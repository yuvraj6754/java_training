package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_8 
{
    public static void main(String[] args)
    {
        Scanner vowel_consonant = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = vowel_consonant.next().charAt(0);

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("This is a Vowel");
		}
		else
		{
			System.out.println("This is a Consonant");
		}
    }
}
