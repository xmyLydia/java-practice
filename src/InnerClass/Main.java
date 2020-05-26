package InnerClass;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author mingyux
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    static List<Song> playList = new LinkedList<>();

    public static void main(String[] args) {


        Song song1 = new Song("1", 1);
        Song song2 = new Song("2", 2);
        Song song3 = new Song("3", 3);
        List<Song> songList1 = new ArrayList<>();
        songList1.add(song1);
        songList1.add(song2);
        List<Song> songList2 = new ArrayList<>();
        songList2.add(song3);

        Album album1 = new Album("album1");
        Album album2 = new Album("album2");
        Album.SongList songs = album1.new SongList();
        songs.setSongs(songList1);

        Album.SongList songs2 = album2.new SongList();
        songs2.setSongs(songList2);

        album1.addSongToPlayList(song1, playList);
        album1.addSongToPlayList(song2, playList);
        album2.addSongToPlayList(song3, playList);

        menu(playList);
    }

    private static void menu(List<Song> playList) {
        boolean flag = true;
        boolean moveForward = true;
        ListIterator listIterator = playList.listIterator();
        System.out.println("please choose: 1. list all 2. skip forward. 3. skip backward. 4. replay. 5. delete this one." +
                "6. quit");
        while (flag) {
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1: {
                    System.out.println("list below");
                    playList.forEach(song -> System.out.println(song.getTitle()));
                    break;
                }
                case 2: {
                    if (!moveForward) {
                        listIterator.next();
                        moveForward = true;
                    }
                    if (listIterator.hasNext()) {
                        Song song = (Song) listIterator.next();
                        System.out.println(song.getTitle());
                    } else {
                        System.out.println("at the end of playList");
                    }
                    break;
                }
                case 3: {
                    if (moveForward) {
                        listIterator.previous();
                        moveForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        Song song = (Song) listIterator.previous();
                        System.out.println(song.getTitle());
                    } else {
                        System.out.println("at the start of playList");
                    }
                    break;
                }
                case 4: {
                    Song song = (Song) listIterator.next();
                    System.out.println("replay: " + song.getTitle());
                    listIterator.previous();
                    break;
                }
                case 5: {
                    Song song;
                    if (listIterator.hasNext()) {
                        song = (Song) listIterator.next();
                    } else {
                        song = (Song) listIterator.previous();
                    }
                    String name = song.getTitle();
                    listIterator.previous();
                    listIterator.remove();
                    System.out.println(name + " removed");
                }
                case 6:
                default: {
                    flag = false;
                    break;
                }
            }
            System.out.println("please choose: 1. list all 2. skip forward. 3. skip backward. 4. replay");
        }
    }


}
