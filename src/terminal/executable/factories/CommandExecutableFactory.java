package terminal.executable.factories;

import terminal.Command;
import terminal.executable.executables.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
