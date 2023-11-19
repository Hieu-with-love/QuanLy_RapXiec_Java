package mypack;

import java.util.Date;

public class HDNSTP {
    private int soHD;
    private String tenHD;
    private double trigiaHD;
    private NhanVien nv_laphd;

    public HDNSTP(int soHD, String tenHD, double trigiaHD, NhanVien nv_laphd) {
        this.soHD = soHD;
        this.tenHD = tenHD;
        this.trigiaHD = trigiaHD;
        this.nv_laphd = nv_laphd;
    }

    public int getSoHD() {
        return soHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public double getTrigiaHD() {
        return trigiaHD;
    }
    public NhanVien getNv_laphd(){return nv_laphd;}
    public void setNv_laphd(NhanVien v){this.nv_laphd=v;}
}
