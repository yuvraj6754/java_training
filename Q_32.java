package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_32 
{
    public static void main(String[] args) 
    {
        Scanner LB = new Scanner(System.in);
		System.out.print("Enter The Length  :");
		float len = LB.nextFloat();
		System.out.print("Enter The Breadth :");
		float bre = LB.nextFloat();
		float area = len * bre;                                     //area=leanth*breanth
		float perimeter = 2 * (len+bre);                           // perimiter =2*(l+b)
		System.out.println("Area of Rectangle : "+ area);
		System.out.println("Perimeter of Rectangle : "+ perimeter);
		if(area>perimeter) 
		{
			System.out.println("Area of rectangle is greater than  Perimeter");
		}
		else
		{
			System.out.println("Perimeter of rectangle is greater than Area");
		}
    } 
}
