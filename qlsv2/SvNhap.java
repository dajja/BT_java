package qlsv2;

public class SvNhap {
    private int id;
    private String name, address, phone;
    SvNhap() {

    }
    SvNhap (int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void setId (int id) {
        this.id = id;
    }
    public int xinId () {
        return id;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public void setPhone (String phone) {
        this.phone = phone;
    }
    public void display () {
        System.out.printf("%6d %15s %10s %10s \n", id, name, address, phone);
    }
}
