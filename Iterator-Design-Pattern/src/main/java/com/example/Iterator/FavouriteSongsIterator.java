package com.example.Iterator;

import com.example.PlayList.PlayList;

import java.util.List;

public class FavouriteSongsIterator implements PlaylistIterator {
    private List<String> songs;
    private int position = 0;
    private PlayList playList;

    public FavouriteSongsIterator(PlayList playList) {
        this.songs = playList.getSongs();
    }

    @Override
    public boolean hasNext() {
        while(position < playList.getSongs().size()) {
            String song = songs.get(position);
            if(song.contains("Fav")) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public String next() {
        return playList.getSongs().get(position++);
    }
}
