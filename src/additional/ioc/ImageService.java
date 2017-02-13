package additional.ioc;

/**
 * Problem is the ImageService requires to choose a FileSystem.
 *
 * One solution: Have two ImageServices, one for Unix other for Windows
 * Not a very good solution though...
 */
public class ImageService {

    // in this case, we have  UnixFileSystem
    private FileSystem fileSystem = new UnixFileSystem();

    public String readImage() {
        return fileSystem.readFile();
    }

    public static void main(String... args) {
        ImageService imageService = new ImageService();
        System.out.println(imageService.readImage());
    }
}
