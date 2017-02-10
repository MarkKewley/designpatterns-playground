package behavioral.mediator.improved;


// Note this is not reusable, but that is the point they are coded for SPECIFIC scenarios
public class ScreenDirectorOne implements ScreenDirector {

    private InputText inputText;


    @Override
    public void itemSelected(String item) {
        inputText.setValue(item);
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
