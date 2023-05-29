package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    private static int count = 0;
    public void addDVD(DigitalVideoDisc DVD) {
        if (count < itemsInStore.length) {
            itemsInStore[count] = DVD;
            count++;
            System.out.println("Added");
        }
    }
    public void removeDVD(DigitalVideoDisc DVD) {
        for (int i=0;i<count; i++) {
            if (itemsInStore[i] == DVD) {
                itemsInStore[i] = null;
                System.out.println("DVD has been removed from store.");
                count -= 1;
                break;
            } 
        }
    }
}