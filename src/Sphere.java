/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Sphere extends Shape

{
   private double radius; //radius in feet
   //----------------------------------
   // Constructor: Sets up the sphere.
   //----------------------------------
   public Sphere(double radius)
   {
      super("Sphere");
      this.radius = radius;
   }
   //-----------------------------------------
   // Returns the surface area of the sphere.
   //-----------------------------------------
   public double area()
  {
      return 4*Math.PI*radius*radius;
   }
}

    

