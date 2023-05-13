package hust.soict.globalict.aims;
import com.sun.jdi.Field;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.zip.GZIPInputStream;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation","Roger Alers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Print total cost of the items in the cart
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());

        // Check remove function
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}