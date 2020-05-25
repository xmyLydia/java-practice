package InnerClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public class Album {

    private String name;

    class SongList {
        List<Song> songs = new ArrayList<>();

        public void addSong(String songName, double duration) {
            Song song = new Song(songName, duration);
            songs.add(song);
        }

        private int findSong(String songName) {
            if (songs != null) {
                for (int i = 0; i < songs.size(); i++) {
                    Song temp = songs.get(i);
                    if (temp.getTitle() != null && temp.getTitle().equals(songName)) {
                        return i;
                    }
                }
            }
            return -1;
        }

        public List<Song> getSongs() {
            return songs;
        }

        public void setSongs(List<Song> songs) {
            this.songs = songs;
        }
    }

    public List<Song> getSongList() {
        SongList songList = new SongList();
        return songList.getSongs();
    }

    public Album(List<Song> songs, String name) {
        SongList songList = new SongList();
        songList.songs = songs;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
