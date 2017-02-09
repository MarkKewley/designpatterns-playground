package behavioral.command.improved;

public class AddTextCommand extends AbstractCommand {
    private String undoText = "";

    private String textToAdd = "";

    public AddTextCommand(TextEditor textEditor, String textToAdd) {
        super(textEditor);
        this.textToAdd = textToAdd;
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(getTextEditor().getText() + textToAdd);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
