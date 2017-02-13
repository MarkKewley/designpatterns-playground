package additional.ioc;

public class UnixFileSystem implements FileSystem {
    @Override
    public String readFile() {
        return "UnixFileSystem#readFile()";
    }
}
