package structural.bridge;

public class LinuxWindow implements Window {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("LinuxWindow draw x: " + x + " y: " + y + " width: " + width + " color: " + color);
    }
}
