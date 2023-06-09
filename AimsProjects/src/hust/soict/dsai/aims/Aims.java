package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String args[]) {
        // Create new cart
        Cart anOrder = new Cart();

        // Create new DVD
        Media dvd1 = new DigitalVideoDisc("The Lion King", 
        "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        Media dvd2 = new DigitalVideoDisc("Star Wars", 
        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        Media dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        anOrder.addMedia(dvd3);

        List<String> authors = new ArrayList<String>(); 
        authors.add("LTK");
        Media book1 = new Book(1, "The Jungle Book", "Adventure", 24.99f, authors);
        anOrder.addMedia(book1);

        List<Track> tracks = new ArrayList<Track>();
        Track track1 = new Track("Bohemian Rhapsody", 5);
        Track track2 = new Track("Something", 4);
        tracks.add(track1);
        tracks.add(track2);
        Media cd1 = new CompactDisc(1, "The Queens Classic", "Rock", 29.99f, 58, "LTK", "The Queens", tracks);
        anOrder.addMedia(cd1);

        anOrder.removeMedia(dvd1);
        //print out total cost
        anOrder.printList();
    }
    
}