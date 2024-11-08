import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.Box;

public class BoxTest {
    String color = "синий";
    int size = 3;
    Box box = new Box(color, size);

    @Test
    void testBoxConstructor() {
        Assertions.assertEquals(box.getSize(), size);
        Assertions.assertEquals(box.getColor(), color);
        Assertions.assertFalse(box.isOpened());
    }

    @Test
    void testBoxColorChange() {
        String newColor = "белый";
        
        box.setColor(newColor);
        Assertions.assertEquals(box.getColor(), newColor);
    }

    @Test
    void testBoxStateChange() {
        box.open();
        Assertions.assertTrue(box.isOpened());
        box.close();
        Assertions.assertFalse(box.isOpened());
    }

    @Test
    void testPutItem() {
        String item = "предмет";

        box.close();
        box.putItem(item);
        Assertions.assertNull(box.getItem());

        box.open();
        box.putItem(item);
        Assertions.assertEquals(box.getItem(), item);
    }

    @Test
    void testDropItem() {
        String item = "предмет";

        box.open();
        box.putItem(item);
        box.close();
        box.dropItem();
        Assertions.assertEquals(box.getItem(), item);

        box.open();
        box.dropItem();
        Assertions.assertNull(box.getItem());
    }
}
