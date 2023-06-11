package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.playable.Playable;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(int id, String title) {
        super(id, title);
    }
    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public DigitalVideoDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
    }
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}