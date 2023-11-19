package mypack;

import java.util.Date;

public class NhanVien extends ConNguoi {
    private String manv;
    public PhongBan thuocpb;
    public NhanVien(String manv,String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt, PhongBan thuocpb) {
        super(hoten, gioitinh, ngaysinh, diachi, sdt);
        this.manv = manv;
        this.thuocpb = thuocpb;
    }

    public String getManv() {
        return manv;
    }
}
