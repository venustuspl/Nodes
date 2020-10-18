import java.util.List;
import java.util.Optional;

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
        return findByVariableAndValue("code", code);
    }

    @Override
    public Optional<INode> findByRenderer(String renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer is null!");
        }
        return findByVariableAndValue("renderer", renderer);
    }


    public Optional<INode> findByVariableAndValue(String variable, String value) {
        if (variable == null || value == null) {
            throw new IllegalArgumentException("In parameters are null!");
        }
        if (variable.equals("renderer")) {
            return nodes.stream().filter(n -> n.getRenderer().equals(value)).findFirst();
        } else
            return nodes.stream().filter(n -> n.getCode().equals(value)).findFirst();
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
