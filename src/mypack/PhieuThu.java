package mypack;

import java.util.Date;

public class PhieuThu {
    private String sophieu;
    private double sotientra;
    private String ngayhopdong;
    private String ngaythu;
    private HDNSTP thu_hd;

    public PhieuThu(String sophieu, double sotientra,String ngayhopdong, String ngaythu, HDNSTP thu_hd) {
        this.sophieu = sophieu;
        this.sotientra = sotientra;
        this.ngayhopdong=ngayhopdong;
        this.ngaythu = ngaythu;
        this.thu_hd = thu_hd;
    }

    public String getSophieu() {
        return sophieu;
    }

    public double getSotientra() {
        return sotientra;
    }

    public String getNgaythu() {
        return ngaythu;
    }
    public String getNgayhopdong(){return ngayhopdong;}
    public HDNSTP getThu_hd(){return thu_hd;}
    public void setThu_hd(HDNSTP v){this.thu_hd=v;}
}
