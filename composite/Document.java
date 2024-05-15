public class Document implements FileSystemElement {
    private int size;

    public Document(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
