package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list;

    public SongRepository(List<Song> list) {
        this.list = list;
        this.list.addAll(Arrays.asList(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975"),
                new Song(2, "Imagine", "John Lennon", "Imagine", "1971")));

    }

    public List <Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
       return list.stream().filter(c ->id.equals(c.getId())).findFirst().get();
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
     list.stream().filter(song1 -> song1.getNome().equals(s.getNome())).findFirst().ifPresent(song1 -> song1.setNome(s.getNome()));
    }

    public void removeSong(Song s) {
        list.removeIf(song -> song.getNome().equals(s.getNome()));
    }
}
