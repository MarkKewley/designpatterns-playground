package structural.bridge.improved;

/**
 * Now the IconWindow doesn't have to worry about whether or not it should be
 * a LinuxWindow/DirectXWindow
 */
public class IconWindow extends Window {

    public void drawIcon() {
        draw(0, 0, 10, 10, "White");
        draw(0, 10, 10, 10, "Black");
    }
}
