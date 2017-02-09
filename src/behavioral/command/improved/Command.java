package behavioral.command.improved;

public interface Command {
    /**
     * Perform the specific logic for this command
     */
    void action();

    /**
     * Undo your action that you just performed
     */
    void undo();
}
