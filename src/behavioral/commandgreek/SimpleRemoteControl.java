package behavioral.commandgreek;

/**
 * a simple remote control with one button
 */

public class SimpleRemoteControl {
    Command command;

    SimpleRemoteControl(){}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

}
