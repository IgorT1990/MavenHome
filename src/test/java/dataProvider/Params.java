package dataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Params {

    @Parameters({"role"})
    public void paramsMethod(String paramFromConf){
        System.out.println("Role " + paramFromConf);

    }


}
