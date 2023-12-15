package Drives;
import static Music.Styles.*;
import Music.Song;
import Services.MusicService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disk {
    public void setSonglist(List<Song> songlist) {
        this.songlist = songlist;
    }

    public void setService(MusicService service) {
        this.service = service;
    }

    public List<Song> getSonglist() {
        return songlist;
    }

    public MusicService getService() {
        return service;
    }

    private List<Song> songlist = new ArrayList<>();
    private MusicService service = new MusicService();

    public Disk() {
        songlist.add(new Song("Queen - we will rock you ", 2.49, ROCK));
        songlist.add(new Song("Twenty One Pilots – Stressed out ", 3.22, RAP_AND_HIPHOP));
        songlist.add(new Song("Guns N’ Roses - Sweet Child O' Mine ", 3.55, ROCK));
        songlist.add(new Song("Twenty One Pilots – Heavydirtysoul ", 3.03, RAP_AND_HIPHOP));
        songlist.add(new Song("Kygo - Fragile", 3.51, POP));
        songlist.add(new Song("Nickback - Hero ", 3.21, ROCK));
        songlist.add(new Song("Shakira - Waka waka ", 3.22, POP));
        songlist.add(new Song("Mozart - Requiem", 4.35, CLASSIC));
        songlist.add(new Song("Feint - Snake Eyes ", 2.49, ELECTRONIC));
        songlist.add(new Song("Bring Me The Horizon – Can You Feel My Heart ", 3.22, METAL));
        songlist.add(new Song("Green Day - American Idiot ", 3.55, PUNK));
        songlist.add(new Song("Bill Withers – Just The Two of Us ", 3.03, JAZZ));
        songlist.add(new Song("Architects - Doomsday", 3.51, METAL));
        songlist.add(new Song("Radiohead - Karma Police ", 3.21, INDIE));
        songlist.add(new Song("The Prodigy - Firestarter ", 3.22, ELECTRONIC));
        songlist.add(new Song("Oasis - Wonderwall", 4.35, INDIE));

        service.getSonglist(songlist);
        service.getTotalDuration(songlist);
        service.sortingByStyle(songlist, ROCK);
        service.findByRange(2.49, 3.03, songlist);
        Files file = new Files();
        file.createFile(songlist);
    }

    public Disk(String listname) {

    }

    public void addSong() {
        System.out.println("Please make choice and press Enter");
        System.out.println("1: Create Disk");
        System.out.println("2: Add song");

    }
    public void removeSong() {
        Scanner scanner = new Scanner(System.in);
        service.getSonglist(songlist);
        System.out.println("Please choose song num and press Enter 1-n");
        songlist.remove(scanner.nextInt());
    }
}
