package qlsv2;

import java.util.Scanner;

public class Main2 {
    public static Scanner sc = new Scanner(System.in);

    public static void xuatSv(SvNhap a) {
        System.out.println("Nhap ma sinh vien: ");
        a.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        a.setName(sc.nextLine());
        System.out.println("Nhap dia chi sinh vien: ");
        a.setAddress(sc.nextLine());
        System.out.println("Nhap so dien thoai sinh vien: ");
        a.setPhone(sc.nextLine());
    }

    public static void main(String[] args) {
        int index = 0;
        SvNhap arr[] = null;
        System.out.print("Nhap so luong sinh vien: ");
        index = sc.nextInt();
        arr = new SvNhap[index];
        for (int i = 0; i < index; i++) {
            System.out.println("Sinh vien " + (i + 1));
            arr[i] = new SvNhap();
            xuatSv(arr[i]);
        }
        SvNhap min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].xinId() > arr[j].xinId()) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        System.out.printf("%5s %5s %8s %10s \n", "ID", "Ho va ten", "Dia chi", "So dien thoai");
        for (int i = 0; i < index; i++) {
            arr[i].display();
        }
    }
}
