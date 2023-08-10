package hcn;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.print("Nhap chieu dai: ");
        hcn.setCd(scanner.nextInt());
        System.out.print("Nhap chieu rong: ");
        hcn.setCr(scanner.nextInt());
        System.out.print("Chu vi HCN la " + hcn.tinhChuVi() + " va Dien tich HCN la " + hcn.tinhDienTich());
    }
}
