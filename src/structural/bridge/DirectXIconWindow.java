package structural.bridge;

public class DirectXIconWindow extends IconWindow {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("DirectXIconWindow draw x: " + x + " y: " + y + " width: " + width + " color: " + color);
        drawIcon();
    }
}
