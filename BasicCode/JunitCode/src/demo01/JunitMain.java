package demo01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitMain {

    @Before
    public void init() {
        System.out.println("init...................");
    }

    @Test
    public void JunitTest() {
        Calculator calculator = new Calculator();
        int res = calculator.add(1, 2);
        System.out.println("main...................");
        Assert.assertEquals(3, res);
    }

    @After
    public void close() {
        System.out.println("close.................");
    }
}
