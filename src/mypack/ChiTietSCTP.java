package mypack;

public class ChiTietSCTP {
    private int chitiet_hd;
    private String chitiet_tp;
    private String chitiet_tho;
    private String chiteit_cv;
    private double tiencongtho;
    public ChiTietSCTP(int chitiet_hd, String chitiet_tp, String chitiet_tho, String chiteit_cv, double tiencongtho) {
        this.chitiet_hd = chitiet_hd;
        this.chitiet_tp = chitiet_tp;
        this.chitiet_tho = chitiet_tho;
        this.chiteit_cv = chiteit_cv;
        this.tiencongtho=tiencongtho;
    }
    public double getTiencongtho(){return tiencongtho;}

    public int getChitiet_hd() {
        return chitiet_hd;
    }

    public String getChitiet_tp() {
        return chitiet_tp;
    }

    public String getChitiet_tho() {
        return chitiet_tho;
    }

    public String getChiteit_cv() {
        return chiteit_cv;
    }
}
