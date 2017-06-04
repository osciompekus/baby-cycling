package ro.develbox.commands.protocol;

import ro.develbox.commands.Command;
import ro.develbox.commands.protocol.exceptions.ProtocolViolatedException;

@SuppressWarnings("serial")
public class ProtocolViolatedTestException extends ProtocolViolatedException {

    public ProtocolViolatedTestException(String cause, Command command, Command prevCommand) {
        super(cause, command, prevCommand);
    }

    @Override
    public String getMessage() {
        return cause + " testException";
    }
    
    @Override
    protected String describeCommand(Command command) {
        return " test desc ";
    }

}
