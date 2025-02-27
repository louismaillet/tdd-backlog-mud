import org.junit.Test;
import static org.junit.Assert.*;

public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add(new Thing("truc1"));
        b.add(new Thing("truc1"));
    }

    @Test
    public void testBoxContains(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        assert(b.contains(t));
    }

    @Test
    public void testBoxRemove(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        b.remove(t);
        assert(b.contains(t));
    }

    @Test 
    public void testBoxOpen(){
        Box b = new Box();
        b.open();
        assert(b.isOpen());
    }

    @Test
    public void testBoxClose(){
        Box b = new Box();
        b.open();
        b.close();
        assert(!b.isOpen());
    }
    @Test
    public void testActionLook(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        b.open();
        assert(b.actionLook().equals("La boîte contient : truc1 "));
    }
}