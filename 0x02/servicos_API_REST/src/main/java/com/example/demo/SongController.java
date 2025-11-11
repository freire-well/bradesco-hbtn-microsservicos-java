package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/welcome")
    public String mensagemBoasVindas() {
       return "Bem-vindo ao serviço de músicas!";
    }

    @GetMapping(path = "/allSongs")
    public List<Song> getAllSongs() {
        return songRepository.getAllSongs();
    }

    @GetMapping(path = "/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return songRepository.getSongById(id);
    }

    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    public ResponseEntity addSong(@RequestBody Song song) {
        try{songRepository.addSong(song);}catch (Exception e){}
        return ResponseEntity.ok().build();
    }

    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public ResponseEntity updadeSong(@RequestBody Song song) {
        try{songRepository.updateSong(song);}catch (Exception e){}
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song) {
        songRepository.removeSong(song);
    }
}