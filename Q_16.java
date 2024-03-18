package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_16 
{
     public static void main(String[] args)
    {
        Scanner check_tringle = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int side1 = check_tringle .nextInt();
		int side2 = check_tringle .nextInt();
		int side3 = check_tringle .nextInt();
		if(side1 == side2 && side2 == side3)
			System.out.println("Equilateral Triangle.");
		else if(side1 == side2 || side1 == side3 || side2 == side3)
			System.out.println("Isosceles Triangle.");
		else 
			System.out.println("Scalene Triangle.");
        
    }
}
