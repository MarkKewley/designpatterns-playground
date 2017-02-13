package behavioral.observer.improved;


public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();


        // So we've loosely coupled out Button from InputText and the List
        // furthermore the button can now be used on future screens.
        // The downside is the Button could have say 100 observers and each one will process a change
        button.attachObserver(text);
        button.attachObserver(list);

        button.clicked();

    }

}
