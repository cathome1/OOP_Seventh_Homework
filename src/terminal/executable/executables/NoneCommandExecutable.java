package terminal.executable.executables;

public class NoneCommandExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда не определена";


    @Override
    public CommandResult execute() {
        return new CommandResult(getDescription());
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION;
    }
}
