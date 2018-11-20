package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwTableImportdataApiMasterModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VwTableImportdataApiMasterDao {
    
    private String sql = " SELECT * FROM KH.VW_TABLE_IMPORTDATA_API_MASTER ";
    private List<VwTableImportdataApiMasterModel> vwTableImportdataApiMasterModels = new ArrayList<>();
    
    public List<VwTableImportdataApiMasterModel> showAll() throws SQLException {
        Connection con = ConnectionProvider.getCon();
        
        PreparedStatement pstm = con.prepareStatement(sql);
        
        ResultSet rs = pstm.executeQuery();
        
        while (rs.next()) {
            VwTableImportdataApiMasterModel d = new VwTableImportdataApiMasterModel();
            d.setIdcode(rs.getString("ID_CODE"));
            d.setIddoitac(rs.getString("ID_DOITAC"));
            d.setTendoitac(rs.getString("TEN_DOITAC"));
            d.setShs(rs.getString("SHS"));
            d.setUsd(rs.getString("USD"));
            d.setCad(rs.getString("CAD"));
            d.setGbp(rs.getString("GBP"));
            d.setVnd(rs.getString("VND"));
            d.setEur(rs.getString("EUR"));
            d.setAud(rs.getString("AUD"));
            d.setUserid(rs.getString("USERID"));
            d.setPass(rs.getString("PASS"));
            d.setKeyapi(rs.getString("KEYAPI"));
            d.setDatavalue(rs.getString("DATEVALUE"));
            d.setStatus(rs.getString("STATUS"));
            d.setSignalture(rs.getString("SIGNALTURE"));
            d.setNgaytao(rs.getDate("NGAYTAO"));
            d.setMaqlds(rs.getString("MA_QLDS"));
            d.setMaloaifile(rs.getString("MALOAIFILE"));
            d.setLoaifile(rs.getString("LOAIFILE"));
            d.setCatchuoi(rs.getString("CATCHUOI"));
            
            this.vwTableImportdataApiMasterModels.add(d);
        }
        
        pstm.close();
        return vwTableImportdataApiMasterModels;
    }
    
    public String updateDataMaster(String sophieu) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.UPDATE_RECORD_MASTER(?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);
            
            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, sophieu);
            
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();
            
            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }
    
    public List<VwTableImportdataApiMasterModel> findOneParam(String thuoctinh, String giatri) {
        Connection con = ConnectionProvider.getCon();
        try {
            sql += " WHERE " + thuoctinh + " = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, giatri);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                VwTableImportdataApiMasterModel d = new VwTableImportdataApiMasterModel();
                d.setIdcode(rs.getString("ID_CODE"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setTendoitac(rs.getString("TEN_DOITAC"));
                d.setShs(rs.getString("SHS"));
                d.setUsd(rs.getString("USD"));
                d.setCad(rs.getString("CAD"));
                d.setGbp(rs.getString("GBP"));
                d.setVnd(rs.getString("VND"));
                d.setEur(rs.getString("EUR"));
                d.setAud(rs.getString("AUD"));
                d.setUserid(rs.getString("USERID"));
                d.setPass(rs.getString("PASS"));
                d.setKeyapi(rs.getString("KEYAPI"));
                d.setDatavalue(rs.getString("DATEVALUE"));
                d.setStatus(rs.getString("STATUS"));
                d.setSignalture(rs.getString("SIGNALTURE"));
                d.setNgaytao(rs.getDate("NGAYTAO"));
                d.setMaqlds(rs.getString("MA_QLDS"));
                d.setMaloaifile(rs.getString("MALOAIFILE"));
                d.setLoaifile(rs.getString("LOAIFILE"));
                d.setCatchuoi(rs.getString("CATCHUOI"));
                
                this.vwTableImportdataApiMasterModels.add(d);
            }
            pstm.close();
        } catch (Exception e) {
        }
        return vwTableImportdataApiMasterModels;
    }
    
    public String gantrangthaicatchuoiapimaster(String keyapi, String iddoitac, String idcode, String trangthai) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "{?=call KH.PKS_API_SERVICE.FUNC_GAN_TRANGTHAICATCHUOI(?,?,?,?)}";
        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            cs.setString(2, keyapi);
            cs.setString(3, iddoitac);
            cs.setString(4, idcode);
            cs.setString(5, trangthai);

            cs.executeUpdate();
            kq = cs.getString(1);
            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }
    
    //Hàm thêm dữ liệu vào bảng Master
    public String insertDataMasterFromApi(String userid, String api, String dataimport, String sophieu){

        //Khởi tạo kết nối
        Connection con = ConnectionProvider.getCon();
        //Tạo chuỗi truy vấn
        String sql = "{?=call KH.PKS_API_SERVICE.FUNC_INSERT_DATA_MASTER_F11(?,?,?,?)}";
        //Khởi tạo giá trị trả về
        String kq = null;
        try {
            //Tạo Statement ứng với chuỗi truy vấn
            CallableStatement cstm = con.prepareCall(sql);
            //Giới hạn thời gian thực hiện truy vấn (giây)
            cstm.setQueryTimeout(1800);
            //ràng buộc KDL tương ứng với từng tham số truyền vào nếu không phải kiểu chuỗi
            //dấu ? trả về của funtion phải khai báo KDL
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            //gán giá trị cụ thể cho từng dấu ?
            cstm.setString(2, userid);
            cstm.setString(3, api);
            cstm.setString(4, dataimport);
            cstm.setString(5, sophieu);
            //thực tri truy vấn
            cstm.executeUpdate();
            //lấy giá trị trả về của câu truy vấn
            kq = cstm.getString(1);
            //đóng Statement
            cstm.close();
        } catch (Exception e) {
            kq = e.getMessage();
        }

        return kq;
    }


}
