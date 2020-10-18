import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public Optional<INode> findByCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Renderer is null!");
        }
        return nodes.stream().filter(n -> n.getCode().equals(code)).findFirst();
    }

    @Override
    public Optional<INode> findByRenderer(String renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer is null!");
        }
        return nodes.stream().filter(n -> n.getRenderer().equals(renderer)).findFirst();
    }

    @Override
    public int count() {
        return (int) nodes.stream().count();

    }

    public List<INode> getNodes() {
        return nodes;
    }

    public void setNodes(List<INode> nodes) {
        this.nodes = nodes;
    }
}
