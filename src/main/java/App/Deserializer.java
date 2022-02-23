package App;

import java.util.ArrayList;

public class Deserializer {
    private String _id;
    private ArrayList<String> tags;
    private String content;
    private String author;
    private int length;
    private String dateAdded;
    private String dateModified;

    public String getId() {
        return _id;
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

    public static void printObjectInfo(Deserializer object) {
        System.out.println(object._id);
        System.out.println(object.tags);
        System.out.println(object.content);
        System.out.println(object.author);
        System.out.println(object.length);
        System.out.println(object.dateAdded);
        System.out.println(object.dateModified);
    }


    public static String stringify(Deserializer object) {
        return object._id + "\n" +
                object.tags + "\n" +
                object.content + "\n" +
                object.author + "\n" +
                object.length + "\n" +
                object.dateAdded + "\n" +
                object.dateModified + "\n";
    }
}
