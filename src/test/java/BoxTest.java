import org.junit.jupiter.api.Test;
import ru.otus.java.basic.Box;

public class BoxTest {
    Box box = new Box();

    @Test
    void testBoxState() {
        System.out.println(box.toString());
    }
}