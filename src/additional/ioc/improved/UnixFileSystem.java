package additional.ioc.improved;

public class UnixFileSystem implements FileSystem {
    @Override
    public String readFile() {
        return "UnixFileSystem#readFile()";
    }
}
