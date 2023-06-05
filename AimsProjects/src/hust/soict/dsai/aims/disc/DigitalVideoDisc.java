package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Disc;

public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;
    private static int nbDigitalVideoDisc = 0;
    
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category , float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
    }
    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
    }

    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + length + ": " + this.getCost() + "$"; 
    }

    public boolean isMatch(String titleToCompare) {
        return this.getTitle().equalsIgnoreCase(titleToCompare);
    }
    
}
