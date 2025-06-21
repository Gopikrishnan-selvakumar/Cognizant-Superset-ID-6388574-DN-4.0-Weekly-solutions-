package com.command.home.invoker;

import com.command.home.Command;

public class RemoteControl {
    private Command slot;
    public void setCommand(Command cmd) { this.slot = cmd; }
    public void pressButton() {
        if (slot == null) throw new IllegalStateException("No command set");
        slot.execute();
    }
}
