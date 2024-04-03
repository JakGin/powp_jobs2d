package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    public void deleteCommand(DriverCommand command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
