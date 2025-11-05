package com.example.Iterator;

import com.example.PlayList.PlayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffledPlayListIterator implements PlaylistIterator {
    private PlayList pLayList;
    private int position = 0;
    private final List<String> shuffledSongs ;

    public ShuffledPlayListIterator(PlayList playList) {
        this.pLayList = playList;
        this.shuffledSongs = new ArrayList<>(playList.getSongs());
        Collections.shuffle(shuffledSongs);

    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(position++);
    }


}
