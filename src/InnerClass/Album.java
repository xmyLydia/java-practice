package InnerClass;

import java.util.List;

/**
 * @author mingyux
 */
public class Album {

    private String name;
    private SongList songList;

    public Album(String name) {
        this.name = name;
        this.songList = new SongList();
    }

    public void setSongList(SongList songList) {
        this.songList = songList;
    }

    public void addSong(String songName, double duration) {
        this.songList.add(new Song(songName, duration));
    }

    void addSongToPlayList(Song song, List<Song> playList) {
        if (this.songList != null) {
            int index = this.songList.findSong(song);
            if (index == -1) {
                playList.add(song);
            }
        }
    }

    class SongList {
        private List<Song> songs;

        public void setSongs(List<Song> songs) {
            this.songs = songs;
        }

        public List<Song> getSongs() {
            return songs;
        }

        private void add(Song song) {
            this.songs.add(song);
        }


        private int findSong(Song song) {
            if(this.songs == null){
                return -1;
            }
            if (songs != null) {
                for (int i = 0; i < songs.size(); i++) {
                    Song temp = songs.get(i);
                    if (temp.getTitle() != null && temp.getTitle().equals(song.getTitle())) {
                        return i;
                    }
                }
            }
            return -1;
        }

    }

    public List<Song> getSongList() {
        return this.songList.getSongs();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
