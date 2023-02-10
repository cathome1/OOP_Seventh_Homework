package terminal;

import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.CommandResult;
import terminal.executable.factories.CommandExecutableFactory;
import terminal.parser.CommandParser;
import terminal.view.ResultView;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    private final ResultView resultView;

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, ResultView resultView) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.resultView = resultView;
    }

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, ResultView resultView) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, resultView);
        }
        return terminalReader;
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            Command command = commandParser.parseCommand(input);

            CommandExecutable commandExecutable = commandExecutableFactory.create(command);
            CommandResult result = commandExecutable.execute();

            resultView.processCommandResult(result);
        }
    }
}
