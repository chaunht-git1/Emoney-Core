package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.Vwsolieussqlds;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VwsolieussqldsDao {

    String sql = "select * from KH.VW_SOLIEU_SS_QLDS ";
    private List<Vwsolieussqlds> vwsolieussqldses = new ArrayList<>();

    public List<Vwsolieussqlds> findAll() throws SQLException {

        Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        //   sql = sql;
        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        //pstm.setString(1, Id);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Vwsolieussqlds dataClass = new Vwsolieussqlds();
//            dataClass.setMaqlds(rs.getString("LOAITIEN"));
//            dataClass.setLoaitien(rs.getString("TEN_GIAYTO"));
//            dataClass.setId_doitac(rs.getString("ID_DOITAC"));
//            dataClass.setTen_doitac(rs.getString("TEN_DOITAC"));
//            dataClass.setId_doitac_kh(rs.getString("ID_DOITAC_KH"));
//            dataClass.setId_tendoitac_kh(rs.getString("TENDOITAC_KH"));
//            dataClass.setSotien_qlds(rs.getBigDecimal("SOTIEN_QLDS"));
//            dataClass.setSotien_kh(rs.getBigDecimal("SOTIEN_KH"));
//            dataClass.setHieu(rs.getBigDecimal("HIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("KTDT"));
//            dataClass.setId_tendoitac_kh(rs.getString("KTST"));
//            dataClass.setId_tendoitac_kh(rs.getString("SOPHIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("KHOPSOLIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("USERID"));
            dataClass.setMaqlds(rs.getString("MA_QLDS"));
            dataClass.setLoaitien(rs.getString("LOAITIEN"));
            dataClass.setId_doitac(rs.getString("ID_DOITAC"));
            dataClass.setTen_doitac(rs.getString("TEN_DOITAC"));
            dataClass.setId_doitac_kh(rs.getString("ID_DOITAC_KH"));
            dataClass.setKtdt(rs.getString("KTDT"));
            dataClass.setTendoitac_kh(rs.getString("TENDOITAC_KH"));
            dataClass.setSotien_qlds(rs.getBigDecimal("SOTIEN_QLDS"));
            dataClass.setSotien_kh(rs.getBigDecimal("SOTIEN_KH"));
            dataClass.setHieu(rs.getBigDecimal("HIEU"));
            dataClass.setKtst(rs.getString("KTST"));
            dataClass.setSophieu(rs.getString("SOPHIEU"));
            dataClass.setUserid(rs.getString("USERID"));
            dataClass.setKhopsolieu(rs.getString("KHOPSOLIEU"));
            this.vwsolieussqldses.add(dataClass);
        }

        pstm.close();

        return vwsolieussqldses;
    }

    public List<Vwsolieussqlds> findOneParaString(String prmname1, String prmvalue1) throws SQLException {

        Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        sql = sql + "Where " + prmname1 + "=?";

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Vwsolieussqlds dataClass = new Vwsolieussqlds();
//            dataClass.setMaqlds(rs.getString("LOAITIEN"));
//            dataClass.setLoaitien(rs.getString("TEN_GIAYTO"));
//            dataClass.setId_doitac(rs.getString("ID_DOITAC"));
//            dataClass.setTen_doitac(rs.getString("TEN_DOITAC"));
//            dataClass.setId_doitac_kh(rs.getString("ID_DOITAC_KH"));
//            dataClass.setId_tendoitac_kh(rs.getString("TENDOITAC_KH"));
//            dataClass.setSotien_qlds(rs.getBigDecimal("SOTIEN_QLDS"));
//            dataClass.setSotien_kh(rs.getBigDecimal("SOTIEN_KH"));
//            dataClass.setHieu(rs.getBigDecimal("HIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("KTDT"));
//            dataClass.setId_tendoitac_kh(rs.getString("KTST"));
//            dataClass.setId_tendoitac_kh(rs.getString("SOPHIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("KHOPSOLIEU"));
//            dataClass.setId_tendoitac_kh(rs.getString("USERID"));
            dataClass.setMaqlds(rs.getString("MA_QLDS"));
            dataClass.setLoaitien(rs.getString("LOAITIEN"));
            dataClass.setId_doitac(rs.getString("ID_DOITAC"));
            dataClass.setTen_doitac(rs.getString("TEN_DOITAC"));
            dataClass.setId_doitac_kh(rs.getString("ID_DOITAC_KH"));
            dataClass.setKtdt(rs.getString("KTDT"));
            dataClass.setTendoitac_kh(rs.getString("TENDOITAC_KH"));
            dataClass.setSotien_qlds(rs.getBigDecimal("SOTIEN_QLDS"));
            dataClass.setSotien_kh(rs.getBigDecimal("SOTIEN_KH"));
            dataClass.setHieu(rs.getBigDecimal("HIEU"));
            dataClass.setKtst(rs.getString("KTST"));
            dataClass.setSophieu(rs.getString("SOPHIEU"));
            dataClass.setUserid(rs.getString("USERID"));
            dataClass.setKhopsolieu(rs.getString("KHOPSOLIEU"));
            this.vwsolieussqldses.add(dataClass);
        }

        pstm.close();

        return vwsolieussqldses;
    }

    public List<Vwsolieussqlds> findTwoParaString(String prmname1, String prmvalue1, String prmname2, String prmvalue2) throws SQLException {

        Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        sql = sql + "Where " + prmname1 + " = ? and " + prmname2 + "=?";

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);
        // Sét đặt giá trị tham số thứ hai (Dấu ? thứ hai)  
        pstm.setString(2, prmvalue2);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Vwsolieussqlds dataClass = new Vwsolieussqlds();
            dataClass.setMaqlds(rs.getString("MA_QLDS"));
            dataClass.setLoaitien(rs.getString("LOAITIEN"));
            dataClass.setId_doitac(rs.getString("ID_DOITAC"));
            dataClass.setTen_doitac(rs.getString("TEN_DOITAC"));
            dataClass.setId_doitac_kh(rs.getString("ID_DOITAC_KH"));
            dataClass.setKtdt(rs.getString("KTDT"));
            dataClass.setTendoitac_kh(rs.getString("TENDOITAC_KH"));
            dataClass.setSotien_qlds(rs.getBigDecimal("SOTIEN_QLDS"));
            dataClass.setSotien_kh(rs.getBigDecimal("SOTIEN_KH"));
            dataClass.setHieu(rs.getBigDecimal("HIEU"));
            dataClass.setKtst(rs.getString("KTST"));
            dataClass.setSophieu(rs.getString("SOPHIEU"));
            dataClass.setUserid(rs.getString("USERID"));
            dataClass.setKhopsolieu(rs.getString("KHOPSOLIEU"));
            this.vwsolieussqldses.add(dataClass);
        }

        pstm.close();

        return vwsolieussqldses;
    }
}
