package mypack;

public class LoaiTrangPhuc {
    private String maloaiTP;
    private String chatlieu;
    private String mausac;

    public LoaiTrangPhuc(String maloaiTP, String chatlieu, String mausac) {
        this.maloaiTP = maloaiTP;
        this.chatlieu = chatlieu;
        this.mausac = mausac;
    }

    public String getMaloaiTP() {
        return maloaiTP;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public String getMausac() {
        return mausac;
    }
}
