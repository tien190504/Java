/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import java.util.*;

/**
 *
 * @author Nitro 5
 */
public class Codinate {
    private int x, y;
    public Codinate() {
        this.x = 0;
        this.y = 0;
    }
    public Codinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Codinate Sum(Codinate other) {
        return new Codinate(this.x + other.x, this.y + other.y);
    }
    public void input() {
        Random rand = new Random();
        this.x = rand.nextInt(-10, 10);
        this.y = rand.nextInt(-10, 10);
    }
    public Codinate DXtrucHoanh() {
        return new Codinate(this.x, -this.y);
    }
    public void print() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
