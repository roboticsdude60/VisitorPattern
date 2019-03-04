public class DirectoryNode extends DirectoryStructureNode {
    private FileNode[] files = {};
    private DirectoryNode[] folders = {};

    public FileNode[] getFileNodes() {
        return files;
    }

    public DirectoryNode[] getDirectoryNodes() {
        return folders;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (FileNode file : files) file.accept(visitor);
        for (DirectoryNode folder : folders) folder.accept(visitor);
    }
}