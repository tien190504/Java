import java.util.InputMismatchException;
import java.util.Scanner;

public class NhapSoChan {
    public void Nhap() throws RuntimeException{
        System.out.println("Nhap so chan: ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if(a % 2 != 0) {
                throw new ArithmeticException("So da nhap la so le");
            }
            
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.err.println(e.getLocalizedMessage());
        } catch (InputMismatchException e) {
            System.err.println("vui long nhap so nguyen");
        }

    }
    public static void main(String[] args) {
        new NhapSoChan().Nhap();
    }
}
