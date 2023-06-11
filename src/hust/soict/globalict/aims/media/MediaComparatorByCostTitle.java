package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int result = Double.compare(media2.getCost(), media1.getCost());
    
        if (result == 0) {
            result = media1.getTitle().compareTo(media2.getTitle());
        }
    
        return result;
    }
}