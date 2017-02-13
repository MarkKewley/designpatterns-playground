package additional.ioc.improved;

public class ImageService {

    // in this case, we have  UnixFileSystem
    private FileSystem fileSystem;

    public String readImage() {
        return fileSystem.readFile();
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
}
