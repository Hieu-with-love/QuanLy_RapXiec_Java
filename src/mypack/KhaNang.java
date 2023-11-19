package mypack;

public class KhaNang {
    public CongViec kn_cv;
    public Tho kn_tho;
    private int trinhdo;

    public KhaNang(CongViec kn_cv, Tho kn_tho, int trinhdo) {
        this.kn_cv = kn_cv;
        this.kn_tho = kn_tho;
        this.trinhdo = trinhdo;
    }
    public int getTrinhdo(){return  trinhdo;}
    public void setTrinhdo(int v){trinhdo = v;}
}
