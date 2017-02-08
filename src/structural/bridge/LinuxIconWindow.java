package structural.bridge;

public abstract class LinuxIconWindow extends IconWindow {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("LinuxIconWindow draw x: " + x + " y: " + y + " width: " + width + " color: " + color);
        drawIcon();
    }

}
