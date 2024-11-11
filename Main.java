/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rossss;

/**
 *
 * @author Student
 */
public class Main{
    private static int c;
    private static String Ross;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle Liam= new Circle (); //initialize the object
        Circle Alfred= new Circle();

        Liam.set_radius(2);
        System.out.println(Liam.ComputeArea(3));
    }

}
