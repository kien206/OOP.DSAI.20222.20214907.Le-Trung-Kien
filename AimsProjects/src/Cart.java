public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    protected int qtyOrderd = 0;
    
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        for (int i=0; i<MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                itemsOrdered[i] = disc;
                qtyOrderd += 1;
                System.out.println("The disc has been added.");
                break;
            }
            if ((i == itemsOrdered.length -1) && (itemsOrdered[i] != null)) {
                System.out.println("The cart is full.");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {

        for (DigitalVideoDisc dvd : dvdList) {
            for (int i=0; i<MAX_NUMBERS_ORDERED; i++) {
                if (itemsOrdered[i] == null) {
                    itemsOrdered[i] = dvd;
                    qtyOrderd += 1;
                    System.out.println("The disc has been added.");
                }
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        for (int i=0; i<MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                itemsOrdered[i] = dvd1;
                if ((i+1) <= MAX_NUMBERS_ORDERED) {
                    itemsOrdered[i+1] = dvd2;    
                }
                else {
                    System.out.println("The cart is full.");
                }
            }
        }
    }

    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
        for (int i=0; i<MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == disc) {
                itemsOrdered[i] = null;
                qtyOrderd -= 1;
                System.out.println("The disc has been removed.");
                break;
            } else {
                System.out.println("Disc not found.");
            }
        }
    }

    public float totalCost() {
        float cost = 0; 
        for (int i=0; i<MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] != null) {
                cost += itemsOrdered[i].getCost();
            }
        }
        return cost;
    }
}

