package qlsv;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        System.out.print("Nhap ma SV 1: ");
        sv1.setMaSv(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ten sinh vien 1: ");
        sv1.setFullname(scanner.nextLine());
        System.out.print("Nhap diem li thuyet: ");
        sv1.setDiemLT(scanner.nextFloat());
        System.out.print("Nhap diem thuc hanh: ");
        sv1.setDiemTH(scanner.nextFloat());
        //
        Sinhvien sv2 = new Sinhvien();
        System.out.print("Nhap ma SV 2: ");
        sv2.setMaSv(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ten sinh vien 2: ");
        sv2.setFullname(scanner.nextLine());
        System.out.print("Nhap diem li thuyet: ");
        sv2.setDiemLT(scanner.nextFloat());
        System.out.print("Nhap diem thuc hanh: ");
        sv2.setDiemTH(scanner.nextFloat());
        //
        Sinhvien sv3 = new Sinhvien();
        System.out.print("Nhap ma SV 3: ");
        sv3.setMaSv(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ten sinh vien 3: ");
        sv3.setFullname(scanner.nextLine());
        System.out.print("Nhap diem li thuyet: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.print("Nhap diem thuc hanh: ");
        sv3.setDiemTH(scanner.nextFloat());
        //
        System.out.printf("%6s %10s %15s %10s %10s \n", "Mã sinh viên", "Họ tên", "Điểm lý thuyết", "Điểm thực hành",
                "Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }

}
