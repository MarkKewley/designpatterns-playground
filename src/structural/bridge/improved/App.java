package structural.bridge.improved;

public class App {
    public static void main(String... args) {
        final IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new DirectXWindowImpl());
        iconWindow.drawIcon();

        iconWindow.setWindow(new LinuxWindowImpl());
        iconWindow.drawIcon();
    }
}
