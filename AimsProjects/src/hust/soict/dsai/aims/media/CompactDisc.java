package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.Disc;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    private int length = 0;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist,
            List<Track> tracks) {
        super(id, title, category, cost, 0, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String artist, List<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist) {
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }
    
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }

    public int getLength() {
        for (Track track:tracks) {
            length += track.getLength();
        }
        return length;
    }

    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + " - " + this.getLength() + " - " + this.getCost();
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        for (Track track: tracks) {
            track.play();
        }
    }
}
