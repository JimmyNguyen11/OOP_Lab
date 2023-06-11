package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(int id, String title) {
        super(id, title);
    }

    public Book(int id, String title, String category) {
        super(id, title, category);
    }
    
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    
    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("This author's name has been added successfully.");
        }
        else System.out.println("This author's name has already been added to the list.");
    }

    void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("This author's name has been removed successfully.");
        }
        else System.out.println("This author's name is not presented in the list.");
    }
}