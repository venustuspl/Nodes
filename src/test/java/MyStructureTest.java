import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyStructureTest extends TestCase {

    @Test
    public void testFindByCodeInINodeList() {
        List<INode> tempList = new ArrayList<>();
        Node node0 = new Node("kod", "test");
        Node node1 = new Node("kod1", "test1");
        tempList.add(node0);
        tempList.add(node1);

        MyStructure myStructure = new MyStructure(tempList);

        assertNotNull(myStructure.findByCode("kod"));
    }

    @Test
    public void testFindByCodeInICompositeNodeList() {
        List<INode> tempList = new ArrayList<>();
        Node node0 = new Node("kod", "test");
        Node node1 = new Node("kod1", "test1");
        tempList.add(node0);
        tempList.add(node1);

    }
}