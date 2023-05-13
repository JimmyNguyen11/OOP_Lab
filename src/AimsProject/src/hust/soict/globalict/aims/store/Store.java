package hust.soict.globalict.aims.store;
import java.util.ArrayList;


public class Store {
    private ArrayList<String> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(String dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(String dvd) {
        itemsInStore.remove(dvd);
    }

    public ArrayList<String> getItemsInStore() {
        return itemsInStore;
    }
}

