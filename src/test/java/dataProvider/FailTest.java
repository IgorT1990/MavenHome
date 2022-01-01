package dataProvider;
import org.testng.annotations.Test;

public class FailTest extends DataProv {


    @Test(dataProvider = "login")
    public void failTest(String user, String password, String role) {
        if (role.equals(""))
        throw new RuntimeException("No access without role");
        System.out.printf("User: %s - Pass: %s - Role: %s%n", user, password, role);
    }
}
