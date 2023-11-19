package mypack;

import java.util.Date;

public class NhomBieuDien {
    private String manhomBD;
    private String tennhomBD;
    private double luongcoban;
    private String ngaythanhlap;

    public NhomBieuDien(String manhomBD, String tennhomBD, String ngaythanhlap, double luongcoban) {
        this.manhomBD = manhomBD;
        this.tennhomBD = tennhomBD;
        this.luongcoban = luongcoban;
        this.ngaythanhlap = ngaythanhlap;
    }

    public String getManhomBD() {
        return manhomBD;
    }

    public String getTennhomBD() {
        return tennhomBD;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public String getNgaythanhlap() {
        return ngaythanhlap;
    }
}
