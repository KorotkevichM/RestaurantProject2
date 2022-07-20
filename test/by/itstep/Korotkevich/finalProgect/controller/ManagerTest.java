package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.controller.Manager;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void testSumOrderPositive() {

        double[] array = {0.1, 23.5, 55};

        double expected = 78.6;

        double actual = Manager.sum(array);

        if (expected != actual) {
            fail();
        }
    }

        @Test
        public void testMaxOrderPositive() {

            double[] array = {0.1, 23.5, 55};

            double expected = 55;

            double actual = Manager.max(array);

            Assert.assertEquals(expected, actual, 0.001);

        }

    @Test
    public void testMinOrderPositive() {

        double[] array = {0.1, 23.5, 55};

        double expected = 0.1;

        double actual = Manager.min(array);

        Assert.assertEquals(expected, actual, 0.001);

    }

    @Test
    public void testOrderPositive() {

        double[] array = {0.1, 23.5, 55};

        double expected = 78.6;

        double actual = Manager.sum(array);

        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testSumOrderWithEmptyObject() {

        double[] array = {};

        double expected = 0;

        double actual = Manager.sum(array);

        assertEquals(expected, actual, 0);
    }





}

