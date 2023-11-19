package mypack;

import java.util.Date;

public class DienVienXiec extends ConNguoi{
    private String madienvien;
    private int capdodien;
    public NhomBieuDien thuocnhom;
    public DienVienXiec(String madienvien, String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt,
                        int capdodien, NhomBieuDien thuocnhom) {
        super(hoten, gioitinh, ngaysinh, diachi, sdt);
        this.madienvien = madienvien;
        this.capdodien = capdodien;
        this.thuocnhom = thuocnhom;
    }

    public String getMadienvien() {
        return madienvien;
    }

    public int getCapdodien() {
        return capdodien;
    }
}
