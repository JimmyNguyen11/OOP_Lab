package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
    	
        return title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
    }

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(int id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public boolean equals(Object obj) {
		if (obj!=null && this.id == ((Media) obj).getId()) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Object obj) {
		return this.title.compareTo(((Media) obj).getTitle());
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	// Sort by title then cost
//	java.util.Collection.sort(collection, Media.COMPARE_BY_TITLE_COST);
//
//	// Sort by cost then title
//	Collections.sort(cart.getItemsOrdered(), new MediaComparatorByCostTitle());

}