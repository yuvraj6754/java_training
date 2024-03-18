package memory_manegment.Control_que;

import java.util.Scanner;

public class Q_18 
{
  public static void main(String[] args)
  {
    Scanner cp_sp = new Scanner(System.in);
    System.out.println("Enter The Cost Price :");
    int cp = cp_sp.nextInt();
    System.out.println("Enter The Selling Price :");
    int sp = cp_sp.nextInt();
    int d,s;		
    if(sp>cp)
    {
        d = sp-cp;
        System.out.println("Profit : "+d);
    }
    else if(cp>sp)
    {
        s = cp-sp;
        System.out.println("Loss : "+s);	
    }
    else
    {
        System.out.println("No Profit No Loss");
    }
  }
}
