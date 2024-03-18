package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_38 
{
    public static void main(String[] args) 
   {
    Scanner Student_division = new Scanner(System.in);
    System.out.println("Enter The Five Subject Marks :");
    int S1 = Student_division.nextInt();
    int S2 = Student_division.nextInt();
    int S3 = Student_division.nextInt();
    int S4 = Student_division.nextInt();
    int S5 = Student_division.nextInt();
    int tot = S1+S2+S3+S4+S5;
    float per = tot/5;
    System.out.println("Total :"+tot);
    System.out.println("Percentage :"+per);	
    if(per>=60)
    {			
        System.out.println("First Division.");
    }
    else if(per>=50 && per<=59)
    {			
        System.out.println("Second Division.");
    }
    else if(per>=40 && per<=49)
    {			
        System.out.println("Third  Division.");
    }
    else
    {			
        System.out.println("Fail.");
    }
   }   
}
