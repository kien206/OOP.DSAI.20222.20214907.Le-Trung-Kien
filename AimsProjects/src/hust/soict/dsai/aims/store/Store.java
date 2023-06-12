package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
    private static int count = 0;
    
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
        }
    }

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void display(){
        for (Media media: itemsInStore){
            System.out.println(media);
        }
    }
}