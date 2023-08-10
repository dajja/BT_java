package hcn;

public class HinhChuNhat {
    private int width, height;

    public HinhChuNhat() {

    }

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setCd(int width) {
        this.width = width;
    }

    public void setCr(int height) {
        this.height = height;
    }

    public int tinhDienTich() {
        return width * height;
    }

    public int tinhChuVi() {
        return (width + height) * 2;
    }
}
