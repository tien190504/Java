/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyPackage.Shape;
import java.lang.Math;
/**
 *
 * @author Nitro 5
 */
public class Circle {
    double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double Circumference() {
        return 2 * Math.PI * r;
    }
    
    public double Area() {
        return Math.PI * r * r;
    }
}
