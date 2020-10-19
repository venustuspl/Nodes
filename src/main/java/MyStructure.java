import java.util.List;
import java.util.function.Predicate;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public INode findByCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Renderer is null!");
        }
        return findByInterfacePredicate(n -> code.equals(n.getCode()));
    }

    @Override
    public INode findByRenderer(String renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer is null!");
        }
        return findByInterfacePredicate(n -> renderer.equals(n.getRenderer()));
    }


    public INode findByInterfacePredicate(Predicate<INode> predicate) {
        return nodes.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
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
