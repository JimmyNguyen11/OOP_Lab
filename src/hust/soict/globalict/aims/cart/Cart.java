package hust.soict.globalict.aims.cart;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void printDisc(DigitalVideoDisc disc) {
		System.out.println(disc.getTitle()
				 + " - " + disc.getCategory()
			   	 + " - " + disc.getDirector()
			 	 + " - " + disc.getLength()
				 + " - " + disc.getCost() + "$");
	}

    public void printBook(Book book) {
        System.out.println(book.getTitle() + " - " + book.getCategory() + " - " + book.getAuthors()
                + ": " + book.getCost() + " $");
    }

    public void printCompactDisc(CompactDisc cd) {
        System.out.println(cd.getTitle() + " - " + cd.getCategory() + " - " + cd.getArtist()
                + " - " + cd.getLength() + ": " + cd.getCost() + " $");
    }

    public void printOrder() {
        System.out.println("*******************************CART*******************************");
        int i = 0;
        for (Media media : itemsOrdered) {
            i++;
            System.out.print(i + ". ");
            if (media instanceof DigitalVideoDisc) {
                System.out.print("DVD - ");
                printDisc((DigitalVideoDisc) media);
            } else if (media instanceof Book) {
                System.out.print("Book - ");
                printBook((Book) media);
            } else if (media instanceof CompactDisc) {
                System.out.print("CD - ");
                printCompactDisc((CompactDisc) media);
            }
        }
        System.out.println("Total cost: " + totalCost() +"$");
        System.out.println("*******************************************************************\n");
    }
    
     public String showCart() {
    	ArrayList<Media> mediae = new ArrayList<Media>();

        // Create some media and add them to the list
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        mediae.add(dvd1);

        CompactDisc cd1 = new CompactDisc(2,"Nevermind", "Rock", 17.99f, 12, "Nirvana");
        mediae.add(cd1);

        Book book1 = new Book(3,"The Great Gatsby", "Classic", 12.5f);
        mediae.add(book1);

        // Iterate through the list and print out the information of each item
    	mediae.add(cd1);
    	mediae.add(dvd1);
    	mediae.add(book1);
    	for (Media m: mediae) {
    		System.out.println(m.toString());
    	}
		return null;
    	
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void addMedia(Media media) {
        itemsOrdered.add(media);
    }
    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

	public Media searchMediaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}

	public Media searchMediaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Media> filterMediaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sortByCostTitle() {
		// TODO Auto-generated method stub
		
	}

	public void sortByTitleCost() {
		// TODO Auto-generated method stub
		
	}



}