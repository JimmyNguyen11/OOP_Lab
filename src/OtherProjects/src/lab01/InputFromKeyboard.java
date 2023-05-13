package Lab_1;
import java.util.Scanner;
public class InputFromKeyboard {
public static void main(String[] args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("What's your name?");
	String name=kb.nextLine();
	System.out.println("How old are you?");
	int age=kb.nextInt();
	System.out.println("How tall are you (m)?");
	double h=kb.nextDouble();
	System.out.println("Mrs/Ms. "+name+", "+age+" years old. "+"Your height is "+h+" m.");
	
	
}
}
