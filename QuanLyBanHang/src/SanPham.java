import java.util.Scanner;

public class SanPham {
	private String maSP;
	private String tenSP;
	private float dongiaSP;
	
	public SanPham() {
		
	}
	public SanPham(String maSP, String tenSP, float dongiaSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dongiaSP = dongiaSP;
	}
	
	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getDongiaSP() {
		return dongiaSP;
	}

	public void setDongiaSP(float dongiaSP) {
		this.dongiaSP = dongiaSP;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma san pham: ");
		setMaSP(sc.nextLine());
		System.out.println("Nhap ten san pham: ");
		setMaSP(sc.nextLine());
		System.out.println("Nhap don gia: ");
		setDongiaSP(sc.nextFloat());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("|%-10s|%-10s|%-5.2f", getMaSP(), getTenSP(), getDongiaSP());
	}
}
