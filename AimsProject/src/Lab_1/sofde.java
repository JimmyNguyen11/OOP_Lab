package Lab_1;
import java.util.Scanner;
public class sofde {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a1: ");
	        double a1 = scanner.nextDouble();
	        System.out.print("Enter b1: ");
	        double b1 = scanner.nextDouble();
	        System.out.print("Enter a2: ");
	        double a2 = scanner.nextDouble();
	        System.out.print("Enter b2: ");
	        double b2 = scanner.nextDouble();
	        System.out.print("Enter c1: ");
	        double c1 = scanner.nextDouble();
	        System.out.print("Enter c2: ");
	        double c2 = scanner.nextDouble();
	        double d=a1*b2-a2*b1;
	        double dx=c1*b2-c2*b1;
	        double dy=a1*c2-a2*c1;
	  if (d==0) {
        	if ((dx!=0) && (dy!=0))
        	{
        		System.out.println("The system has no solution!");
        		
        	}
     
        	if ((d==dx) && (d==dy))
        	{
        		System.out.println("The system has many solutions ");
        		
        	}
	        	}
	        else
	        {
	        	System.out.println("The system has 1 solution!");
	        	System.out.println("x= "+dx/d);
	        	System.out.println("y= "+dy/d);
	        }
	}

}
