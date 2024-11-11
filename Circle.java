/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rossss;

/**
 *
 * @author Student
 */
public class Circle {
   private double radius= 0.0;
    double diameter=2*radius;
     double Circu=2*Math.PI*radius;
     double Area=Math.PI*Math.pow(radius, 2);
     double a;

    public Circle(){

    }
   void set_radius(double a){
       this.radius=a;
   }
   double get_radius(){
       return radius;
   }
   double ComputeArea(double radius){
       return Math.PI*Math.pow(radius, 2);
   }
   double Computediameter(double radius){
       return 2*radius;

}
     double ComputeCircu(double radius){
       return 2*Math.PI*radius;
   } 
   double get_Circu(){
       return Circu;
}
     void set_Area(double a){
       this.Area=a;
   }
   double get_Area(){
       return Area;
}
}
