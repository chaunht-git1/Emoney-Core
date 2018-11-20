package ModelDao;

import ConnectBean.ConnectionProvider;
import SystemFunc.FunctionGlobal;
import LocalModel.KieuhoiList;
import LocalModel.VwBarcodeKieuhoiListDetail;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class BarcodeListDao {

    public void insertbarcode(String iddoitac, String sophieu, String username, List<KieuhoiList> model) {
        //Tạo barcode
        Connection con = ConnectionProvider.getCon();
        String sql = "INSERT INTO KH.BARCODE_LIST (ID_CODE, SOBN, ID_DOITAC, BARCODE, MAKER_ID, "
                + "NGAY_KHOITAO, DUYET, ID_NV_DUYET, NGAY_DUYET, ID_VALIDITY, SOPHIEU, STT, MA_NGUOINHAN, HOTEN) "
                + "VALUES (?,?,?,?,?,SYSDATE,'Y',?,SYSDATE,'O',?,?,?,?)";
//        String sql = "INSERT INTO KH.BARCODE_LIST (ID_CODE, SOBN, ID_DOITAC, BARCODE, MAKER_ID, ID_NV_DUYET, SOPHIEU, STT) VALUES (?,?,?,?,?,?,?,?)";
        try {
            FunctionGlobal functionGlobal = new FunctionGlobal();
            PreparedStatement ps = con.prepareStatement(sql);
            for (int i = 0; i < model.size(); i++) {
                InputStream inputStream = functionGlobal.laybarcodetuchuoi(sophieu + model.get(i).getStt().intValue());
                String idcode = sophieu + model.get(i).getStt().intValue();               
                ps.setString(1, idcode);
                ps.setString(2, null);
                ps.setString(3, iddoitac);
                ps.setBinaryStream(4, inputStream, 10000);
                ps.setString(5, username);
                ps.setString(6, username);
                ps.setString(7, sophieu);
                ps.setInt(8, model.get(i).getStt().intValue());
                ps.setString(9, model.get(i).getMaNguoinhan());
                ps.setString(10, model.get(i).getHoten());
                ps.executeUpdate(); 
                
            }
            ps.close();
           
            

        } catch (Exception e) {
            
          
            
        }
    }
    
    public void insertlaibarcode(String iddoitac, String sophieu, String username, List<VwBarcodeKieuhoiListDetail> model) {
        //Tạo barcode
        Connection con = ConnectionProvider.getCon();
        String sql = "INSERT INTO KH.BARCODE_LIST (ID_CODE, SOBN, ID_DOITAC, BARCODE, MAKER_ID, "
                + "NGAY_KHOITAO, DUYET, ID_NV_DUYET, NGAY_DUYET, ID_VALIDITY, SOPHIEU, STT, MA_NGUOINHAN, HOTEN) "
                + "VALUES (?,?,?,?,?,SYSDATE,'Y',?,SYSDATE,'O',?,?,?,?)";
//        String sql = "INSERT INTO KH.BARCODE_LIST (ID_CODE, SOBN, ID_DOITAC, BARCODE, MAKER_ID, ID_NV_DUYET, SOPHIEU, STT) VALUES (?,?,?,?,?,?,?,?)";
        try {
            FunctionGlobal functionGlobal = new FunctionGlobal();
            PreparedStatement ps = con.prepareStatement(sql);
            for (int i = 0; i < model.size(); i++) {
                InputStream inputStream = functionGlobal.laybarcodetuchuoi(sophieu + model.get(i).getStt().intValue());
                String idcode = sophieu + model.get(i).getStt().intValue();               
                ps.setString(1, idcode);
                ps.setString(2, null);
                ps.setString(3, iddoitac);
                ps.setBinaryStream(4, inputStream, 10000);
                ps.setString(5, username);
                ps.setString(6, username);
                ps.setString(7, sophieu);
                ps.setInt(8, model.get(i).getStt().intValue());
                ps.setString(9, model.get(i).getManguoinhan());
                ps.setString(10, model.get(i).getHoten()); 
                
                ps.executeUpdate();
            }
            ps.close();

        } catch (Exception e) {
        }

    }
}
