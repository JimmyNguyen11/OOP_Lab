package hust.soict.globalict.aims.order;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;
//import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10; // max number of items in an order
    public static final int MAX_LIMITED_ORDERS = 5; // max number of orders
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nbOrders = 0;
    float freeDisc = 0;
    int count = 0; 
    
   // private MyDate dateOrdered = new MyDate();

    public Order() {
        if (nbOrders < MAX_LIMITED_ORDERS) nbOrders++;
        else {
            System.out.println("You have reached maximum number of orders!");
            System.out.println("Cannot create new order!");
            System.exit(0);
        }
    }

    public int orderSize() {
        return itemsOrdered.size();
    }
    
    public void addMedia(Media m) {// add item to order
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(m);
            System.out.println("Item has been added.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }

        else {
            System.out.println("The list is full.");
            System.out.println("Delete item(s) to add new items to list.");
        }
    }

    public Book addBook(Scanner scanInfo) {
        System.out.print("ID: "); 
        int id = scanInfo.nextLine();
        System.out.print("Title: "); 
        String title = scanInfo.nextLine();
        System.out.print("Category: "); 
        String category = scanInfo.nextLine();
        System.out.print("Authors (separate by\',\'): "); 
        String[] author = scanInfo.nextLine().split(",");
        System.out.print("Cost (enter a float, e.g. \"12.34\"): ");
        float cost = Float.parseFloat(scanInfo.nextLine());

        List<String> authors = new ArrayList<String>();
        for (String splitAuthor: author) {
            authors.add(splitAuthor.trim());
        }

        Book book = new Book(id, title, category, cost, authors);
        return book;
    }

    public DigitalVideoDisc addDVD(Scanner scanInfo) {
        System.out.print("ID: "); 
        String id = scanInfo.nextLine();
        System.out.print("Title: "); 
        String title = scanInfo.nextLine();
        System.out.print("Category: "); 
        String category = scanInfo.nextLine();
        System.out.print("Director: "); 
        String director = scanInfo.nextLine();
        System.out.print("Length (enter an integer): ");
        int length = Integer.parseInt(scanInfo.nextLine()); 
        System.out.print("Cost (enter a float, e.g. \"12.34\"): ");
        float cost = Float.parseFloat(scanInfo.nextLine());

        DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, cost, length, director);

        System.out.print("Do you want to play this DVD? (y/n) ");
        String isPlay = scanInfo.nextLine();
        if (isPlay.equalsIgnoreCase("y")) {
            dvd.play();
        }
        else if (isPlay.equalsIgnoreCase("n")) return dvd;
        else System.out.println("ERROR: Wrong input!");

        return dvd;
    }

    public CompactDisc addCD(Scanner scanInfo) {
        System.out.print("ID: "); 
        String id = scanInfo.nextLine();
        System.out.print("Title: "); 
        String title = scanInfo.nextLine();
        System.out.print("Category: "); 
        String category = scanInfo.nextLine();
        System.out.print("Director: "); 
        String director = scanInfo.nextLine();
        System.out.print("Cost (enter a float, e.g. \"12.34\"): ");
        float cost = Float.parseFloat(scanInfo.nextLine());
        System.out.print("Artist: "); 
        String artist = scanInfo.nextLine();
        int length = 0;
        ArrayList<Track> tracks = addTracks(scanInfo);

        CompactDisc cd = new CompactDisc(id, title, category, cost, length, director, artist, tracks);
        length = cd.getLength();
        System.out.println("--> CD Length: " + length);
        cd = new CompactDisc(id, title, category, cost, length, director, artist, tracks);

        System.out.print("Do you want to play this CD? (y/n) ");
        String isPlay = scanInfo.nextLine();
        if (isPlay.equalsIgnoreCase("y")) {
            cd.play();
        }
        else if (isPlay.equalsIgnoreCase("n")) return cd;
        else System.out.println("ERROR: Wrong input!");
        return cd;
    }

    public ArrayList<Track> addTracks(Scanner scanInfo) {
        System.out.print("Enter number of tracks in CD: ");
        int numbTrack = Integer.parseInt(scanInfo.nextLine());

        ArrayList<Track> tracks = new ArrayList<Track>();

        for (int i=0; i<numbTrack; i++) {
            System.out.println("Track #" + (i+1));
            System.out.print("Title: ");
            String title = scanInfo.nextLine();
            System.out.print("Length (enter an integer): ");
            int length = Integer.parseInt(scanInfo.nextLine());

            Track newTrack = new Track(title, length);
            tracks.add(newTrack);
        }
        return tracks;
    }

    public void removeMedia(Media m) {// remove item from order
        if (itemsOrdered.size() == 0) System.out.println("List is empty. Nothing to remove");
        else {
            itemsOrdered.remove(m);
            System.out.println("Selected item has been removed.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }
    }

    public void removeMediaByID(String mediaID) {// delete item by its ID
        int size = itemsOrdered.size(); // size of list before remove
        if (itemsOrdered.size() == 0) System.out.println("List is empty. Nothing to remove");
        else {
            for (Media i: itemsOrdered) {
                if (i.getId().equalsIgnoreCase(mediaID)) {
                    itemsOrdered.remove(i);
                    System.out.println("Selected item has been removed.");
                    System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
                    return;
                }
            }
            if (itemsOrdered.size() == size) System.out.println("Cannot delete because item with ID \"" + mediaID + "\" has not been added.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }
    }

    public float totalCost() { // get the total cost of current order
        float total = 0;
        for (Media i: itemsOrdered) {
            total += i.getCost();
        }
        return total;
    }

    public void printOrder() {// for customer only
        DecimalFormat df = new DecimalFormat("#.##"); // round up totalCost
        df.setRoundingMode(RoundingMode.CEILING);

        float realTotalCost = totalCost();
        
        System.out.println("***********************Order Details***********************");
        System.out.printf("Date: "); dateOrdered.print();
        System.out.println("ID\tTitle\t\t\tPrice");
        if (itemsOrdered.size() >= 3) {
            int luckyMedia = getALuckyItem();
            realTotalCost = totalCost() - itemsOrdered.get(luckyMedia).getCost();

            for (Media i: itemsOrdered) {
                System.out.print(i.getId()+ "\t" + i.getTitle() + "\t\t\t$" + i.getCost());
                if (itemsOrdered.indexOf(i) == luckyMedia)
                   System.out.print(" --> Free lucky item");
                System.out.print("\n");
            }
        }
        else for (Media i: itemsOrdered) {
            System.out.println(i.getId()+ "\t" + i.getTitle() + "\t\t\t$" + i.getCost());
        }
        System.out.println("Total cost: $" + df.format(realTotalCost));
        System.out.println("***********************************************************\n");
    }

    public void printAvailableItems() {// for admin only
        System.out.println("***********************Available Items***********************");
        System.out.printf("Date: "); dateOrdered.print();
        System.out.println("ID\tTitle\t\tCategory\tPrice");
        
        for (Media i: itemsOrdered) {
            System.out.println(i.getId()+ "\t" + i.getTitle() + "\t\t" + i.getCategory() + "\t\t$" + i.getCost());
        }

        System.out.println("Total number of items: " + itemsOrdered.size());
        System.out.println("***********************************************************\n");
    }

    public void search() {// search an item by title
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item title: ");
        String titleInput = scan.next();
        for (Media i: itemsOrdered) {
            if (i.getTitle().contains(titleInput.toLowerCase())) {
                count++;
                System.out.println(i.getTitle());
            }
        }
        System.out.println("~~ " + count + " result(s) found ~~");
        scan.close();
    }

    public int getALuckyItem() {// random a lucky item that user can get for free if their order had >= 3 items
        if (itemsOrdered.size() >= 3) {
            int luckyItemIndex = 0;
            luckyItemIndex = (int) (Math.random() * itemsOrdered.size());
            return luckyItemIndex;
        }
        return -1;
    }
} 