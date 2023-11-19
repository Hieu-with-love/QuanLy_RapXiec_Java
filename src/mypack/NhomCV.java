package mypack;

import java.util.List;

public class NhomCV {
    private String manhomcv;
    private String tennhomcv;
    public List<CongViec> dscv_nhom;
    public NhomCV(String manhomcv, String tennhomcv) {
        this.manhomcv = manhomcv;
        this.tennhomcv = tennhomcv;
    }

    public String getManhomcv() {
        return manhomcv;
    }

    public String getTennhomcv() {
        return tennhomcv;
    }
}
