package ro.develbox.protocol;

import ro.develbox.commands.Command;

public interface ICommandSender {

    public void sendCommand(Command command);

}
