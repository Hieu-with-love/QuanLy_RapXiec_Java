package mypack;

public class ChiTietNCTP {
    private HDNSTP chitiet_hd;
    private TrangPhuc chitiet_tp;

    public ChiTietNCTP(HDNSTP chitiet_hd, TrangPhuc chitiet_tp) {
        this.chitiet_hd = chitiet_hd;
        this.chitiet_tp = chitiet_tp;
    }

    public HDNSTP getChitiet_hd() {
        return chitiet_hd;
    }

    public TrangPhuc getChitiet_tp() {
        return chitiet_tp;
    }

    public void setChitiet_hd(HDNSTP chitiet_hd) {
        this.chitiet_hd = chitiet_hd;
    }

    public void setChitiet_tp(TrangPhuc chitiet_tp) {
        this.chitiet_tp = chitiet_tp;
    }
}
