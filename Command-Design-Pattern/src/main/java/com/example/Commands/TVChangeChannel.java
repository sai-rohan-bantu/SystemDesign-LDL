package com.example.Commands;

import com.example.Devices.TV;

public class TVChangeChannel implements Command {
    private final TV tv;
    private final int channel;

    public TVChangeChannel(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
