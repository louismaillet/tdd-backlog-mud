import org.junit.Test;
import static org.junit.Assert.*;

public class TestsBoxes {

    @Test
    public void testBoxCreate() {
        Box b = new Box(true, 10);
        assert(null != b);
    }

    @Test
    public void testBoxAdd() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        assert true == b.contains(t); 
    }

    @Test
    public void testBoxContains() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        assert true == b.contains(t);
    }

    @Test
    public void testBoxRemove() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        b.remove(t);
        assert false == b.contains(t);
    }

    @Test
    public void testBoxOpen() {
        Box b = new Box(false, 10);
        b.open();
        assert true == b.isOpen();
    }

    @Test
    public void testBoxClose() {
        Box b = new Box(true, 10);
        b.close();
        assert false == b.isOpen();
    }

    @Test
    public void testActionLook() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        b.open();
        assert "La boîte contient : truc1".equals(b.actionLook()); 
    }

    @Test
    public void testActionLookV2() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        b.open();
        assert "La boîte contient : truc1".equals(b.actionLook()); 
    }

    @Test
    public void testHasRoomFor() {
        Box b = new Box(true, 10);
        Thing t1 = new Thing("truc1", 5);
        Thing t2 = new Thing("truc2", 6);
        b.add(t1);
        assert true == b.hasRoomFor(t2);}

    @Test
    public void testActionAdd() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        assert true == b.actionAdd(t);
        assert true == b.contains(t);
        b.close();
        assert false == b.actionAdd(t);
    }


    @Test
    public void testFind() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc1", 5);
        b.add(t);
        b.open();
        assert t == b.find("truc1");
    }
}