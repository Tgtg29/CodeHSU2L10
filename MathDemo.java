//import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2.0;
        int z = 7;
        //absolute value
        System.out.println(Math.abs(y1));
        //System.out.println(abs(y1)); only use if import is used
        
        //square root something
        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot); //integer argument is fine
        
        //use exponents
        double powerExample = Math.pow(7,5);
        System.out.println("7 to the 5th power is: " + (int)powerExample);
        
        
        //find the sin, cos, and tan of an angle
        int angle1 = 60; //in degrees
        double angle1InRad = Math.toRadians(angle1);
        System.out.println("The cos of 60 degrees is " + Math.cos(angle1InRad));
        System.out.println("The true value is 0.5");
        
        //convert to radians by multiplying pi/100
        final double PI = Math.PI;
        double angle1InRad2 = angle1 * (PI/180);
        System.out.println("The cos of 60 degrees is " + Math.cos(angle1InRad2));
        System.out.println("The true value is 0.5");
        
        //area of a circle
        double radius = 4.0;
        //make area var
        double radiusSq = Math.pow(radius,2);
        double area = radiusSq * PI;
        //print
        System.out.println("The area of a circle with a radius of "+ radius + " is: " + area);
        
        //random numbers
        double firstRand = Math.random();
        double secondRand = (int) (firstRand * 10); //this gives me between 0 and 9
        //how about between 0 and 99
        secondRand = (int) (firstRand * 100);
        
        //how about between 0 and 7
        secondRand = (int) (firstRand * 8);
        
        //template for getting a random number from 0 to n
        // int randInt = (int) (Math.random() * (n + 1));
        
        //get a randum between 1 and 6
        int randDie = (int) (Math.random() * 6 + 1);
        //long version: int randDie = (int) (Math.random() * (6-1 + 1) + 1);
        
        //template for getting a random number from m to n
        //int randInt = (int) (Math.random() * (n - m + 1) + m);
        //int randInt = (int) (Math.random() * (range + 1) + start);
        
        System.out.println("firstRand: " + firstRand);
        System.out.println("secondRand: " + secondRand);
        System.out.println("randDie: " + randDie);
    }
}