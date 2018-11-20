package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.Dschitietgiaodich;
import Model.VwKieuhoiListDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VwKieuhoiListDetailDao {

    private String sql = " SELECT * FROM KH.VW_DATA_HOIBAO_DETAIL ";
    private List<Dschitietgiaodich> vwKieuhoiListDetails = new ArrayList<>();
    private static int i;

    public List<Dschitietgiaodich> laydanhsachchitiet(String khoa)  {

        Connection con = ConnectionProvider.getCon();
 
        String chuoingay = null;
  
        sql += " WHERE MADOT = '" + khoa + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                Dschitietgiaodich d = new Dschitietgiaodich();
                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setStt(rs.getInt("STT"));
                d.setMadot(rs.getString("MADOT"));
                d.setKhoaimage(rs.getString("KHOA"));
 
                vwKieuhoiListDetails.add(d);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return vwKieuhoiListDetails ;
    }

    public VwKieuhoiListDetail findmanguoinhan(String manguoinhan, String iddoitac) {

        Connection con = ConnectionProvider.getCon();

        sql += " WHERE MA_NGUOINHAN =  '" + manguoinhan + "' AND ID_DOITAC = '" + iddoitac + "'";
        VwKieuhoiListDetail d = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                d = new VwKieuhoiListDetail();
                d.setMaqlds(rs.getString("MA_QLDS"));
                d.setSobn(rs.getInt("SOBN"));
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setStt(rs.getInt("STT"));
                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setChinhanhname(rs.getString("CHINHANH_NAME"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setHoten(rs.getString("HOTEN"));
                d.setSocttuythan(rs.getString("SO_CT_TUYTHAN"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdloaitiengoi(rs.getString("ID_LOAITIENGOI"));
                d.setNguoigoi(rs.getString("NGUOIGOI"));
                d.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                d.setDiachi(rs.getString("DIACHI"));
                d.setDienthoai(rs.getString("DIENTHOAI"));
                d.setIddiadiemchitra(rs.getString("ID_DIADIEMCHITRA"));
                d.setDachitra(rs.getString("DACHITRA"));
                d.setNgayhoibao(rs.getDate("NGAY_HOIBAO"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));
                d.setCheckimage(rs.getString("CHECKIMAGE"));
                d.setHinhbn(rs.getBlob("HINH_BN"));
                d.setGhichu(rs.getString("GHICHU"));
                d.setGhichugoi(rs.getString("GHICHU_GOI"));

                if (rs.getString("DACHITRA").equalsIgnoreCase("Y")
                        || rs.getString("DACHITRA").equalsIgnoreCase("T")) {
                    d.setDachitradetail("ĐÃ CHI TRẢ");
                } else {
                    d.setDachitradetail("CHƯA CHI TRẢ");
                }

                if (rs.getString("ID_DIADIEMCHITRA").equalsIgnoreCase("TN")) {
                    d.setDiadiemchitradetail("TẠI NHÀ");
                } else {
                    d.setDiadiemchitradetail("TẠI QUẦY");
                }

                if (d.getCheckimage().equalsIgnoreCase("Y")) {
                    d.setDuongdanimage("haveimage.png");
                    d.setDisimage(false);
                } else {
                    d.setDuongdanimage("noimage.png");
                    d.setDisimage(true);
                }
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            d = null;
        }

        return d;
    }
}
