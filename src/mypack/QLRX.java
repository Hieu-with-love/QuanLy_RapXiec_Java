package mypack;

import java.util.*;
import java.util.stream.Collectors;

public class QLRX {
    static List<NhomBieuDien> dsNhomBieuDien = new ArrayList<>();
    static List<CaSi> dsCaSi = new ArrayList<>();
    static List<DienVienXiec> dsDienVienXiec = new ArrayList<>();
    static List<TrangPhuc> dsTrangPhuc = new ArrayList<>();
    static List<LoaiTrangPhuc> dsLoaiTrangPhuc = new ArrayList<>();
    static List<HDNSTP> dsHDNSTP = new ArrayList<>();
    static List<PhieuThu> dsPhieuThu = new ArrayList<>();
    static List<NhanVien> dsNhanVien = new ArrayList<>();
    static List<PhongBan> dsPhongBan = new ArrayList<>();
    static List<Tho> dsTho = new ArrayList<>();
    static List<NhomTho> dsNhomTho = new ArrayList<>();
    static List<CongViec> dsCongViec = new ArrayList<>();
    static List<NhomCV> dsNhomCongViec = new ArrayList<>();
    static List<ChiTietNCTP> dsChiTietNCTP = new ArrayList<>();
    static List<ChiTietSCTP> dsChiTietSCTP = new ArrayList<>();
    static List<KhaNang> dsKhaNang = new ArrayList<>();
    public static void TaoDSNhomBieuDien()
    {
        dsNhomBieuDien.add(new NhomBieuDien("NhomBD001", "All Star","12/01/2020" ,1000));
        dsNhomBieuDien.add(new NhomBieuDien("NhomBD002", "Rock Legends","12/09/2019",700));
        dsNhomBieuDien.add(new NhomBieuDien("NhomBD003", "Pop Sensations","07/08/2013", 650));
        dsNhomBieuDien.add(new NhomBieuDien("NhomBD004", "Xiec tong hop","01/01/2022", 500));
    }
    public static void TaoDSCaSi()
    {
        dsCaSi.add(new CaSi("CaSi001", "Nguyen Thuy Tien", true,"05/04/1999", "TP.HCM", "0877324565", 3, dsNhomBieuDien.get(0)));
        dsCaSi.add(new CaSi("CaSi002", "Tran Nhat Linh", false,"15/10/1995" , "Ha Noi", "0987654321", 5, dsNhomBieuDien.get((1))));
        dsCaSi.add(new CaSi("CaSi003", "Le Thi Anh Thu", true,"20/07/1990" ,"Da Nang", "0123456789", 4, dsNhomBieuDien.get(2)));
        dsCaSi.add(new CaSi("CaSi004", "Pham Van Hai", false,"28/02/1988" , "TP.HCM", "0369871234", 2, dsNhomBieuDien.get(0)));
    }
    public static void TaoDSDienVienXiec()
    {
        dsDienVienXiec.add(new DienVienXiec("DVX001", "Le Minh Hoang", false,"09/12/2000", "Binh Dinh", "0989321456", 4, dsNhomBieuDien.get(3)));
        dsDienVienXiec.add(new DienVienXiec("DVX002", "Tran Van Hiep", false,"15/08/1998", "TP.HCM", "0978123456", 3, dsNhomBieuDien.get(2)));
        dsDienVienXiec.add(new DienVienXiec("DVX003", "Pham Thi Thu", true,"25/03/1997", "Da Nang", "0909123456", 6, dsNhomBieuDien.get(0)));
        dsDienVienXiec.add(new DienVienXiec("DVX004", "Vo Minh Duc", false,"10/06/1996" , "TP.HCM", "0918234567", 4, dsNhomBieuDien.get(3)));
        dsDienVienXiec.add(new DienVienXiec("DVX005", "Le Thi Ngoc Anh", true,"05/09/1999" , "Da Nang", "0929345678", 5, dsNhomBieuDien.get(1)));
        dsDienVienXiec.add(new DienVienXiec("DVX006", "Truong Van Nam", false,"30/01/2001", "Bac Ninh", "0930456789", 3, dsNhomBieuDien.get(2)));
        dsDienVienXiec.add(new DienVienXiec("DVX007", "Do Minh Tu", false,"15/04/1994" , "Quang Tri", "0941567890", 6, dsNhomBieuDien.get(3)));
        dsDienVienXiec.add(new DienVienXiec("DVX008", "Le Thi Lan", true,"20/11/1991" , "TP.HCM", "0998876543", 6, dsNhomBieuDien.get(2)));
        dsDienVienXiec.add(new DienVienXiec("DVX009", "Phan Thi Hong", true,"12/07/1993" , "Ha Noi", "0978654321", 4, dsNhomBieuDien.get(0)));
        dsDienVienXiec.add(new DienVienXiec("DVX010", "Nguyen Thi Binh", true,"05/10/1992" , "Ha Noi", "0987765432", 5, dsNhomBieuDien.get(1)));
    }
    public static void TaoDSLoaiTrangPhuc()
    {
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LoaiTP001", "Vai lua", "Hong canh sen"));
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LoaiTP002", "Vai cotton", "Den nham"));
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LoaiTP003", "Vai da", "Nau"));
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LoaiTP004", "Vai thun PolyEste", "Vang nau"));
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LoaiTP005", "Vai Kate", "Nhieu mau"));
    }
    public static void TaoDSTrangPhuc()
    {
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc001", "Ao dai bong sen", true,200.9, dsLoaiTrangPhuc.get(0),"NhomBD001"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc002", "Ao vest den", true,150.9, dsLoaiTrangPhuc.get(1),"NhomBD002"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc003", "Ao somi trang", false,120.9, dsLoaiTrangPhuc.get(2),"NhomBD003"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc004", "Ao khoac da nau", false,339.9, dsLoaiTrangPhuc.get(3),"NhomBD004"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc005", "Ao thun mau sac", true,100, dsLoaiTrangPhuc.get(4),"NhomBD001"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc006", "Dam ren trang", true, 200,dsLoaiTrangPhuc.get(0),"NhomBD002"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc007", "Quan jean xanh", false,250, dsLoaiTrangPhuc.get(1),"NhomBD001"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc008", "Ao so mi hong", false,100, dsLoaiTrangPhuc.get(2),"NhomBD001"));
        dsTrangPhuc.add(new TrangPhuc("TrangPhuc009", "Dam hoa nhi", true,230.9, dsLoaiTrangPhuc.get(0),"NhomBD003"));
    }
    public static void TaoDSPhongBan()
    {
        dsPhongBan.add(new PhongBan("PB001", "Phong nhan su", "Go Vap - TP.HCM"));
        dsPhongBan.add(new PhongBan("PB002", "Phong ke toan", "Quan 10 - TP.HCM"));
        dsPhongBan.add(new PhongBan("PB003", "Phong nghien cuu va phat trien", "Binh Thanh - TP.HCM"));
        dsPhongBan.add(new PhongBan("PB004", "Phong tiep thi", "Quan 9 - TP.HCM"));
        dsPhongBan.add(new PhongBan("PB005", "Phong san xuat", "Khu cong nghe cao - Quan 9 - TP.HCM"));
    }
    public static void TaoDSNhanVien()
    {
        dsNhanVien.add(new NhanVien("NV001", "Nguyen Minh Hien", false,"05/04/2000", "TP.HCM", "0876332214", dsPhongBan.get(0)));
        dsNhanVien.add(new NhanVien("NV002", "Tran Van A", false,"15/12/1995" , "TP.HCM", "0123456789", dsPhongBan.get(1)));
        dsNhanVien.add(new NhanVien("NV003", "Le Thi B", true,"20/06/1998", "Da Nang", "0987654321", dsPhongBan.get(2)));
        dsNhanVien.add(new NhanVien("NV004", "Pham Van C", false,"25/10/1997", "Dong Nai", "0123456789", dsPhongBan.get(3)));
        dsNhanVien.add(new NhanVien("NV005", "Tran Thi D", true,"30/08/1996" , "Binh Duong", "0987654321", dsPhongBan.get(4)));
        dsNhanVien.add(new NhanVien("NV006", "Vo Van E", false,"10/02/1999" , "Binh Duong", "0123456789", dsPhongBan.get(2)));
        dsNhanVien.add(new NhanVien("NV007", "Nguyen Van F", true,"12/07/1994", "TP.HCM", "0987654321", dsPhongBan.get(3)));
        dsNhanVien.add(new NhanVien("NV008", "Hoang Thi G", false,"18/03/2001" , "Dong Nai", "0123456789", dsPhongBan.get(4)));
        dsNhanVien.add(new NhanVien("NV009", "Tran Van H", true,"22/11/1993" , "Vinh Long", "0987654321", dsPhongBan.get(3)));
        dsNhanVien.add(new NhanVien("NV010", "Nguyen Van I", false,"28/05/1992" , "Ha Noi", "0123456789", dsPhongBan.get(3)));
        dsNhanVien.add(new NhanVien("NV011", "Phan Thi K", true,"08/10/1990" , "Binh Dinh", "0987654321", dsPhongBan.get(0)));
        dsNhanVien.add(new NhanVien("NV012", "Bui Van L", false,"14/01/1991" , "TP.HCM", "0123456789", dsPhongBan.get(1)));
        dsNhanVien.add(new NhanVien("NV013", "Nguyen Van M", true,"03/06/1988" , "Ha Noi", "0987654321", dsPhongBan.get(4)));
        dsPhongBan.get(0).dsnv_nhom = List.of(dsNhanVien.get(0), dsNhanVien.get(10) ); dsPhongBan.get(0).setTruongphong(dsNhanVien.get(0).getManv());
        dsPhongBan.get(1).dsnv_nhom = List.of( dsNhanVien.get(1), dsNhanVien.get(11) );
        dsPhongBan.get(2).dsnv_nhom = List.of( dsNhanVien.get(2), dsNhanVien.get(5) ); dsPhongBan.get(2).setTruongphong(dsNhanVien.get((5)).getManv());
        dsPhongBan.get(3).dsnv_nhom = List.of(dsNhanVien.get(3), dsNhanVien.get(6), dsNhanVien.get(8), dsNhanVien.get(9) ); dsPhongBan.get(3).setTruongphong(dsNhanVien.get(3).getManv());
        dsPhongBan.get(4).dsnv_nhom = List.of(dsNhanVien.get(4), dsNhanVien.get(7), dsNhanVien.get(12)); dsPhongBan.get(4).setTruongphong(dsNhanVien.get(4).getManv());
    }
    public static void TaoDSHopDongNhanSuaTrangPhuc()
    {
        dsHDNSTP.add(new HDNSTP(1, "Sua chua tong hop", 9200, dsNhanVien.get(3)));
        dsHDNSTP.add(new HDNSTP(2, "Trang bi them chi tiet", 5000, dsNhanVien.get(4)));
        dsHDNSTP.add(new HDNSTP(3, "Sua chua co ban", 1400,  dsNhanVien.get(0)));
        dsHDNSTP.add(new HDNSTP(4, "Thay the phu lieu trang phuc", 5500, dsNhanVien.get(3)));
        dsHDNSTP.add(new HDNSTP(5, "Sua chua trang phuc bi rach", 7000,  dsNhanVien.get(3)));
        dsHDNSTP.add(new HDNSTP(6, "May moi theo yeu cau khach hang", 12000, dsNhanVien.get(4)));
    }
    public static void TaoDSPhieuThu()
    {
        dsPhieuThu.add(new PhieuThu("Phieu001", 1000,"01/10/2023", "11/10/2023", dsHDNSTP.get(0)));
        dsPhieuThu.add(new PhieuThu("Phieu002", 1500,"05/11/2023","25/11/2023" , dsHDNSTP.get(1)));
        dsPhieuThu.add(new PhieuThu("Phieu003", 800,"10/12/2022","10/12/2022" , dsHDNSTP.get(2)));
        dsPhieuThu.add(new PhieuThu("Phieu004", 2000,"15/09/2023","18/09/2023" , dsHDNSTP.get(3)));
        dsPhieuThu.add(new PhieuThu("Phieu005", 1200,"25/07/2023","25/08/2023" , dsHDNSTP.get(4)));
        dsPhieuThu.add(new PhieuThu("Phieu006", 3000,"30/06/2023","28/07/2023" , dsHDNSTP.get(5)));
        dsPhieuThu.add(new PhieuThu("Phieu007", 1800,"01/01/2023","23/07/2023" , dsHDNSTP.get(0)));
        dsPhieuThu.add(new PhieuThu("Phieu008", 2500,"05/11/2023","20/12/2022", dsHDNSTP.get(1)));
        dsPhieuThu.add(new PhieuThu("Phieu009", 600,"10/12/2022","11/12/2022", dsHDNSTP.get(2)));
        dsPhieuThu.add(new PhieuThu("Phieu010", 2500,"15/09/2023","18/10/2023", dsHDNSTP.get(3)));
        dsPhieuThu.add(new PhieuThu("Phieu011", 1900,"25/07/2023","13/08/2023" , dsHDNSTP.get(4)));
        dsPhieuThu.add(new PhieuThu("Phieu012", 3500,"25/07/2023","02/08/2023" , dsHDNSTP.get(4)));
    }
    public static void TaoDSNhomTho()
    {
        dsNhomTho.add(new NhomTho("NhomTho001", "Nhom sua do", "Chuyen sua do dac bi hong", 890));
        dsNhomTho.add(new NhomTho("NhomTho002", "Nhom thiet ke", "Chuyen thiet ke mau ma trang phuc moi", 1200));
        dsNhomTho.add(new NhomTho("NhomTho003", "Nhom trang bi", "Chuyen gan them phu kien cho trang phuc", 550));
        dsNhomTho.add(new NhomTho("NhomTho004", "Nhom bao duong", "Chuyen bao duong do dac cho khoi hu nang", 900));
    }
    public static void TaoDSTho()
    {
        dsTho.add(new Tho("Tho001", "Tran Trung Hieu", false,"26/09/2001", "Binh Dinh", "0879663626", dsNhomTho.get(0)));
        dsTho.add(new Tho("Tho002", "Le Thi Thu", true,"15/07/1995", "Da Nang", "0987654321", dsNhomTho.get(1)));
        dsTho.add(new Tho("Tho003", "Nguyen Van Nam", false,"12/10/1998", "Quang Nam", "0123456789", dsNhomTho.get(2)));
        dsTho.add(new Tho("Tho004", "Tran Thi Hoa", true,"18/05/1997", "TP.HCM", "0987654321", dsNhomTho.get(0)));
        dsTho.add(new Tho("Tho005", "Pham Van Dat", false,"22/08/2000", "Quang Tri", "0123456789", dsNhomTho.get(1)));
        dsTho.add(new Tho("Tho006", "Nguyen Thi Hien", true,"01/02/1996", "Binh Duong", "0987654321", dsNhomTho.get(2)));
        dsTho.add(new Tho("Tho007", "Vo Van Minh", false,"28/11/1999", "Dong Nai", "0123456789", dsNhomTho.get(1)));
        dsTho.add(new Tho("Tho008", "Tran Van Luong", true,"05/07/1994", "Da Lat", "0987654321", dsNhomTho.get(0)));
        dsTho.add(new Tho("Tho009", "Ngo Minh Hoang", false,"28/11/1999", "TP.HCM", "0123456789", dsNhomTho.get(3)));
        dsTho.add(new Tho("Tho010", "Truong Tien Si", true,"05/07/1994", "Da Lat", "0987654321", dsNhomTho.get(3)));
            /*dsNhomTho[0].dstho_nhom = new List<Tho> { dsTho[0], dsTho[3], dsTho[7] };
            dsNhomTho[1].dstho_nhom = new List<Tho> { dsTho[1], dsTho[4], dsTho[6] };
            dsNhomTho[2].dstho_nhom = new List<Tho> { dsTho[2], dsTho[5] };
            dsNhomTho[3].dstho_nhom = new List<Tho> { dsTho[8], dsTho[9] };*/
    }
    public static void TaoDSNhomCV()
    {
        dsNhomCongViec.add(new NhomCV("NhomCV001", "Sua do"));
        dsNhomCongViec.add(new NhomCV("NhomCV002", "Thiet ke"));
        dsNhomCongViec.add(new NhomCV("Nhom003", "Da nang"));

    }
    public static void TaoDSCongViec()
    {
        dsCongViec.add(new CongViec("CV001", "May do bi rach", dsNhomCongViec.get(0)));
        dsCongViec.add(new CongViec("CV002", "May nut trang phuc", dsNhomCongViec.get(0)));
        dsCongViec.add(new CongViec("CV003", "Ve ban mau", dsNhomCongViec.get(1)));
        dsCongViec.add(new CongViec("CV004", "Gan phu kien", dsNhomCongViec.get(2)));
        dsCongViec.add(new CongViec("CV005", "May theo yeu cau khach hang", dsNhomCongViec.get(0)));
        dsCongViec.add(new CongViec("CV006", "Do de lay mau", dsNhomCongViec.get(1)));
        dsCongViec.add(new CongViec("CV007", "Bao duong do", dsNhomCongViec.get(1)));
        dsNhomCongViec.get(0).dscv_nhom = List.of(dsCongViec.get(0), dsCongViec.get(1), dsCongViec.get(4));
        dsNhomCongViec.get(1).dscv_nhom = List.of(dsCongViec.get(2), dsCongViec.get(5));
        dsNhomCongViec.get(2).dscv_nhom = List.of(dsCongViec.get(3), dsCongViec.get(6));
    }
    public static void TaoDSChiTietNCTP()
    {
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(0), dsTrangPhuc.get(0)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(1), dsTrangPhuc.get(1)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(2), dsTrangPhuc.get(4)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(3), dsTrangPhuc.get(8)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(4), dsTrangPhuc.get(7)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(5), dsTrangPhuc.get(2)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(3), dsTrangPhuc.get(1)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(1), dsTrangPhuc.get(7)));
        dsChiTietNCTP.add(new ChiTietNCTP(dsHDNSTP.get(5), dsTrangPhuc.get(3)));

    }
    public static void TaoDSChiTietSCTP()
    {
        dsChiTietSCTP.add(new ChiTietSCTP(1,"TrangPhuc002","Tho001","CV001",500));
        dsChiTietSCTP.add(new ChiTietSCTP(2,"TrangPhuc006","Tho003","CV002",200));
        dsChiTietSCTP.add(new ChiTietSCTP(3,"TrangPhuc003","Tho006","CV002",400));
        dsChiTietSCTP.add(new ChiTietSCTP(4,"TrangPhuc008","Tho005","CV004",500));
        dsChiTietSCTP.add(new ChiTietSCTP(5,"TrangPhuc005","Tho004","CV001",150));
        dsChiTietSCTP.add(new ChiTietSCTP(6,"TrangPhuc008","Tho004","CV006",1000));
        dsChiTietSCTP.add(new ChiTietSCTP(4,"TrangPhuc009","Tho001","CV003",350));
        dsChiTietSCTP.add(new ChiTietSCTP(2,"TrangPhuc006","Tho001","CV006",360.9));
        dsChiTietSCTP.add(new ChiTietSCTP(3,"TrangPhuc004","Tho009","CV007",280.9 ));
        dsChiTietSCTP.add(new ChiTietSCTP(1,"TrangPhuc003","Tho004","CV002",399.9));
    }
    public static void TaoDSKhaNang()
    {
        dsKhaNang.add(new KhaNang(dsCongViec.get(0), dsTho.get(0), 5));
        dsKhaNang.add(new KhaNang(dsCongViec.get(1), dsTho.get(2), 2));
        dsKhaNang.add(new KhaNang(dsCongViec.get(2), dsTho.get(0), 5));
        dsKhaNang.add(new KhaNang(dsCongViec.get(3), dsTho.get(2), 3));
        dsKhaNang.add(new KhaNang(dsCongViec.get(4), dsTho.get(1), 5));
        dsKhaNang.add(new KhaNang(dsCongViec.get(5), dsTho.get(2), 2));
        dsKhaNang.add(new KhaNang(dsCongViec.get(0), dsTho.get(3), 3));
        dsKhaNang.add(new KhaNang(dsCongViec.get(1), dsTho.get(2), 2));
        dsKhaNang.add(new KhaNang(dsCongViec.get(2), dsTho.get(7), 1));
        dsKhaNang.add(new KhaNang(dsCongViec.get(3), dsTho.get(2), 2));
        dsKhaNang.add(new KhaNang(dsCongViec.get(0), dsTho.get(9), 3));
        dsKhaNang.add(new KhaNang(dsCongViec.get(0), dsTho.get(2), 2));
    }
    // 1. Cho biet thong tin cac tho trong nhom khi biet ma nhom tho
    public static void Cau01(String manhomtho){
        List<Tho> dsTho_Nhom = dsTho.stream()
                .filter(tho -> tho.getThuocnhomtho().getManhomtho().equals(manhomtho))
                .collect(Collectors.toList());
        System.out.println("Ket qua truy van cau 1:");
        if (dsTho_Nhom.isEmpty()){
            System.out.println("Khong co du lieu cho cau truy van.");
        }
        else{
            System.out.println("Danh sach tho thuoc nhom: "+manhomtho);
            for (Tho tho : dsTho_Nhom){
                String sex = (boolean)tho.isGioitinh()?"Nu":"Nam";
                System.out.println("Ma tho: " + tho.getMatho()+", Ten tho: " + tho.getHoten() + ",Gioi tinh: "+sex
                        +", Dia chi: "+tho.getDiachi());
            }
        }
    }
    // 2. Voi ma nhan vien biet truoc. Xac dinh nhan vien do co phai la truong phong hay khong.
    // Neu la truong phong cho biet thong tin phong ban quan ly.
    public static void Cau02(String manhanvien){
        List<PhongBan> info_phongban = dsNhanVien.stream()
                .filter(nv -> nv.thuocpb.getTruongphong().equals(manhanvien))
                .map(nv -> nv.thuocpb)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Ket qua truy van cau 2:");
        if (info_phongban.isEmpty()){
            System.out.println("Nhan vien co ma "+manhanvien+" khong phai truong phong.");
        }
        else{
            for (PhongBan pb : info_phongban){
                System.out.println("Truong phong co ma "+manhanvien+" quan ly phong ban:");
                System.out.println("Ma phong ban: "+pb.getMaPB()+", Ten phong ban: "+pb.getTenPB()+", Dia chi: "
                +pb.getDiachi());
            }
        }
    }
    // 3. Voi ca si hay dien vien biet truoc ma. Xac dinh nhung thanh vien con lai cung nhom voi ca si
    // hay dien vien do
    public static void Cau03(String manguoibieudien){
        String nhomCuaCaSi = dsCaSi.stream()
                .filter(cs -> cs.getMacasi().equals(manguoibieudien))
                .map(caSi -> caSi.thuocnhom.getManhomBD())
                .distinct().findFirst().orElse(null);
        List<CaSi> dsCaSiThuocNhom = dsCaSi.stream()
                .filter(cs -> cs.thuocnhom.getManhomBD().equals(nhomCuaCaSi))
                .collect(Collectors.toList());

        if (dsCaSiThuocNhom.isEmpty()){
            System.out.println("Khong co ca si nao chung nhom voi ca si co ma "+manguoibieudien);
        }
        else{
            System.out.println("Ket qua truy van cau 3:");
            System.out.println("Nhung ca si chung nhom voi nhau: ");
            for(CaSi cs : dsCaSiThuocNhom){
                System.out.println("Ma ca si: "+cs.getMacasi()+", Ten ca si: "+cs.getHoten());
            }
        }
    }
    // 4. Theo tung nhom, tinh so tien ma nhom do phai tra khi thue do. Cho biet nhom phai tra tien nhieu nhat
    public static void Cau04(){
        Map<String, Double> giaTP_TheoNhom = dsTrangPhuc.stream()
                .collect(Collectors.groupingBy(TrangPhuc::getNhomthue, Collectors.summingDouble(gia -> gia.getGiathue())));

        Map.Entry<String, Double> maxEntry = giaTP_TheoNhom.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("Ket qua truy van cau 4 la:");
        giaTP_TheoNhom.forEach((nhom,tongtien) -> System.out.println("Nhom thue do: "+nhom+", So tien phai tra: "+tongtien));
        if (maxEntry != null){
            System.out.println("Nhom tho "+maxEntry.getKey()+" tra tien nhieu nhat. Va phai tra = "+maxEntry.getValue()
            +"$.");
        }
        else{
            System.out.println("Khong co du lieu truy van cho cau 4.");
        }
    }
    // 5. Cho biet tho tham gia nhieu hop dong nhat
    public static void Cau05(){
        Map<String, Long> soThoThamGiaPer1HD = dsChiTietSCTP.stream()
                .collect(Collectors.groupingBy(ChiTietSCTP::getChitiet_tho, Collectors.counting()));
        Map.Entry<String, Long> maxEntry = soThoThamGiaPer1HD.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("Ket qua truy van cau 5:");
        if (maxEntry != null){
            System.out.println("Ma tho: "+maxEntry.getKey()+", So hop dong = "+maxEntry.getValue());
        }
        else{
            System.out.println("Khong co du lieu truy van cho cau 5.");
        }
    }
    // 6. Cho biet nhung hop dong chua thanh toan du
    public static void Cau06(){
/*        List<PhieuThu> dsPhieuThuChuaThuDu = dsPhieuThu.stream()
                .filter(phieu -> (phieu.getThu_hd().getTrigiaHD()- phieu.getSotientra() > 0))
                .collect(Collectors.toList());*/
        List<Map<HDNSTP, Double>> dsHopDongChuaThanhToanDu = Collections.singletonList(dsPhieuThu.stream()
                .collect(Collectors.groupingBy(PhieuThu::getThu_hd,
                        Collectors.summingDouble(tien -> (tien.getThu_hd().getTrigiaHD() - tien.getSotientra())))));
        System.out.println("Ket qua truy van cau 6:");
        for(Map<HDNSTP, Double> hd : dsHopDongChuaThanhToanDu){
            hd.forEach((sohd,sotien) -> System.out.println("Ma hop dong: "+sohd.getSoHD()+", So tien con thieu = "+sotien));
        }
    }
    // 7. Liet ke danh sach cac tho theo tung nhom (cho biet tong so luong tho cua nhom do)
    public static void Cau07(){
        Map<NhomTho, Long> dsThoHTheoNhom = dsTho.stream()
                .collect(Collectors.groupingBy(Tho::getThuocnhomtho, Collectors.counting()));
        System.out.println("Ket qua truy van cau 7:");
        dsThoHTheoNhom.forEach((nhom,sl) -> System.out.println("Nhom tho: "+nhom.getManhomtho()+", So luong = "+sl));
    }
    // 8. Cho biet nhung tho khong tham gia hd nao
    public static void Cau08(){
        Set<String> maThoThamGiaHopDong = dsChiTietSCTP.stream()
                .map(ChiTietSCTP::getChitiet_tho).collect(Collectors.toSet());
        List<Tho> thoKhongThamGiaHopDong = dsTho.stream().filter((tho) -> {
            return !maThoThamGiaHopDong.contains(tho.getMatho());
        }).collect(Collectors.toList());

        System.out.println("Ket qua truy van cau 8:");
        thoKhongThamGiaHopDong.forEach((tho) -> {
            System.out.println("Ma tho: "+tho.getMatho()+", Ten tho: "+tho.getHoten());
        });
    }
    // Cho biet cong viec nao chua duoc thuc hien tren tat ca hop dong.

    // 9. Cho biet thong tin phong ban ma nhan vien thuc hien lap nhieu hop dong nhat thuoc vao.
    public static void Cau09(){
        Map<NhanVien, Long> nhanVienLapSoHD = dsHDNSTP.stream()
                .collect(Collectors.groupingBy(HDNSTP::getNv_laphd, Collectors.counting()));
        Map.Entry<NhanVien, Long> nhanVienLapHopDongNhieuNhat = nhanVienLapSoHD.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("Ket qua truy van cau 9:");
        if (nhanVienLapHopDongNhieuNhat != null){
            System.out.println("Ma nhan vien : "+nhanVienLapHopDongNhieuNhat.getKey().getManv()+", Ten nhan vien: "+
            nhanVienLapHopDongNhieuNhat.getKey().getHoten() + ", Phong ban: "
                    +nhanVienLapHopDongNhieuNhat.getKey().thuocpb.getMaPB()+", Ten phong ban: "
            +nhanVienLapHopDongNhieuNhat.getKey().thuocpb.getTenPB());
        }
        else{
            System.out.println("Khong co du lieu cho truy van.");
        }
    }
    // 10. Cho biet tho nao lam nhieu viec nhat. Tinh toan luong cho tung cong viec theo cap do, sap xep tang dan theo trinh
    // do, neu trinh do bang nhau, sap xep giam dan theo luong cua cong viec do
    public static void Cau10(){

    }
    public static void main(String[] args) {
        TaoDSNhomBieuDien();
        TaoDSCaSi();
        TaoDSDienVienXiec();
        TaoDSLoaiTrangPhuc();
        TaoDSTrangPhuc();
        TaoDSPhongBan();
        TaoDSNhanVien();
        TaoDSHopDongNhanSuaTrangPhuc();
        TaoDSPhieuThu();
        TaoDSNhomTho();
        TaoDSTho();
        TaoDSNhomCV();
        TaoDSCongViec();
        TaoDSChiTietNCTP();
        TaoDSChiTietSCTP();
        TaoDSKhaNang();
        dsNhomTho.get(0).setTruongnhom("Tho001");
        dsNhomTho.get(1).setTruongnhom("Tho002");
        dsNhomTho.get(2).setTruongnhom("Tho003");
        dsNhomTho.get(3).setTruongnhom("Tho009");

        // Cau01:
        Cau01("NhomTho001");
        //Cau02:
        Cau02("NV006");
        //Cau03:
        Cau03("CaSi001");
        //Cau04:
        Cau04();
        //Cau05:
        Cau05();
        //Cau06:
        Cau06();
        //Cau07
        //Cau07();
        //Cau08:
        Cau08();
        //Cau09:
        Cau09();
        //Cau10
        Cau10();
       // System.out.println("Truong phong: " + dsNhanVien.get(0).thuocpb.getTruongphong());
    }
}
