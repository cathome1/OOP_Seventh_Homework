package terminal.executable.executables;

import service.StudentService;
import terminal.Command;

public class DeleteStudentByFioExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для удаления студента по его фио ";

    private final StudentService studentService;
    private final String fio;

    public DeleteStudentByFioExecutable(StudentService studentService, Command command) {
        this.studentService = studentService;
        this.fio = command.getAttributes().get(1);
    }

    @Override
    public CommandResult execute() {
        boolean isSuccess = studentService.deleteByLastName(fio);
        return createResult(isSuccess);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION +
                "'fio'=" + fio +" ";
    }
}
