package mypack;

import java.util.List;

public class NhomTho {
    private String manhomtho;
    private String tennhomtho;
    private String motanhom;
    private String truongnhom;
    private double luongcobanNhom;
    private int soluong;
    public List<Tho> dstho_nhom;

    public NhomTho(String manhomtho, String tennhomtho, String motanhom, double luongcobanNhom) {
        this.manhomtho = manhomtho;
        this.tennhomtho = tennhomtho;
        this.motanhom = motanhom;
        this.luongcobanNhom = luongcobanNhom;
    }

    public String getManhomtho() {
        return manhomtho;
    }

    public String getTennhomtho() {
        return tennhomtho;
    }

    public String getMotanhom() {
        return motanhom;
    }

    public String getTruongnhom() {
        return truongnhom;
    }
    public void setTruongnhom(String matruongnhom){this.truongnhom=matruongnhom;}

    public double getLuongcobanNhom() {
        return luongcobanNhom;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
