import java.util.UUID;

public class FileNode extends DirectoryStructureNode {
    private String name = "";
    private int size = 1;

    public FileNode(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public FileNode(int size) {
        name = UUID.randomUUID().toString();
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
