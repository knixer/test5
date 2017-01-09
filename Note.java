package com.example.christopherono.adaptermednote;

/**
 * Created by ChristopherOno on 2016-11-17.
 */

public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;

    private Category category;

    public enum Category{ Christopher, Kärlek, Nurre, RoseMarie};

    public Note(String title, String message, Category category){
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMilli = 0;
    }

    public Note(String title, String message, Category category, long noteId, long dateCreatedMilli){
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = noteId;
        this.dateCreatedMilli = dateCreatedMilli;
    }

    public String getTitle(){
        return title;
    }

    public String getMEssage(){
        return message;
    }

    public Category getCategory(){
        return category;
    }

    public long getDate(){
        return dateCreatedMilli;
    }

    public long getId(){
        return noteId;
    }

    public String toString(){
        return "ID: " + noteId + "Title: " + title + "Message: " + message + " IconID: " + category.name()
                + " Date: ";
    }

    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }

    public static int categoryToDrawable(Category noteCategory){

        switch(noteCategory){
            case Christopher:
                return R.drawable.c;
            case Kärlek:
                return R.drawable.k;
            case Nurre:
                return R.drawable.n;
            case RoseMarie:
                return R.drawable.r;
        }

        return R.drawable.c;
    }
}
