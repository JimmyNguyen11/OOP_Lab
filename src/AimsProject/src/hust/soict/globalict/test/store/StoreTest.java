package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Add DVDs to the store
        store.addDVD("DVD 1");
        store.addDVD("DVD 2");
        store.addDVD("DVD 3");

        System.out.println("DVDs in store:");
        System.out.println(store.getItemsInStore());

        // Remove DVDs from the store
        store.removeDVD("DVD 2");

        System.out.println("DVDs in store after removal:");
        System.out.println(store.getItemsInStore());
    }
}
