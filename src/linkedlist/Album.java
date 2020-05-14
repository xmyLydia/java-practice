package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public class Album {
    private List<Song> songList = new ArrayList<>();
    private String name;

    public Album(List<Song> songList, String name) {
        this.songList = songList;
        this.name = name;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
