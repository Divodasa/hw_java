package org.homedevelop.hw_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testEvalArea() {
        double result = Main.evaluateArea(21);
        Assert.assertEquals(1385.442360233099, result);
    }

    @Test
    public void testEvalArea1() {
        double result = Main.evaluateArea(-21);
        Assert.assertEquals(0.0, result);
    }

    @Test
    public void testEvalArea2() {
        double result = Main.evaluateArea(0);
        Assert.assertEquals(0.0, result);
    }

    @Test
    public void testEvalPer() {
        Assert.assertEquals(Main.evaluatePerimeter(12),75.39822368615503);
    }

    @Test
    public void testEvalPer1() {
        Assert.assertEquals(Main.evaluatePerimeter(0), 0.0);
    }

    @Test
    public void testEvalPer2() { Assert.assertEquals(Main.evaluatePerimeter(-12), 0.0); }

}
