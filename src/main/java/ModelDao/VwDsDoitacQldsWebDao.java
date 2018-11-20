package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwDsDoitacQldsWeb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VwDsDoitacQldsWebDao {

    String sql = " SELECT * FROM KH.VW_DS_DOITAC_QLDS_WEB ";
    private List<VwDsDoitacQldsWeb> vwdskhtructuyenktList = new ArrayList<>();

    public List<VwDsDoitacQldsWeb> findAll() throws SQLException {

        Connection con = ConnectionProvider.getCon();
        sql+=" WHERE NGAYTAO = TRUNC(SYSDATE)";
        // Tạo một câu SQL có 1 tham số (?)
        //   sql = sql;
        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        //pstm.setString(1, Id);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            VwDsDoitacQldsWeb dataClass = new VwDsDoitacQldsWeb();
            dataClass.setIddoitac(rs.getString("ID_DOITAC"));
            dataClass.setTendoitac(rs.getString("TEN_DOITAC"));
            this.vwdskhtructuyenktList.add(dataClass);
        }
        pstm.close();

        return vwdskhtructuyenktList;
    }

}
