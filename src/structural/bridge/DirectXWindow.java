package structural.bridge;

public class DirectXWindow implements Window {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("DirectXWindow draw x: " + x + " y: " + y + " width: " + width + " color: " + color);
    }
}
