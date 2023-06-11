package hust.soict.globalict.aims.media;

import java.util.ArrayList;

import hust.soict.globalict.aims.playable.Playable;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title) {
        super(id, title);
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track has been added.");
        }
        else System.out.println("ERROR: Input track is already in the list.");
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track has been removed.");
        }
        else System.out.println("ERROR: Input track does not exist int the list.");
    }

    public int getLength() {
        int totalLength = 0;
        for (Track i: tracks) {
            totalLength += i.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD director: " + this.getDirector());
        System.out.println("CD artist: " + this.getArtist());

        for (Track i: tracks) {
            i.play();
        }
    }
    
    @Override
	public int compareTo(Object obj) {
		int lengthCompare = getLength() - ((CompactDisc) obj).getLength();
		int sizeCompare = tracks.size() - ((CompactDisc) obj).getSize();
		return (sizeCompare == 0) ? lengthCompare : sizeCompare;
	}

	private int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}