package structural.bridge.improved;

public class DirectXWindowImpl extends WindowImpl {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("DirectXWindowImpl draw x: " + x + " y: " + y + " width: " + width + " color: " + color);
    }
}
