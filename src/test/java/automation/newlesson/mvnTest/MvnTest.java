package automation.newlesson.mvnTest;

import org.testng.annotations.Test;

@Test
public class MvnTest {
    public void mvnTest(){
        System.out.println("First MVN Test");
        System.out.println("Open URL: " + System.getProperty("siteUrl"));
    }
}
