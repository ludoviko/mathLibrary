package com.lam.mathematics;

import com.lam.mathematics.space.Angle;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * Created by Usuario on 16/07/2017.
 */
@RunWith(Parameterized.class)
public class AngleTest {
    private double epsilon = 0.00000000001;
    private double input;
    private double expected;

    public  AngleTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: Angle( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][] {
                {new Double(4 * Math.PI + Math.PI/4), new Double( Math.PI/4)},
                {new Double(4 * Math.PI + Math.PI), new Double(Math.PI)},
                {new Double(4 * Math.PI + Math.PI/2), new Double(Math.PI/2)},
                {new Double(64 * Math.PI + Math.PI/3), new Double(Math.PI/3)},
                {new Double(4 * Math.PI + Math.PI/6), new Double(Math.PI/6)},
                {new Double(- 4 * Math.PI + Math.PI/6), new Double(Math.PI/6)},
//                               {new Double(0), new Double("1")},

        });
    };

    @Test(timeout=3000)
    public void testEquality() {
        Assert.assertEquals(new Angle(input).getValue(),  new Angle (expected).getValue() , epsilon );
    }
}
