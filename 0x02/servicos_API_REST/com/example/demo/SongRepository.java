import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public SongRepository() {
        this.list = Arrays.asList(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", 1975),
                new Song(2, "Imagine", "John Lennon", "Imagine", 1971));
    }

    public List <Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
       return (Song) list.stream().filter(c ->id.equals(c.getId()));
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
     list.stream().filter(song1 -> song1.getName().equals(s.getName())).findFirst().ifPresent(song1 -> song1.setName(s.getName()));
    }

    public void removeSong(Song s) {
        list.removeIf(song -> song.getName().equals(s.getName()));
    }
}
