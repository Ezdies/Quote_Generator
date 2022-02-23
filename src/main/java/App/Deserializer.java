package App;

import java.util.ArrayList;

public class Deserializer {
    private String id;
    private ArrayList<String> tags;
    private String content;
    private String author;
    private int length;
    private String dateAdded;
    private String dateModified;

    public String getId() {
        return id;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getDateModified() {
        return dateModified;
    }

    public static void printObjectInfo(Deserializer object){
        System.out.println(object.getId());
        System.out.println(object.getTags());
        System.out.println(object.getContent());
        System.out.println(object.getAuthor());
        System.out.println(object.getLength());
        System.out.println(object.getDateAdded());
        System.out.println(object.getDateModified());
    }
}
