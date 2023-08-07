package api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
    @Before(order = -3)
    public void setup1(){
        System.out.println("-----Before Hook-----");
    }

    @Before(order = 1)
    public void setup2(){
        System.out.println("-----Before Hook-----");
    }

    @After
    public void tearDown(){
        System.out.println("-----After Hook-----");
    }

    @BeforeStep
    public void setupSteps(){
        System.out.println("-----Before Step Hook-----");
    }

    @AfterStep
    public void tearDownSteps(){
        System.out.println("-----After Step Hook-----");
    }
}
