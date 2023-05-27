public class Aims {
    public static void main(String args[]) {
        // Create new cart
        Cart anOrder = new Cart();

        // Create new DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
        "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.removeDigitalVideoDisc(dvd2);

        //print out total cost
        System.out.print("Total cost is: ");
        System.out.print(anOrder.totalCost());
    }
}