package Lab_1;
import java.util.Scanner;
public class days {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month= s.nextInt();
		System.out.println("Enter the year: ");
		int year= s.nextInt();
		while ((month<1)||(month>12)||(year<0))
		{
			System.out.println("Invalid number, please try again!");
			month=s.nextInt();
			year=s.nextInt();
			}
		if (year%4==0)
		{
			switch (month) {
            case 1:
                System.out.println("The number of days is: 31");
                break;
            case 2:
                System.out.println("The number of days is: 29");
                break;
            case 3:
                System.out.println("The number of days is: 31");
                break;
            case 4:
                System.out.println("The number of days is: 30");
                break;
            case 5:
                System.out.println("The number of days is: 31");
                break;
            case 6:
                System.out.println("The number of days is: 30");
                break;
            case 7:
                System.out.println("The number of days is: 31");
                break;
            case 8:
                System.out.println("The number of days is: 31");
                break;
            case 9:
                System.out.println("The number of days is: 30");
                break;
            case 10:
                System.out.println("The number of days is: 31");
                break;
            case 12:
                System.out.println("The number of days is: 30");
                break;
            	

            default:
                System.out.println("The number of days is: 31");
                break;
        }
		}
		else
			switch (month) {
			 case 1:
	                System.out.println("The number of days is: 31");
	                break;
	            case 2:
	                System.out.println("The number of days is: 28");
	                break;
	            case 3:
	                System.out.println("The number of days is: 31");
	                break;
	            case 4:
	                System.out.println("The number of days is: 30");
	                break;
	            case 5:
	                System.out.println("The number of days is: 31");
	                break;
	            case 6:
	                System.out.println("The number of days is: 30");
	                break;
	            case 7:
	                System.out.println("The number of days is: 31");
	                break;
	            case 8:
	                System.out.println("The number of days is: 31");
	                break;
	            case 9:
	                System.out.println("The number of days is: 30");
	                break;
	            case 10:
	                System.out.println("The number of days is: 31");
	                break;
	            case 11:
	                System.out.println("The number of days is: 30");
	                break;
	            	

	            default:
	                System.out.println("The number of days is: 31");
	                break;
			}
		
		
	}

}
