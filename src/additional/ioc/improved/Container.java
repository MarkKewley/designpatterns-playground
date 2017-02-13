package additional.ioc.improved;

/**
 * This is something a client will usually program. That is why
 * this is different than before. So now the client has the ability
 * to change the FileSystem. We are letting go of the control of the
 * ImageService controlling the FileSystem.
 */
public class Container {

    private ImageService imageService;

    public void init() {
        imageService = new ImageService();
        imageService.setFileSystem(new WindowsFileSystem());
    }

    public ImageService getImageService() {
        return imageService;
    }

    public static void main(String... args) {
        Container container = new Container();
        container.init();
        ImageService imageService = container.getImageService();
        System.out.println(imageService.readImage());
    }
}
