package com.example.PlayList;

import com.example.Iterator.FavouriteSongsIterator;
import com.example.Iterator.PlaylistIterator;
import com.example.Iterator.ShuffledPlayListIterator;
import com.example.Iterator.SimplePlayListIterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<String> songs;

    public PlayList() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public PlaylistIterator iterator(String type){
        if(type.equalsIgnoreCase("SHUFFLED")){
            return new ShuffledPlayListIterator(this);
        } else if(type.equalsIgnoreCase("FAVOURITE")){
            return new FavouriteSongsIterator(this);
        } else {
            return new SimplePlayListIterator(this);
        }

    }
    public List<String> getSongs() {
        return songs;
    }
}
