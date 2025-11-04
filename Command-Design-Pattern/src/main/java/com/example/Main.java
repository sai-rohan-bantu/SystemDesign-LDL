package com.example;

import com.example.Commands.Command;
import com.example.Commands.TVChangeChannel;
import com.example.Commands.TVOnCommand;
import com.example.Devices.RemoteController;
import com.example.Devices.TV;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns!");
        TV tv = new TV();
        Command command = new TVOnCommand(tv);
        RemoteController remote = new RemoteController();
        remote.setCommand(command);
        remote.pressButton();
        command = new TVChangeChannel(tv, 5);
        remote.setCommand(command);
        remote.pressButton();
    }
}