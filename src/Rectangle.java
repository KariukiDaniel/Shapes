/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle (double length, double width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public double area()
    {
        return length * width;
    }
}

