package Runner;

import io.cucumber.testng.CucumberOptions;
import pages.HomePage;
import pages.RegisterPage;
import tests.TestBase;
import tests.TestBaseForRegister;



@CucumberOptions(features="src/test/java/features", 
glue= {"Steps"},
plugin = {"json:target/cucumber.json"}
,
tags= "@Testinvalidpassword")

public class TestRunner extends TestBaseForRegister
{

}
