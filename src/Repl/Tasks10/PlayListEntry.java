package Repl.Tasks10;

public class PlayListEntry {
    private String title = "";
    private String artist = "";
    private int playCount = 0;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }
}


/*

Write the definition of a class PlayListEntry containing:
An instance variable title of type String, initialized to the empty String.
An instance variable artist of type String, initialized to the empty String.
An instance variable playCount of type int, initialized to 0.

In addition, your PlayList class definition should provide an appropriately named "get" method and "set" method for each of these variables that can return the values of each of variable.

No constructor need be defined.
 */