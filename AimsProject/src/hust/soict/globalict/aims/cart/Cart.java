package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void printDisc(DigitalVideoDisc disc) {
		System.out.println(disc.getTitle()
				 + " - " + disc.getCategory()
			   	 + " - " + disc.getDirector()
			 	 + " - " + disc.getLength()
				 + " - " + disc.getCost() + "$");
	}
	
	public void printOrder() {
		System.out.println("*******************************CART*******************************");
		int i=0;
		for (i=0; i < itemsOrdered.length; i++) {
			if (itemsOrdered[i] != null) {
				System.out.print((i+1) + ". DVD - ");
				printDisc(itemsOrdered[i]);
			}
		}
		System.out.println("Total cost: " + totalCost() +"$");
		System.out.println("*******************************************************************\n");
	}
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }
//I prefer to use the one parameter of class DigitalVideoDisc
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean check = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i+1; j < qtyOrdered; j++) {
                    itemsOrdered[j-1] = itemsOrdered[j];
                };
                qtyOrdered--;
                check = true;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (!check) {
            System.out.println("The disc has not been found");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}