package dataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "Regression")
public class DataProv {

    @DataProvider(name = "login")
    public Object[][] data(){
        String[][] user = {
                {"user1","password1","guest"},
                {"user2","password2","user"},
                {"user3","password3","admin"},
                {"user4","password4","superAdmin"},
                {"user5","password5",""}
        };
        return user;
    }

    @Test(dataProvider = "login")
    public void loginMethod(String user, String password, String role){
        System.out.printf("User: %s - Pass: %s - Role: %s%n", user, password, role);
    }

    @Test(dependsOnGroups = "Login")
    public void testCheck() {

    }
}
