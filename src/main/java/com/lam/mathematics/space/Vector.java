package com.lam.mathematics.space;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility class for working with 2 dimensional vectors.
 */
public class Vector implements Comparable<Vector> {
    private double x;
    private double y;
    private Angle angle;
    private double magnitud;
    private String name;

    public Vector (String name, double x, double y) {
         this.x = x;
         this.y = y;
         this.magnitud = Math.sqrt(this.x * this.x + this.y * this.y);
         this.angle = findAngle();
         this.name = name;
    }

    public Vector(String name, Angle angle, double magnitud) {
        this.x = magnitud * Math.cos(angle.getValue());;
        this.y = magnitud * Math.sin(angle.getValue());
        this.magnitud = magnitud;
        this.angle = angle;
        this.name = name;
    }

    private Angle findAngle() {
        if (this.x >= 0 && this.y == 0 ) {
            return new Angle(0);
        } else if  (this.x == 0 && this.y > 0 ) {
            return new Angle(Math.PI/2);
        } else if   (this.x < 0 && this.y == 0 ) {
            return new Angle(Math.PI);
        } else if   (this.x == 0 && this.y < 0 ) {
            return new Angle(3 * (Math.PI/2) );
        } else if (this.x > 0 && this.y > 0 ) {
            return new Angle(Math.atan(this.getY() / this.getX()));
        } else if (this.x > 0 && this.y < 0 ) {
            return new Angle(  -  Math.atan( Math.abs(this.getY()) / this.getX() ));
        } else if (this.x < 0 && this.y > 0 ) {
            return new Angle( Math.PI -  Math.atan( this.getY() / Math.abs(this.getX()) ));
        } else { // (this.x < 0 && this.y < 0)
            return new Angle( Math.PI + Math.atan(this.getY() / this.getX()));
        }
    }

    public Vector add(Vector b) {
           return new Vector(this.name + "_" + b.name , this.x + b.getX(), this.y + b.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public Angle getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "name= " + name +
                ", x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                ", magnitud=" + magnitud +
                '}';
    }

    public int compareTo(Vector vector) {
        if ( this.y > vector.getY() ) {
            return 1;
        } else if ( this.y <  vector.getY() ) {
            return -1;
        } else  {
            if ( this.x > vector.getX() ) {
                return 1;
            } else if ( this.x < vector.getX() ) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws IOException {
        List<Vector> vectors = new ArrayList<Vector>();
        List<Vector> changes = new ArrayList<Vector>();

        Angle rotation = new Angle( (45 *  Math.PI) / 180);

        for ( Vector v :  vectors ) {
            changes.add(new Vector(v.name, new Angle(v.getAngle().getValue() + rotation.getValue()), v.getMagnitud()));
        }

        Collections.sort(changes);

        for ( Vector v :  changes ) {
            System.out.format("%s ", v.name);
        }

        Angle angle;
        angle = new Angle(281 * Math.PI /180 );
        Vector v= new Vector("281", angle, 20);
        System.out.println(v);

        Point p1 = new Point(2, 6);
        Point p2 = new Point(6, -3);

        System.out.println(p1.distance(p2));


    }
}
