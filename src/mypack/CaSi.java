package mypack;

import java.util.Date;

public class CaSi extends ConNguoi{
    private String macasi;
    private int capdohat;
    public NhomBieuDien thuocnhom;
    public CaSi(String macasi, String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt, int capdohat,
                NhomBieuDien thuocnhom) {
        super(hoten, gioitinh, ngaysinh, diachi, sdt);
        this.macasi = macasi;
        this.capdohat = capdohat;
        this.thuocnhom = thuocnhom;
    }

    public String getMacasi() {
        return macasi;
    }

    public int getCapdo() {
        return capdohat;
    }
}
