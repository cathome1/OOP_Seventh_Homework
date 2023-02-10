package terminal.executable.factories;

import service.StudentService;
import terminal.Command;
import terminal.executable.executables.*;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    protected final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable create(Command command) {

        if (command.isAddCommand()) {
            return new CreateStudentExecutable(studentService, command);
        }

        if (command.isDeleteByFioCommand()) {
            return new DeleteStudentByFioExecutable(studentService, command);
        }

        if (command.isDeleteByAgeAndGroupCommand()) {
            return new DeleteStudentByAgeAndGroupNumberExecutable(studentService, command);
        }

        return new NoneCommandExecutable();
    }
}
