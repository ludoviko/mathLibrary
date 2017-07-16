package com.lam.mathematics;

import com.lam.mathematics.space.Angle;
import com.lam.mathematics.space.Vector;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Usuario on 16/07/2017.
 */
public class VectorTest {
    private double epsilon = 0.00000000001;

    @Test
    public void testEquals() {
        Vector a = new Vector ("a",1, 1 );
        Vector b = new Vector("b",  new Angle(Math.PI / 4),  Math.sqrt(2));
        Assert.assertEquals(a.getAngle().getValue(), b.getAngle().getValue(), epsilon);
        Assert.assertEquals(a.getMagnitud(), b.getMagnitud(), epsilon);

        a = new Vector ("a",Math.sqrt(3)/2, 1.0/2 );
        b = new Vector("b",  new Angle(Math.PI / 6),  1);
//        Assert.assertEquals(a.getAngle().getValue(), b.getAngle().getValue(), epsilon);
        Assert.assertEquals(a.getMagnitud(), b.getMagnitud(), epsilon);

    }
}
