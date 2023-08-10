package taxxe;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void nhapXe(Vehicle a) {
        System.out.println("Nhap ma so xe: ");
        a.setId(scanner.nextInt());
        System.out.println("Nhap dung tich cua xe: ");
        a.setCapacity(scanner.nextInt());
        System.out.println("Nhap gia tien cua xe: ");
        a.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Nhap ten chu so huu cua xe: ");
        a.setOwner(scanner.nextLine());
        System.out.println("Nhap mo ta ve xe: ");
        a.setDescription(scanner.nextLine());
    }

    public static void main(String[] args) {
        Vehicle[] arr = null;
        int caseNb, x = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Choose one: ");
            System.out.println("1.Tao cac đoi tuong xe và nhap thông tin \n" +
                    "2.Xuat bang kê khai tien thue cua các xe.\n" +
                    "Nhap so khác đe thoát");
            caseNb = scanner.nextInt();
            switch (caseNb) {
                case 1:
                    System.out.println("So luong xe muon khai bao thue");
                    x = scanner.nextInt();
                    arr = new Vehicle[x];
                    for (int i = 0; i < x; i++) {
                        System.out.println("Xe thứ " + (i + 1));
                        arr[i] = new Vehicle();
                        nhapXe(arr[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %7s %7s \n", "ID", "Dung tich", "Tri gia", "Chu so huu",
                            "Mo ta", "Thue");
                    for (int i = 0; i < x; i++) {
                        arr[i].inThue();
                    }
                    break;
                default:
                    System.out.println("Thank for ur contribution");
                    flag = false;
                    break;
            }
        }
    }
}
