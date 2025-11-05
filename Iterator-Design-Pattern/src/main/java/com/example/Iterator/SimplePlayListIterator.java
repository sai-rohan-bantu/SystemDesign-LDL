package com.example.Iterator;

import com.example.PlayList.PlayList;

import java.util.List;


public class SimplePlayListIterator implements PlaylistIterator {
    private PlayList playList;
    private int position = 0;
    private List<String> songs;
    public SimplePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.songs = playList.getSongs();
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public String next() {
        return playList.getSongs().get(position++);
    }
}
