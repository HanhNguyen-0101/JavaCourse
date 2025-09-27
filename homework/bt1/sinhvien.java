import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Online Java!! Happy Coding :)");
    Scanner scanner = new Scanner(System.in);
    Lop lop = new Lop();
    System.out.print("Nhap so luong SV: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nSV thu " + (i + 1));

            System.out.print("Ma SV: ");
            String maSV = scanner.nextLine();

            System.out.print("Ten: ");
            String ten = scanner.nextLine();

            System.out.print("Toan: ");
            float toan = Float.parseFloat(scanner.nextLine());

            System.out.print("Ly: ");
            float ly = Float.parseFloat(scanner.nextLine());
            
            System.out.print("Hoa: ");
            float hoa = Float.parseFloat(scanner.nextLine());

            SinhVien sv = new SinhVien(ten, maSV, toan, ly, hoa);
            lop.addSinhVien(sv);
        }

        System.out.println("\nDs sinh vien:");
        lop.hienThiDs();
        
        System.out.println("\nIn sinh vien cao nhat:");
        lop.inSvDTBCaoNhat();
        
        System.out.println("\nDs sinh vien Yeu:");
        lop.dsSinhVienYeu();
        
        System.out.print("\nTim theo ten:");
        String tenSV = scanner.nextLine();
        lop.timSinhVienTheoTen(tenSV);
        
        System.out.print("\nTim theo ma:");
        String maSv = scanner.nextLine();
        lop.timSinhVienTheoMaSV(maSv);
        
        System.out.print("\nXoa theo ma:");
        String maSvXoa = scanner.nextLine();
        lop.xoaSinhVienTheoMa(maSvXoa);
        
        System.out.println("\nDs sinh vien:");
        lop.hienThiDs();
  }
}
class SinhVien {
    String ten;
    String maSV;
    float toan, ly, hoa;

    public SinhVien (String ten, String maSV, float toan, float ly, float hoa) {
     this.ten = ten;
     this.maSV = maSV;
     this.toan = toan;
     this.ly = ly;
     this.hoa = hoa;
    }
    
    float tinhDienTB () {
        return (this.toan + this.ly + this.hoa) / 3;
    }
    
    String xepLoai () {
        float dtb = this.tinhDienTB();
        String result;

        if (dtb>=9) result="Xuat sac";
        else if (dtb>=8) result="Gioi";
        else if (dtb>=7) result="Kha";
        else if (dtb>=6) result="TB Kha";
        else if (dtb>=5) result="TB";
        else result="Yeu";

        return result;
    }
    
    public void hienThi() {
        System.out.println("Ten: " + this.ten + ", MaSV: " + this.maSV + ", DTB: " + this.tinhDienTB() + ", Xep loai: " + this.xepLoai());
    }
}

class Lop {
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    public void addSinhVien (SinhVien sv) {
        this.dsSinhVien.add(sv);
    }
    public void hienThiDs() {
        for (SinhVien sv : this.dsSinhVien) {
            sv.hienThi();
        }
    }
    public void inSvDTBCaoNhat () {
        float max = 0;
        SinhVien svDTBCaoNhat = null;
        for (SinhVien sv : this.dsSinhVien) {
            if (max < sv.tinhDienTB()) {
                max = sv.tinhDienTB();
                svDTBCaoNhat = sv;
            }
        }
        svDTBCaoNhat.hienThi();
    }
    public void dsSinhVienYeu () {
        for (SinhVien sv : this.dsSinhVien) {
            if (sv.xepLoai().equals("Yeu")) {
                sv.hienThi();
            }
        }
    }
    public void timSinhVienTheoTen (String ten) {
        for (SinhVien sv : this.dsSinhVien) {
            if (sv.ten.equals(ten)) {
                sv.hienThi();
            }
        }
    }
    public void timSinhVienTheoMaSV (String maSv) {
        for (SinhVien sv : this.dsSinhVien) {
            if (sv.maSV.equals(maSv)) {
                sv.hienThi();
            }
        }
    }
    public void xoaSinhVienTheoMa (String maSv) {
        boolean removed = this.dsSinhVien.removeIf(sv -> sv.maSV.equals(maSv));
        if (removed) {
            System.out.println("da xoa SV: " + maSv);
        } else {
            System.out.println("khong tim thay maSV " + maSv);
        }
    }
}