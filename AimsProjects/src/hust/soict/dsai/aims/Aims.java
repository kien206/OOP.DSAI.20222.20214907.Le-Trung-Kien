package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String args[]) {
        // Create new cart
        Cart anOrder = new Cart();

        // Create new DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
        "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        anOrder.addMedia(dvd3);

        anOrder.removeMedia(dvd2);

        //print out total cost
        System.out.print("Total cost is: ");
        System.out.print(anOrder.totalCost());
    }
}