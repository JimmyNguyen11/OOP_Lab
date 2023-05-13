package Lab_1;
import java.util.Scanner;
public class fde {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter b: ");
        double num2 = scanner.nextDouble();
        if (num1==0) {
        	if (num2==0) {
        	System.out.println("The equation has many solutions!");
        	}
        	else {
        		System.out.println("The equation has no solution!");
        	}
        }
        else {
        	double num3=-num2/num1;
        	System.out.println("The solution is: x = " + num3);
        }
        
	}

}
