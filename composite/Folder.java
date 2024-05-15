import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private int totalSize;
    private List<FileSystemElement> elements;

    public Folder() {
        this.totalSize = 0;
        elements = new ArrayList<>();
    }

    public void add(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public int getSize() {
        for (FileSystemElement element : elements) {
            totalSize += element.getSize();
        }
        return totalSize;
    }
}
