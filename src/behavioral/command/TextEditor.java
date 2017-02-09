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

    // can't perform undo more than once!
    public void undo() {
        this.text = undoText;
    }

    public static void main(String[] args) {
        final TextEditor textEditor = new TextEditor();
        textEditor.addText("1234");
        textEditor.clearText();
        System.out.println("Text is: " + textEditor.getText());
        textEditor.undo();
        System.out.println("Text is: " + textEditor.getText());
    }
}
