package terminal.view;

import terminal.executable.executables.CommandResult;

public class ResultViewImpl implements ResultView {

    @Override
    public void processCommandResult(CommandResult commandResult) {
        System.out.println(commandResult);
    }
}
