import java.util.ArrayList;
import java.util.List;

public class DirectoryStructure {
    private DirectoryStructureNode root;

    public int getSize() {
        class sizeVistor implements DirectoryNode.Visitor {
            private int size = 0;

            public void visit(DirectoryNode node) {
            }

            public void visit(FileNode node) {
                size += node.getSize();
            }
        }
        sizeVistor visitor = new sizeVistor();
        root.accept(visitor);
        return visitor.size;
    }

    public String[] getFileNames() {
        class fileNamesVisitor implements DirectoryNode.Visitor {
            private List<String> names = new ArrayList<>();

            public void visit(DirectoryNode node) {
            }

            public void visit(FileNode node) {
                names.add(node.getName());
            }
        }
        fileNamesVisitor visitor = new fileNamesVisitor();
        root.accept(visitor);
        return visitor.names.toArray(new String[]{});
    }
}


