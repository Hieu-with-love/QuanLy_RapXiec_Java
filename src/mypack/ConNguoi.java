package mypack;

import java.util.Date;

public class ConNguoi {
    private String hoten;
    private boolean gioitinh;
    private String ngaysinh;
    private String diachi;
    private String sdt;
    private double luoncoban;

    public ConNguoi(String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public ConNguoi(String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt, double luoncoban) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.luoncoban = luoncoban;
    }

    public String getHoten() {
        return hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }
    public double getLuoncoban(){return luoncoban;}
    public void setLuoncoban(double v){this.luoncoban = v;}
}
