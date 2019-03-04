import java.security.InvalidParameterException;

public abstract class DirectoryStructureNode {
    public abstract void accept(Visitor visitor);

    public interface Visitor {
        default void visit(DirectoryStructureNode node) {
            throw new InvalidParameterException("visitor was not fully implemented");
        }
    }
}

