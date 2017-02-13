package behavioral.mediator;


import java.util.ArrayList;

public class List {

    private java.util.List<String> items = new ArrayList<String>();


    // problem, multiple screens require a List, but not all of them need
    // the InputText, so for all ov those Lists on other pages an InputText will
    // be there which causes a lot of references.
    private InputText inputText;


    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        inputText.setValue(item);
    }


    public java.util.List<String> getItems() {
        return items;
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
