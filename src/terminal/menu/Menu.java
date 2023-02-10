package terminal.menu;

import terminal.Command;

public class Menu {
    private final static String output = "Введите команды:\n" +
            "\t'" + Command.ADD + "' для создания\n" +
            "\t'" + Command.REMOVE + " -ag, -n' для удаления";

    public static void display() {
        System.out.println(output);
    }
}
