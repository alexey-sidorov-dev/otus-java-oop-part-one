import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.User;

public class UserTest {
    @Test
    void testGetUserInfo() {
        User user = new User(
                "Константинопольский Константин Константинович", 1999, "KonstantinKK@email.ru"
        );
        String userInfoActual =
                "ФИО:Константинопольский Константин Константинович;Год рождения:1999;E-mail:KonstantinKK@email.ru";
        Assertions.assertEquals(user.getUserInfo(), userInfoActual);
    }
}
