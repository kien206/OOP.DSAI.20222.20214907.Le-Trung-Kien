package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    private List<Media> cartList = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!cartList.contains(media)) {
            cartList.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (cartList.contains(media)) {
            cartList.remove(media);
        }
    }

    public float totalCost() {
        float cost = 0; 
        for (Media media: itemsOrdered) {
            cost += media.getCost();
        }
        return cost;
    }

    public void printList() {
        System.out.println("***********************CART***********************");
        System.out.println("Items ordered: ");
        for (Media dvd: itemsOrdered) {
            if (dvd != null) {
                System.out.println(dvd.getId() + ". " + dvd.toString());
            }
          
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int idToMatch) {
        boolean dvdFound = false;
        for (Media dvd: itemsOrdered) {
            if (dvd.getId() == idToMatch) {
                dvd.toString();
                dvdFound = true;
            }
        }
        if (dvdFound == false) {
            System.out.println("Item not found.");
        } 
    }

    public void searchByTitle(String titleToMatch) {
        boolean dvdFound = false;
        for (Media dvd:itemsOrdered) {
            if (((DigitalVideoDisc) dvd).isMatch(titleToMatch)) {
                dvd.toString();
                dvdFound = true;
            }
        }
        if (dvdFound == false) {
            System.out.println("Item not found.");
        }
    }
}

