package com.example.Devices;

import com.example.Commands.Command;

public class RemoteController {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
