package testngTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = {"functions", "regression", "login"})
public class MyFirstTest {


    private void firstMethod(String ParamFromConfig){

        System.out.println("Tes 1 + " + ParamFromConfig);
    }

    @Test(dataProvider = "logins")
    public void secondMethod(String user, String password, String role) {
        if (role.equals("admin"))
            throw new RuntimeException("Admin should fail");
        System.out.printf("User: %s - Pass: %s - Role: %s%n", user, password, role);

    }


    private void aNewTest(){
        System.out.println("My aNewTest");
    }


    @DataProvider(name = "logins")
    public Object[][] createLogins() {

        String[][] users = {
                {"user1", "pass1", "user"},
                {"user2", "pass2", "admin"},
                {"user3", "pass3", "guest"}
        };
        return users;
    }
}