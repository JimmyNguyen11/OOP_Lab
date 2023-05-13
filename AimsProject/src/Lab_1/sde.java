package Lab_1;
import java.util.Scanner;
import java.lang.Math;
public class sde {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();
        double delta=b*b-4*a*c;
        if (delta==0) 
        System.out.println("The equation has 1 solution x = "+ (-b/2*a));
        else
        	if (delta<0)
        		System.out.println("The equation has no solution!");
        	else
        	{
        		System.out.println("The equation has 2 solutions!");
        		System.out.println("x1 = "+ (-b-Math.sqrt(delta))/2*a);
        		System.out.println("x2 = "+ (-b+Math.sqrt(delta))/2*a);
        	}
        		}

}
