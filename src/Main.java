import repository.StudentRepository;
import service.StudentService;
import terminal.TerminalReader;
import terminal.executable.factories.CommandExecutableFactory;
import terminal.executable.factories.CommandExecutableFactoryImpl;
import terminal.menu.Menu;
import terminal.parser.CommandParser;
import terminal.parser.CommandParserImpl;
import terminal.view.ResultView;
import terminal.view.ResultViewImpl;

public class Main {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();
        ResultView view = new ResultViewImpl();

        Menu.display();
        TerminalReader.getInstance(parser, factory, view)
                .run();
    }
}
