package behavioral.command;

public class TextEditor {
    private String text = "";

    private String undoText = "";

    public void addText(String text) {
        undoText = this.text;
        this.text = text;
    }

    public void clearText() {
        undoText = text;
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void undo() {
        this.text = undoText;
    }
}
