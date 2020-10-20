import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements ICompositeNode {

    private List<INode> nodes = new ArrayList<>();

    public CompositeNode(List<INode> tempList) {
        this.nodes = tempList;
    }

    @Override
    public List<INode> getNodes() {
        return null;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getRenderer() {
        return null;
    }
}