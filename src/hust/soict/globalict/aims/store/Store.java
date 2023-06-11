package hust.soict.globalict.aims.store;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public boolean addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Error: This media is already in the store!");
            return false;
        }
        itemsInStore.add(media);
        System.out.println("Success: " + media.getTitle() + " has been added to the store.");
        return true;
    }

    public boolean removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Success: " + media.getTitle() + " has been removed from the store.");
            return true;
        }
        System.out.println("Error: This media is not in the store!");
        return false;
    }

    public void viewStore() {
        System.out.println("*******************************STORE*******************************");
        int i = 0;
        for (Media media : itemsInStore) {
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
        System.out.println("*******************************************************************\n");
    }

    private void printDisc(DigitalVideoDisc dvd) {
        System.out.println(dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector()
                + " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
    }

    private void printBook(Book book) {
        System.out.println(book.getTitle() + " - " + book.getCategory() + " - " + book.getAuthors()
                + ": " + book.getCost() + " $");
    }

    private void printCompactDisc(CompactDisc cd) {
        System.out.println(cd.getTitle() + " - " + cd.getCategory() + " - " + cd.getArtist()
                + " - " + cd.getLength() + ": " + cd.getCost() + " $");
    }

	public Media searchMediaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBook() {
		// TODO Auto-generated method stub
		
	}

	public void addDvd() {
		// TODO Auto-generated method stub
		
	}

	public void addCd() {
		// TODO Auto-generated method stub
		
	}

	public Media searchMediaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

