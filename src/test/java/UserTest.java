import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.User;

public class UserTest {
    @Test
    void testGetUserInfo() {
        String fullName = "Константинопольский Константин Константинович";
        int birthYear = 1999;
        String email="KonstantinKK@email.ru";
        User user = new User(
                fullName, birthYear, email
        );

        Assertions.assertEquals(user.getFullName(), fullName);
        Assertions.assertEquals(user.getBirthYear(), birthYear);
        Assertions.assertEquals(user.getEmail(), email);
    }
}
