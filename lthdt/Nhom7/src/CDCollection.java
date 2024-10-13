/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class CDCollection extends CD{
    private ArrayList<CD> dsCD;

    public CDCollection() {
        super();
        dsCD = new ArrayList<>();
    }

    public CDCollection(ArrayList<CD> dsCD, int maCD, String tenCD, String caSy, int soBaiHat, double giaThanh) {
        super(maCD, tenCD, caSy, soBaiHat, giaThanh);
        this.dsCD = dsCD;
    }

    
    
    public void addCD(CD cd){
        dsCD.add(cd);
    }
    
    public void removeCD(CD cd){
        dsCD.remove(cd);
    }
    
    public CD searchCD(int maCD) {
        for (CD cd : dsCD) {
            if(cd.getMaCD() == maCD) {
                return cd;
            }
        }
        return null;
    }
    
    public void sortCD() {
        Collections.sort(this.dsCD, (cd1, cd2) -> Integer.compare(cd1.getMaCD(), cd2.getMaCD()));
    }
    public int soLuongCD() {
        return dsCD.size();
    }

    public float TongGia() {
        float tong = 0;
        for (CD cd : dsCD) {
            tong += cd.getGiaThanh();
        }
        return tong;
    }
    public void output(){
        sortCD();
        for (CD cd : dsCD) {
            System.out.println(cd);
        }
    }
    
}
