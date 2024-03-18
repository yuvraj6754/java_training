package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_19 
{
    
    public static void main(String[] args) 
    {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the marks of PYSICS ");
        int P = grade.nextInt();
        System.out.println("Enter the marks of CHEMISTRY ");
        int C = grade.nextInt();
        System.out.println("Enter the marks of BIOLOGY ");
        int B = grade.nextInt();
        System.out.println("Enter the marks of MATHEMATICS ");
        int M = grade.nextInt();
        System.out.println("Enter the marks of COMPUTER ");
        int CM = grade.nextInt();
        int total = P+C+B+M+CM;
        float per = total/5;
        System.out.println("Total :" +total);
        System.out.println("Percentage : " +per);

        if (per>=90)
        {
           System.out.println("Grade A");
        }
        else if (per>=80)
        {
           System.out.println("Grade B");
        }
        else if (per>=70)
        {
            System.out.println("Grade C");
        }
        else if (per>=60)
        {
            System.out.println("Grade D");
        }
        else if (per>=40)
        {
            System.out.println("Grade E");
        }
        else if(per<40)
        {
            System.out.println("Grade F");
        }

    }
}
