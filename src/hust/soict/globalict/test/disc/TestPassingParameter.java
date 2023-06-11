package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

class Object {
    DigitalVideoDisc dvd;
    Object(DigitalVideoDisc dvd) {this.dvd = dvd;}
}
public class TestPassingParameter {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		Object o1 = new Object(jungleDVD);
        Object o2 = new Object(cinderellaDVD);
        
		swap(o1, o2);
		System.out.println("jungle dvd title: " + o1.dvd.getTitle());
		System.out.println("cinderella dvd title: " + o2.dvd.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());

	}
	//The title of the 2 DVDs doesn't change because parameters are passed by value in Java. 
	/*So when we pass jungleDVD and cinderellaDVD to function swap(), 
	the function creates a copy of these references.*/

	public static void swap(Object o1, Object o2) {   //corect the swap() method
		DigitalVideoDisc temp = o1.dvd;
		o1.dvd = o2.dvd;
		o2.dvd = temp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitleString = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitleString);
	}
}
