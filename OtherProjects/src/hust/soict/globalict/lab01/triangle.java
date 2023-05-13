package Lab_1;
import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter n: ");
		int n=s.nextInt();
		int dem=n;
		for (int i=1; i<=n; i++)
		{
			for (int k=dem; k>0; k--)
				System.out.print(" ");
			for (int j=1; j<=(2*i-1); j++) 
			System.out.print("*");
			System.out.println();
			dem=n-i;
			
		}
		
	}

}
