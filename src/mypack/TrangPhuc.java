package mypack;

public class TrangPhuc {
    private String maTP;
    private String tenTP;
    private boolean tinhtrang;
    private double giathue;
    public LoaiTrangPhuc thuocloai;
    private String nhomthue;//FK

    public TrangPhuc(String maTP, String tenTP, boolean tinhtrang, double giathue, LoaiTrangPhuc thuocloai, String nhomthue) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.tinhtrang = tinhtrang;
        this.giathue=giathue;
        this.thuocloai = thuocloai;
        this.nhomthue=nhomthue;
    }

    public String getMaTP() {
        return maTP;
    }

    public String getTenTP() {
        return tenTP;
    }
    public double getGiathue(){return giathue;}

    public boolean isTinhtrang() {
        return tinhtrang;
    }
    public String getNhomthue(){return nhomthue;}
    public void setNhomthue(String v){this.nhomthue=v;}
}
