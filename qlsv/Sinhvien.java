package qlsv;

public class Sinhvien {
    private int maSV;
    private String fullname;
    private float pointLT, pointTH;

    public Sinhvien() {

    }

    public Sinhvien(int maSV, String fullname, float pointLT, float pointTH) {
        this.maSV = maSV;
        this.fullname = fullname;
        this.pointLT = pointLT;
        this.pointTH = pointTH;
    }

    public void setMaSv(int maSV) {
        this.maSV = maSV;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDiemLT(float pointLT) {
        this.pointLT = pointLT;
    }

    public void setDiemTH(float pointTH) {
        this.pointTH = pointTH;
    }

    public float tinhdiemTb() {
        return (pointLT + pointTH) / 2;
    }

    public void inSV() {
        System.out.printf("%6d %15s %12f %15f %15f \n", maSV, fullname, pointLT, pointTH, tinhdiemTb());
    }
}