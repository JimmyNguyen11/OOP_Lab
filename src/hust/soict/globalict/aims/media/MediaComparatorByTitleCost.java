package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int result = media1.getTitle().compareTo(media2.getTitle());
    
        if (result == 0) {
            if (media1.getCost() > media2.getCost()) {
                result = -1;
            } else if (media1.getCost() < media2.getCost()) {
                result = 1;
            } else {
                result = 0;
            }
        }
    
        return result;
    }
}