package Services;
import Music.Styles;
import Music.Song;
import java.util.List;

public class MusicService {
    private static final String TOTAL_DURATION = "Total duration: ";
    private static final String MIN = " min";
    private Double duration = 0.0;


    public void getSonglist(List<Song> songlist) {
        for (Song t : songlist) {
            System.out.println(t.toString());
        }
        System.out.println();
    }

    public void getTotalDuration(List<Song> songlist) {
        for (int i = 0; i < songlist.size(); i++) {
            duration += songlist.get(i).getDuration();
        }
        System.out.println(TOTAL_DURATION + duration + MIN);
        System.out.println();
    }

    public void sortingByStyle(List<Song> songlist, Styles style) {
        for (Song t : songlist) {
            if (t.getStyle() == style) {
                System.out.println(t.toString());
            }
        }
        for (Song t : songlist) {
            if (t.getStyle() != style) {
                System.out.println(t.toString());
            }
        }
        System.out.println();
    }

    public void findByRange(Double from, Double to, List<Song> songlist) {
        for (int i = 0; i < songlist.size(); i++) {
            if (songlist.get(i).getDuration() >= from && songlist.get(i).getDuration() <= to) {
                System.out.println(songlist.get(i).toString());
            }
        }
    }
}
