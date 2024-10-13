package CD;

import java.util.ArrayList;
import java.util.Collections;

public class CDCollecttion extends CD{
    private ArrayList <CD> cds;

    public CDCollecttion() {
        super();
        cds = new ArrayList<>();
    }

    public CDCollecttion(int maCD, String tenCD, String caSy, int soBaiHat, float giaThanh, ArrayList<CD> cds) {
        super(maCD, tenCD, caSy, soBaiHat, giaThanh);
        this.cds = cds;
    }

    public void addCD(CD newCD) {
        this.cds.add(newCD);
    }
    public void removeCD(CD CD) {
        this.cds.remove(CD);
    }

    public CD findCD(int maCD) {
        for (CD cd : cds) {
            if(cd.getMaCD() == maCD) {
                return cd;
            }
        }
        return null;
    }

    public int soLuongCD() {
        return cds.size();
    }
    
    public void sortCD() {
        Collections.sort(this.cds, (cd1, cd2) -> Integer.compare(cd1.getMaCD(), cd2.getMaCD()));
    }

    
    public void output() {
        for (CD cd : cds) {
            System.out.println(cd);
        }
    }
}   
