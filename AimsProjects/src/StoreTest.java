public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sinh vien Bach Khoa");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Hoc thi khong hoc");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("????");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.removeDVD(dvd2);

    }
    
}
