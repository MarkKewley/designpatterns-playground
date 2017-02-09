package behavioral.command.improved;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {
    private String text = "";

    private Queue<Command> queue = new LinkedList<>();

    // everything you want to do with the TextEditor will be done through here
    private void executeAction(Command command) {
        command.action();
        queue.add(command);
    }

    private void undo() {
        Command command = queue.poll();
        if (command != null) {
            command.undo();
        }
    }

    // GETTER AND SETTER

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        final TextEditor textEditor = new TextEditor();
        AddTextCommand addTextCommand = new AddTextCommand(textEditor, "1234");
        textEditor.executeAction(addTextCommand);
        ClearTextCommand command = new ClearTextCommand(textEditor);
        textEditor.executeAction(command);
        System.out.println("Text is: " + textEditor.getText());
        textEditor.undo();
        System.out.println("Text is: " + textEditor.getText());

        AddTextCommand addTextCommandTwo = new AddTextCommand(textEditor, "Woot");
        textEditor.executeAction(addTextCommandTwo);
        System.out.println("Text is: " + textEditor.getText());
        textEditor.undo();
        System.out.println("Text is: " + textEditor.getText());
    }
}
