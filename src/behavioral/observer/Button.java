package behavioral.observer;


public class Button {

    private InputText inputText;

    private List list;


    // This is specific to this page, so not very extendible if we wish to have Buttons
    // on multiple pages... We need a way to generify this button for multiple screens
    public void clicked(){

        list.setListValue(1);
        inputText.setText("button has been clicked");

    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    public void setList(List list) {
        this.list = list;
    }
}
