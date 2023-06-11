package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static  Store store = new Store();
    public static  Cart cart = new Cart();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    store.viewStore();
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cart.showCart();
                    cartMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
       } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void viewStore() {
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    store.viewStore();
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    cart.showCart();
                    cartMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void seeMediaDetails() {
        System.out.println("Please enter the title of the media: ");
        String title = scanner.nextLine().trim();
        Media media = store.searchMediaByTitle(title);
        if (media == null) {
            System.out.println("Not found");
        } else {
            int choice;
            do {
                System.out.println(media);
                mediaDetailsMenu();
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addMediaToCart();
                        cart.showCart();
                        break;
                    case 2:
                        playMedia();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 0);
        }
    }

    public static void addMediaToCart() {
        System.out.println("Please enter the title of the media: ");
        String title = scanner.nextLine().trim();
        Media media = cart.searchMediaByTitle(title);
        if (media == null) {
            cart.addMedia(store.searchMediaByTitle(title));
        } else {
            System.out.println("Media is already in cart");
        }
    }

    public static void playMedia() {
        System.out.println("Please enter the title of the media");
        String title = scanner.nextLine().trim();
        Media media = store.searchMediaByTitle(title);
        if (media instanceof Book) {
            System.out.println("Cannot play this media");
        }
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc disc = (DigitalVideoDisc) media;
            if(disc.getLength() < 0) {
                System.out.println("Cannot play this disc");
            } else {
                disc.play();
            }
        }
        if (media instanceof CompactDisc) {
            CompactDisc disc = (CompactDisc) media;
            if (disc.getLength() < 0) {
                System.out.println("Cannot play this disc");
            } else {
                disc.play();
            }
        }
    }
    public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add media");
        System.out.println("2. Remove media");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void updateStore() {
        int choice;
        do {
            updateStoreMenu();
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void addMediaToStore() {
        int choice;
        do {
            System.out.println("Add Media to Store: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add book");
            System.out.println("2. Add DVD");
            System.out.println("3. Add CD");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            choice = scanner.nextInt();scanner.nextLine();
            switch(choice) {
                case 1:
                    store.addBook();
                    break;
                case 2:
                    store.addDvd();
                    break;
                case 3:
                    store.addCd();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }

    public static void removeMediaFromStore() {
        int choice;
        do {
            store.viewStore();
            System.out.println("Remove from store: ");
            System.out.println("--------------------------------");
            System.out.println("1. Remove by ID");
            System.out.println("2. Remove by Title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();scanner.nextLine();
                    Media removeId = store.searchMediaById(id);
                    store.removeMedia(removeId);
                    break;
                case 2:
                    System.out.println("Enter title: ");
                    String title = scanner.next();
                    Media removeTitle = store.searchMediaByTitle(title);
                    store.removeMedia(removeTitle);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }
    public static void cartMenu() {
        int choice;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    filterMediaInCart();
                    break;
                case 2:
                    sortMediaInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    cart.placeOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void filterMediaInCart(){
        int choice;
        do {
            cart.showCart();
            System.out.println("Filter medias in cart: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by ID");
            System.out.println("2. Filter by Title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter id:");
                    int id = scanner.nextInt();scanner.nextLine();
                    Media filterId = cart.searchMediaById(id);
                    if (filterId == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(filterId.toString());
                    }
                    break;
                case 2:
                    System.out.println("Enter title:");
                    String title = scanner.nextLine().trim();
                    ArrayList<Media> mediaArrayList = cart.filterMediaByTitle(title);
                    if (mediaArrayList.isEmpty()) {
                        System.out.println("Not found");
                    } else {
                        for(Media media : mediaArrayList) {
                            System.out.println(media.toString());
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }
    public static void sortMediaInCart() {
        int choice;
        do {
            cart.showCart();
            System.out.println("Sort medias in cart: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by Cost");
            System.out.println("2. Sort by Title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    cart.sortByCostTitle();
                    cart.showCart();
                    break;
                case 2:
                    cart.sortByTitleCost();
                    cart.showCart();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }
    public static void removeMediaFromCart() {
        int choice;
        do {
            cart.showCart();
            System.out.println("Remove from cart: ");
            System.out.println("--------------------------------");
            System.out.println("1. Remove by ID");
            System.out.println("2. Remove by Title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            choice = scanner.nextInt();scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();scanner.nextLine();
                    Media removeId = cart.searchMediaById(id);
                    cart.removeMedia(removeId);
                    break;
                case 2:
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine().trim();
                    Media removeTitle = cart.searchMediaByTitle(title);
                    cart.removeMedia(removeTitle);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 0);
    }
}