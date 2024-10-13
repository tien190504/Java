package bai5;
public class Triangle {
    private int side1, side2, side3;
    public Triangle(int side1, int side2, int side3) {
        if(side1 > 0 && side2 > 0 && side3 > 0) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("side phai lon hon 0");
        }
    }
    
    //Chu vi
    public int getPerimeter() {
        return side1 + side2 + side3;
    }
    //Dien tich
    public  double getArea() {
        double s = getPerimeter() / 2;
        return (double)Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    //Loai tam giac
    public String getTringleType() {
        if(side1 == side2 && side1 == side3) {
            return "Tam giac deu";
        } else if(side1 == side2 || side2 == side3 || side3 == side1) {
            return "Tam giac can";
        } else if(side1 * side1 + side2 * side2 == side3 * side3 ||
                  side2 * side2 + side3 * side3 == side1 * side1 ||
                  side3 * side3 + side1 * side1 == side2 * side2) {
            return "Tam giac vuong";
        }
        else {
            return "Tam giac thuong";
        }
    }
    public String toString() {
        return "canh 1 = " + side1 +
                ", canh 2 = " + side2 +
                ", canh 3 = " + side3 +
                ", chu vi = " + getPerimeter() +
                ", dien tich = " + String.format("%.2f", getArea()) +
                ", loai tam giac  = " + getTringleType() +
                '}';
    }
}
