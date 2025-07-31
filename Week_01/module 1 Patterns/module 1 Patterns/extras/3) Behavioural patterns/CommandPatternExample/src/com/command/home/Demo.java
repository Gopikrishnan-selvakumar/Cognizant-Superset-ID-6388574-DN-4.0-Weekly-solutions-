package com.command.home;

import com.command.home.commands.*;
import com.command.home.invoker.RemoteControl;
import com.command.home.receiver.Light;

public class Demo {
    public static void main(String[] args) {

        Light livingRoomLight = new Light("Living‑Room");
        Light kitchenLight    = new Light("Kitchen");

        Command livingOn  = new LightOnCommand(livingRoomLight);
        Command livingOff = new LightOffCommand(livingRoomLight);

        Command kitchenOn  = new LightOnCommand(kitchenLight);
        Command kitchenOff = new LightOffCommand(kitchenLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(livingOn);  remote.pressButton();
        remote.setCommand(livingOff); remote.pressButton();

        System.out.println("-----");

        remote.setCommand(kitchenOn);  remote.pressButton();
        remote.setCommand(kitchenOff); remote.pressButton();
    }
}
