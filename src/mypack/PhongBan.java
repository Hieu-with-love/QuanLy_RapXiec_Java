package mypack;

import java.util.List;

public class PhongBan {
    private String maPB;
    private String tenPB;
    private String diachi;
    private String truongphong; // FK
    public List<NhanVien> dsnv_nhom;
    public PhongBan(String maPB, String tenPB, String diachi){
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.diachi = diachi;
    }

    public String getMaPB() {
        return maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getTruongphong() {
        return truongphong == null? "":truongphong;
    }
    public void setTruongphong(String matruongphong){this.truongphong = matruongphong;}

}
