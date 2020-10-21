import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class CompositeNode extends Node implements ICompositeNode {

    private List<INode> nodes = new ArrayList<>();

    public CompositeNode(String code, String renderer) {
        super(code, renderer);
    }

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    public void setNodes(List<INode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public Stream<INode> toStream() {
        return Stream.concat(
                super.toStream(),
                nodes.stream().flatMap(INode::toStream)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CompositeNode that = (CompositeNode) o;
        return Objects.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nodes);
    }
}