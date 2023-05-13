package Example_lesson4;


public class Student{
	private String name;
	private int age;
	public Student(String n, int a) {//Phuong thuc khoi dung co tham so
		System.out.println("Mot doi tuong da dc khoi tao");
		name =n;
		age =a;
		
	}		
	public Student() {
		//Phuong thuc khoi dung mac dinh
	}
	public static void main(String[] args) {
		Student std;//Std tham chieu den doi tuong, ko phai la doi tuong
		std = new Student("Viet", 20);
		Student std2=new Student();
		System.out.println(std.name);
	}
	}