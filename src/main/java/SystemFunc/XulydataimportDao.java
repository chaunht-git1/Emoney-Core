package SystemFunc;

import Fun.Xulychuoi;
import LocalModel.KieuhoiList;
import LocalModel.TableImportdataApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XulydataimportDao {

    public static List<KieuhoiList> xulydataMoneygram(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();

        //1. Lọc dữ liệu trong file xml gán vào class KieuhoiList
        for (int i = 0; i < details.size(); i++) {
            TableImportdataApiModel detail = new TableImportdataApiModel();
            //detail = new TableImportdataApiModel();
            detail = details.get(i);
            KieuhoiList k = new KieuhoiList();
            int so = i + 1;
            k.setSoPhieu(sophieu);
            k.setMaNguoinhan(detail.getCot3());
            // Kiem tra diem chi tra .
            String diemchitra = detail.getCot5();
            if (diemchitra.equalsIgnoreCase("HOME_DELIVERY")) {
                diemchitra = "TN";
            } else {
                diemchitra = "TQ";
            }
            k.setIdDiadiemchitra(diemchitra);
            k.setIdLoaitienchitra(detail.getCot6());
            k.setHoten(detail.getCot10() + detail.getCot9() + detail.getCot8());
            //Lấy địa chỉ 1, 2 và quận/huyện
            k.setDiachi(detail.getCot11() + detail.getCot12() + detail.getCot13());
            //Lấy địa chỉ 1
            k.setDiachigoc(detail.getCot11());
            k.setDienthoai(detail.getCot14());
            k.setIdLoaitiengoi(detail.getCot6());
            BigDecimal tygia = new BigDecimal(detail.getCot18());
            k.setTygia(tygia);
            BigDecimal sotiengoi = new BigDecimal(detail.getCot21());
            k.setSotiengoi(sotiengoi);
            BigDecimal thanhtien = new BigDecimal(detail.getCot21());
            k.setThanhtien(thanhtien);
            k.setNguoigoi(detail.getCot24() + detail.getCot23() + detail.getCot22());
            k.setIdCity(detail.getCot38());
            k.setExtOrder(detail.getCot17());
            k.setIdAgent(detail.getCot2());
            k.setAgent(detail.getCot7());
            k.setRecordNote(detail.getCot40());
            k.setGhichuPhCtTam(detail.getCot39());
            k.setStt(so);

            kieuhoiLists.add(k);
        }

        return kieuhoiLists;

    }

    public static List<KieuhoiList> xulydataRia(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file xml gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                //detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(detail.getCot3());
                // Kiem tra diem chi tra .
                String diemchitra = detail.getCot14();
                if (diemchitra.equalsIgnoreCase("TN")) {
                    diemchitra = "TN";
                } else if (diemchitra.equalsIgnoreCase("TK")) {
                    diemchitra = "TK";
                } else {
                    diemchitra = "TQ";
                }
                k.setIdDiadiemchitra(diemchitra);

                k.setHoten(detail.getCot7().trim());
//            //Lấy địa chỉ 
                k.setDiachi(detail.getCot8().trim() + " " + detail.getCot9().trim());
                String dt = detail.getCot15();
                if (dt == null) {
                    dt = "";
                } else {
                    dt = dt.trim();
                }
                k.setDienthoai(dt);
                String loaitg = detail.getCot13();
                String loaicongno;
                k.setIdLoaitienchitra(detail.getCot13());
                k.setIdLoaitiengoi(detail.getCot13());
                if (loaitg == "VND") {

                    loaicongno = "USD";
                } else {

                    loaicongno = loaitg;

                }
                k.setIdLoaicongno(loaicongno);
                BigDecimal tygia = new BigDecimal(detail.getCot11());
                k.setTygia(tygia);
                BigDecimal sotiengoi = new BigDecimal(detail.getCot11());
                k.setSotiengoi(sotiengoi);
                BigDecimal thanhtien = new BigDecimal(detail.getCot11());
                k.setThanhtien(thanhtien);
                k.setNguoigoi(detail.getCot6().trim());
//                k.setIdCity(detail.getCot12());
                k.setIdAgent(detail.getCot20());
//                k.setAgent(detail.getCot21());
                k.setPinNo(detail.getCot5());
                k.setPayagentseq(detail.getCot4());

                k.setSotaikhoankh(detail.getCot17());
                if (detail.getCot18() != null) {
                    k.setGhichuGoi(detail.getCot18().trim());
                }
                k.setAgent(detail.getCot19());
                k.setIdCity(detail.getCot12());
                k.setPinNo(detail.getCot5());

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }

    }

    public static List<KieuhoiList> xulydataSaigonCentralPost(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file xml gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(detail.getCot2());
                // Kiem tra diem chi tra .
                String diemchitra = "TN";
                k.setIdDiadiemchitra(diemchitra);

                k.setHoten(detail.getCot7().trim());
                /* if (detail.getCot8().equalsIgnoreCase("(ĐT)")) {
                 k.setHoten1(null);
                 } else {
                 k.setHoten1(detail.getCot8());
                 }*/

                //Lấy cả giá trị (ĐT))
                k.setHoten1(detail.getCot8());

//            //Lấy địa chỉ 
                k.setDiachi(detail.getCot10().trim());
                k.setDienthoai(detail.getCot13());
                k.setIdLoaitienchitra(detail.getCot17());
                k.setIdLoaitiengoi(detail.getCot17());
                k.setIdLoaicongno(detail.getCot17());
                k.setTygia(null);
                BigDecimal sotiengoi = new BigDecimal(detail.getCot3());
                k.setSotiengoi(sotiengoi);
                k.setThanhtien(null);
                k.setNguoigoi(detail.getCot6().trim());
                k.setIdAgent(detail.getCot5());
                k.setGhichuGoi(detail.getCot15());
                k.setAgent(detail.getCot18());
                k.setIdCity(detail.getCot19());
                k.setDiachigoc(detail.getCot12().toUpperCase());
                k.setIdDistrict(detail.getCot11().toUpperCase());

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }

    }

    public static List<KieuhoiList> xulydataTinnghia(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(detail.getCot2());
                // Kiem tra diem chi tra .
                String diemchitra = "TN";
                k.setIdDiadiemchitra(diemchitra);
                k.setHoten(detail.getCot4().trim());

                k.setHoten1(null);
                //Lấy địa chỉ 
                k.setDiachi(detail.getCot5().trim().toUpperCase());
                k.setDienthoai(detail.getCot7());
                String loaitienchitra = detail.getCot6().replaceAll("[^a-zA-Z]", "").toUpperCase();
                k.setIdLoaitienchitra(loaitienchitra);
                k.setIdLoaitiengoi("USD");
                k.setIdLoaicongno(null);
                try {
                    BigDecimal tygia = new BigDecimal(detail.getCot11());
                    k.setTygia(tygia);
                } catch (Exception e) {
                    k.setTygia(null);
                }
//                BigDecimal sotiengoi = new BigDecimal(detail.getCot6().replaceAll("[^0-9.]", ""));
                float laysotien = laysotientuchuoi(detail.getCot6());
                BigDecimal sotiengoi = new BigDecimal(laysotien);
                k.setSotiengoi(sotiengoi);
                k.setThanhtien(sotiengoi);
                k.setNguoigoi(detail.getCot3().trim());
                k.setIdAgent(null);
                k.setGhichuGoi(detail.getCot9());
                k.setAgent(null);
                k.setIdCity(null);
                k.setDiachigoc(detail.getCot5());
                k.setIdDistrict(null);

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }

    }

    public static float laysotientuchuoi(String chuoi) {

        //Vd chuỗi abc.197.67.USD, lấy ra 197.67
        float sotien = 0;
        List<Integer> list = new ArrayList<Integer>();
        //Lấy tất cả vị trí có số xuất hiện
        for (int i = 0; i < chuoi.length(); i++) {
            try {
                //nếu tại vị trí i, giá trị chuyển về được kiểu int, lưu vị trí i vào list
                int d = Integer.parseInt("" + chuoi.charAt(i));
                list.add(i);
            } catch (Exception e) {
            }
        }
        //Lấy vị trí nhỏ nhất và lớn nhất trong chuỗi mà có số xuất hiện
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        //Cắt chuỗi từ vị trí min đến max
        String chuoiso = "";
        for (int i = min; i < max + 1; i++) {
            //kiểm tra trong chuỗi có dấu phẩy, nếu có thì bỏ đi
            if (",".equalsIgnoreCase(("" + chuoi.charAt(i)).trim())) {

            } else {
                chuoiso += chuoi.charAt(i);
            }
        }
        //Định dạng chuỗi vừa cắt về kiểu số thực
        sotien = Float.parseFloat(chuoiso);
        return sotien;
    }

    public static List<KieuhoiList> xulydataMoneyPolo(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file excel gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(detail.getCot1());
                String diemchitra = null;
                if (detail.getCot4().equalsIgnoreCase("")) {
                    // Kiem tra diem chi tra .
                    diemchitra = "TN";
                } else {
                    diemchitra = "TQ";
                }
                k.setIdDiadiemchitra(diemchitra);
                k.setHoten(detail.getCot3().trim().toUpperCase());

                k.setHoten1(null);
                //Lấy địa chỉ 
                try {
                    k.setDiachi(detail.getCot9().trim().toUpperCase());
                } catch (Exception e) {
                    k.setDiachi(null);
                }
                k.setDienthoai(detail.getCot8());
                String loaitienchitra = detail.getCot6().toUpperCase();
                k.setIdLoaitienchitra(loaitienchitra);
                k.setIdLoaitiengoi(loaitienchitra);
                k.setIdLoaicongno(null);
                try {
                    BigDecimal tygia = new BigDecimal(detail.getCot11());
                    k.setTygia(tygia);
                } catch (Exception e) {
                    k.setTygia(null);
                }
                BigDecimal sotiengoi = null;
                try {
                    sotiengoi = new BigDecimal(detail.getCot4());
                } catch (Exception e) {
                    sotiengoi = new BigDecimal(detail.getCot5());
                }
                k.setSotiengoi(sotiengoi);
                k.setThanhtien(null);
                k.setNguoigoi(detail.getCot7().trim().toUpperCase());
                k.setIdAgent(null);
                k.setGhichuGoi(detail.getCot9());
                k.setAgent(null);
                k.setIdCity(null);
                try {
                    k.setDiachigoc(detail.getCot9().trim().toUpperCase());
                } catch (Exception e) {
                    k.setDiachigoc(null);
                }
                k.setIdDistrict(null);

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }

    }

    public static List<KieuhoiList> xulydataZhongguo(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file excel gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
//                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(detail.getCot3());

                //Nếu cột 9 của file có giá trị khác TN,TQ,CK, ghép giá trị cột 9 vào cột địa chỉ rồi mặc định là giá trị cột 9 là CK
                if (detail.getCot9().trim().toUpperCase().equalsIgnoreCase("TN") || detail.getCot9().trim().toUpperCase().equalsIgnoreCase("TQ")
                        || detail.getCot9().trim().toUpperCase().equalsIgnoreCase("CK")) {
                    k.setIdDiadiemchitra(detail.getCot9().toUpperCase());
                    //Lấy địa chỉ 
                    try {
                        k.setDiachi(detail.getCot7().trim().toUpperCase() + "-" + detail.getCot5().trim().toUpperCase());
                    } catch (Exception e) {
                        k.setDiachi(detail.getCot5().trim().toUpperCase());
                    }
                } else {
                    k.setIdDiadiemchitra("CK");
                    //Lấy địa chỉ 
                    try {
                        //Nối số tài khoản vào địa chỉ
                        k.setDiachi(detail.getCot7().trim().toUpperCase() + "-" + detail.getCot9() + "-" + detail.getCot5().trim().toUpperCase());
                        k.setSotaikhoankh(detail.getCot9());
                    } catch (Exception e) {
                        k.setDiachi(detail.getCot9() + "-" + detail.getCot5().trim().toUpperCase());
                        k.setSotaikhoankh(detail.getCot9());
                    }
                }
                k.setHoten(detail.getCot4().trim().toUpperCase());

                k.setHoten1(null);
                k.setDienthoai(detail.getCot6());

                String[] mloaitien = detail.getCot2().split("-");
                String loaitienchitra = mloaitien[1];
                k.setIdLoaitienchitra(loaitienchitra);
                k.setIdLoaitiengoi(loaitienchitra);
                k.setIdLoaicongno(loaitienchitra);

                k.setTygia(null);

                BigDecimal sotiengoi = new BigDecimal(detail.getCot8());
                k.setSotiengoi(sotiengoi);

                k.setThanhtien(null);
                k.setNguoigoi(detail.getCot10().trim().toUpperCase());
                k.setIdAgent(null);
                k.setGhichuGoi(null);
                k.setAgent(null);
                k.setIdCity(null);
                try {
                    k.setDiachigoc(detail.getCot5().trim().toUpperCase());
                } catch (Exception e) {
                    k.setDiachigoc(null);
                }
                k.setIdDistrict(null);
                 try {
                    k.setIdChiNhanh(detail.getCot11().trim().toUpperCase());
                } catch (Exception e) {
                    k.setIdChiNhanh(null);
                }
                

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }

    }

    public static List<KieuhoiList> xulydataTatonghe(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file excel gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(laysochinhxac(detail.getCot2()));
                String diemchitra = null;
                //Xác định loại thanh toán, địa điểm chi trả từ cột 10 của file;
                //từ đó lấy địa chỉ: nếu là CK thì địa chỉ được nối thêm tên ngân hàng và số tài khoản
                //Nếu cột 10 không thuộc 3 giá trị cố định, mặc định hồ sơ về hội sở, chi tại quầy

                //Lấy chuỗi tiếng Việt, bỏ khoảng trắng, bỏ dấu chấm
                String xulykhoangtrang = Xulychuoi.removeBlankchar(detail.getCot10().split("@")[1]);
                String bodaucham = xulykhoangtrang.replace(".", "");
                //Bỏ dấu chuỗi tiếng Việt
                String chuoikhongdau = Xulychuoi.removeAccent(bodaucham);
                if (chuoikhongdau.toUpperCase().equalsIgnoreCase("VEDENNHA")) {
                    // Kiem tra diem chi tra .
                    diemchitra = "TN";
                    k.setIdChiNhanh(detail.getCot17().trim().toUpperCase());
                    try {
                        k.setDiachi(detail.getCot5().trim().toUpperCase());
                    } catch (Exception e) {
                        k.setDiachi(null);
                    }
                } else if (chuoikhongdau.toUpperCase().equalsIgnoreCase("MATMA")) {
                    diemchitra = "TQ";
                    k.setIdChiNhanh(detail.getCot17().trim().toUpperCase());
                    try {
                        k.setDiachi(detail.getCot5().trim().toUpperCase());
                    } catch (Exception e) {
                        k.setDiachi(null);
                    }
                } else if (chuoikhongdau.toUpperCase().equalsIgnoreCase("TAIKHOANDUOCCHIDINH")) {
                    diemchitra = "CK";
                    k.setIdChiNhanh(detail.getCot17().trim().toUpperCase());
                    try {
                        //Nối tên ngân hàng vào địa chỉ
                        k.setDiachi(detail.getCot12() + "-" + detail.getCot5().trim().toUpperCase());
                    } catch (Exception e) {
                        k.setDiachi(null);
                    }
                } else {
                    diemchitra = "TQ";
                    k.setIdChiNhanh("HS");
                    try {
                        k.setDiachi(detail.getCot5().trim().toUpperCase());
                    } catch (Exception e) {
                        k.setDiachi(null);
                    }
                }
                k.setIdDiadiemchitra(diemchitra);
                k.setHoten(detail.getCot4().trim().toUpperCase());

                k.setHoten1(null);

                k.setDienthoai(laysochinhxac(detail.getCot6()));

                //Nếu cột P (VNĐ) có giá trị, gán loại tiền chi trả và loại tiền gởi là VND
                //ngược lại lấy cột lấy cột H
                if (detail.getCot16() == null || detail.getCot16().isEmpty()) {
                    String loaitienchitra = detail.getCot8().toUpperCase();
                    k.setIdLoaitienchitra(loaitienchitra);
                    k.setIdLoaitiengoi(loaitienchitra);
                } else {
                    k.setIdLoaitienchitra("VND");
                    k.setIdLoaitiengoi("VND");
                }
                k.setIdLoaicongno(null);

                k.setTygia(null);
                BigDecimal sotiengoi = null;
                try {
                    sotiengoi = new BigDecimal(detail.getCot7());
                } catch (Exception e) {
                    sotiengoi = null;
                }
                

                //Nếu cột P (VNĐ) có giá trị, lấy giá trị này làm số tiền gởi
                //ngược lại lấy cột G làm số tiền gởi
                if (detail.getCot16() == null || detail.getCot16().isEmpty()) {
                    k.setSotiengoi(sotiengoi);
                } else {
                    BigDecimal tienVND = null;
                    tienVND = new BigDecimal(detail.getCot16());
                    k.setSotiengoi(tienVND);
                }
                k.setThanhtien(null);
                k.setNguoigoi(detail.getCot3().trim().toUpperCase());
                k.setIdAgent(null);
                k.setGhichuGoi(null);
                k.setAgent(null);
                k.setIdCity(null);
                try {
                    k.setDiachigoc(detail.getCot5().trim().toUpperCase());
                } catch (Exception e) {
                    k.setDiachigoc(null);
                }
                k.setIdDistrict(null);
                k.setSotaikhoankh(detail.getCot14());
                k.setGiaytoHoten(laysochinhxac(detail.getCot15()));

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }
    }

    //Xử lý lấy dữ liệu cho các đối tác dùng chung mẫu import
    public static List<KieuhoiList> xulyDoitacChung(List<TableImportdataApiModel> details, String sophieu) {

        // Tao bien kieu hoi list .
        List<KieuhoiList> kieuhoiLists = new ArrayList<>();
        try {

            //1. Lọc dữ liệu trong file excel gán vào class KieuhoiList
            for (int i = 0; i < details.size(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                detail = details.get(i);
                KieuhoiList k = new KieuhoiList();
                int so = i + 1;
                k.setIdChiNhanh(detail.getCot12());
                k.setSoPhieu(sophieu);
                k.setStt(so);
                k.setMaNguoinhan(String.valueOf(detail.getCot1()));

                k.setIdChiNhanh(detail.getCot15().toUpperCase());

                String diachi = null;
                String tinhthanh = null;
                try {
                    diachi = detail.getCot4().trim().toUpperCase();
                } catch (Exception e) {
                    diachi = "";
                }
                try {
                    tinhthanh = detail.getCot5().trim().toUpperCase();
                } catch (Exception e) {
                    tinhthanh = "";
                }

                //Nối tên ngân hàng vào địa chỉ
                String tennganhang = detail.getCot12().toUpperCase();
                if (tennganhang.length() > 0) {
                    k.setDiachi((tennganhang + "-" + diachi + " " + tinhthanh).trim());
                } else {
                    k.setDiachi((diachi + " " + tinhthanh).trim());
                }

                k.setIdDiadiemchitra(detail.getCot9().trim().toUpperCase());
                k.setHoten(detail.getCot3().trim().toUpperCase());

                k.setDienthoai(detail.getCot10());
                String loaitienchitra = detail.getCot8().toUpperCase();
                k.setIdLoaitienchitra(loaitienchitra);
                k.setIdLoaitiengoi(loaitienchitra);
                k.setIdLoaicongno(null);

                k.setTygia(null);
                BigDecimal sotiengoi = null;
                sotiengoi = new BigDecimal(detail.getCot6());

                k.setSotiengoi(sotiengoi);
                k.setThanhtien(null);
                k.setNguoigoi(detail.getCot2().trim().toUpperCase());
                k.setIdAgent(null);

                try {
                    k.setGhichuGoi(detail.getCot14().trim().toUpperCase());
                } catch (Exception e) {
                    k.setGhichuGoi(null);
                }

                k.setDiachigoc(null);

                k.setSotaikhoankh(detail.getCot11());
                k.setGiaytoHoten(null);

                kieuhoiLists.add(k);
            }

            return kieuhoiLists;
        } catch (Exception e) {

            return null;
        }
    }

    /*
     Hàm lấy chính xác giá trị số đưa vào
     VD: Số 123456789, nếu lấy vào sẽ là 1.23456789E8 không chính xác, giá trị đúng phải là 123456789
     */
    public static String laysochinhxac(String chuoiso) {
        String kq;
        try {
            BigDecimal bd = new BigDecimal(chuoiso);
            kq = Long.toString(bd.longValue());
        } catch (Exception e) {
            kq = chuoiso;
        }
        return kq;

    }
}
