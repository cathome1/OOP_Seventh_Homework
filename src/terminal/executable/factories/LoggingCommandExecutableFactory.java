package terminal.executable.factories;

import service.StudentService;
import terminal.Command;
import terminal.executable.executables.CommandExecutable;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LoggingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.printf("Вы ввели: %s\n", command);
        CommandExecutable commandExecutable = super.create(command);
        return commandExecutable;
    }
}
