package mypack;

public class CongViec {
    private String macv;
    private String tencv;
    public NhomCV cv_thuocnhom;

    public CongViec(String macv, String tencv, NhomCV cv_thuocnhom) {
        this.macv = macv;
        this.tencv = tencv;
        this.cv_thuocnhom = cv_thuocnhom;
    }

    public String getMacv() {
        return macv;
    }

    public String getTencv() {
        return tencv;
    }
}
