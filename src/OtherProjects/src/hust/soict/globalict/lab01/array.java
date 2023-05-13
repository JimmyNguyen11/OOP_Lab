package Lab_1;
import java.util.Scanner;
public class array {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int sum=0,tg;
    int[] a=new int[100]; 
    System.out.println("Please enter the number elements of array: ");
    int n=s.nextInt();
    for (int i=1; i<=n; i++)
    {
    System.out.print("a[" +i +"]= ");
    a[i]=s.nextInt();
    sum+=a[i];
    }
    for (int i=1; i<n; i++)
    	for (int j=i+1; j<=n; j++)
    	if (a[i]>a[j])
    	{
    		tg=a[i];
    		a[i]=a[j];
    		a[j]=tg;
    	}
    System.out.println("Array after sorting is: ");
    for (int i=1; i<=n; i++) System.out.print(a[i]+" ");
    System.out.println();
    System.out.println("The sum is= "+sum);
    double avr=sum/n;
    System.out.println("The average is: "+avr);
    
    
  }
}