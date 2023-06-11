package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.playable.Playable;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track() {
    }
    public Track(String title) {
        this.title = title;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    
    @Override
	public boolean equals(Object obj) {
		if (obj!=null && this.title == ((Track) obj).getTitle()
				&& this.length == ((Track) obj).getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object obj) {
		int titleCompare = this.title.compareTo(((Track) obj).getTitle());
		int lengthCompare = this.length - ((Track) obj).getLength();
		return (titleCompare == 0) ? lengthCompare : titleCompare;
	}
}