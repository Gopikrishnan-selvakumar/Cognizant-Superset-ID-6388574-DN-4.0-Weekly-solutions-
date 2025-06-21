package com.command.home.commands;

import com.command.home.Command;
import com.command.home.receiver.Light;

public class LightOffCommand implements Command {
    private final Light light;
    public LightOffCommand(Light light) { this.light = light; }
    @Override public void execute()     { light.off(); }
}
