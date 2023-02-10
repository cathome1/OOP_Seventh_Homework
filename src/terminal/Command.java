package terminal;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public static final String ADD = "cr";
    public static final String REMOVE = "rm";

    public static final String BY_NAME = "-n";
    public static final String BY_AGE_AND_GROUP = "-ag";

    private final String mainCommand;
    private final List<String> attributes;

    public Command(List<String> commands) {
        this.mainCommand = commands.get(0);
        this.attributes = new ArrayList<>(commands);

        if (attributes.size() > 0) {
            attributes.remove(0);
        }
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public String getMainCommand() {
        return mainCommand;
    }

    public boolean isAddCommand() {
        return mainCommand.equals(ADD);
    }

    public boolean isDeleteByFioCommand() {
        return mainCommand.equals(REMOVE) &&
                !attributes.isEmpty() &&
                attributes.get(0).equals(BY_NAME);
    }

    public boolean isDeleteByAgeAndGroupCommand() {
        return mainCommand.equals(REMOVE) &&
                !attributes.isEmpty() &&
                attributes.get(0).equals(BY_AGE_AND_GROUP);
    }

    @Override
    public String toString() {
        return "Command{" +
                "mainCommand='" + mainCommand + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
