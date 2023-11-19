package mypack;

import java.util.Date;

public class Tho extends ConNguoi{
    private String matho;
    private NhomTho thuocnhomtho;
    public Tho(String matho, String hoten, boolean gioitinh, String ngaysinh, String diachi, String sdt
    , NhomTho thuocnhomtho) {
        super(hoten, gioitinh, ngaysinh, diachi, sdt);
        this.matho = matho;
        this.thuocnhomtho = thuocnhomtho;
    }
    public String getMatho() {
        return matho;
    }
    public NhomTho getThuocnhomtho(){return thuocnhomtho;}
    public void setThuocnhomtho(NhomTho v){thuocnhomtho=v;}

}
