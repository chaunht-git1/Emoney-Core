 
package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.Vwdsqldswebchuakhop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
 
public class VwDsQldsWebchuakhopDao {
    
    
    String sql="select * from VW_DS_QLDS_WEBCHUAKHOP ";
    private List<Vwdsqldswebchuakhop> vwdsqldswebchuakhops=new ArrayList<>();
    
    
public List<Vwdsqldswebchuakhop> findAll( ) throws SQLException{
       
        Connection con=ConnectionProvider.getCon();
        

            // Tạo một câu SQL có 1 tham số (?)
         //   sql = sql;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            //pstm.setString(1, Id);

            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) { 
              Vwdsqldswebchuakhop dataClass = new Vwdsqldswebchuakhop();
              dataClass.setMaqlds(rs.getString("MA_QLDS"));
              dataClass.setTendoitac(rs.getString("TENDOITAC"));
          
              this.vwdsqldswebchuakhops.add(dataClass);
            }

            pstm.close();
    
    return vwdsqldswebchuakhops;
}

 

    
    
    
}
 
 


