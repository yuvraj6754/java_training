package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_29 
{
    
    public static void main(String[] args) 
    {
        Scanner Yongest = new Scanner(System.in);
		System.out.print("Enter the Age of Ram :");
		int age1  = Yongest.nextInt();
		System.out.print("Enter the Age of Shyam  :");
		int age2  = Yongest.nextInt();
		System.out.print("Enter the Age of Ajay  :");
		int age3  = Yongest.nextInt();
		if(age1<age2 && age1<age3)
			System.out.print("The Youngest Age is :  \"Ram\"");
		else if(age2<age1 && age2<age3)			
			System.out.print("The Youngest Age is :  \"Shyam\"");
		else			
			System.out.print("The Youngest Age is : \"Ajay\"");
    }
}
