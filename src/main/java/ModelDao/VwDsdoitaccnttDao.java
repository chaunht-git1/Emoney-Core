 
package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwDsdoitaccntt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
 
public class VwDsdoitaccnttDao {
    
    
    String sql="SELECT * FROM KH.VW_DSDOITACCNTT ";
    private List<VwDsdoitaccntt> vwdskhtructuyenktList=new ArrayList<>();
    
    
public List<VwDsdoitaccntt> findAll( ) throws SQLException{
    
        Connection con=ConnectionProvider.getCon();
        

            // Tạo một câu SQL có 1 tham số (?)
          //  sql = sql;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            //pstm.setString(1, Id);

            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) { 
              VwDsdoitaccntt dataClass = new VwDsdoitaccntt();
              dataClass.setIdcode(rs.getString("IDCODE"));
              dataClass.setIdDoitac(rs.getString("ID_DOITAC"));
              dataClass.setDoitacname(rs.getString("DOITACNAME"));
              dataClass.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
              dataClass.setIdLoaicongno(rs.getString("ID_LOAICONGNO"));
              dataClass.setIdLoaitiengoi(rs.getString("ID_LOAITIENGOI"));
         
        
              this.vwdskhtructuyenktList.add(dataClass);
            }

            pstm.close();
    
    return vwdskhtructuyenktList;
}

public List<VwDsdoitaccntt> findOneParaString(   String prmname1,String prmvalue1) throws SQLException{
       
        Connection con=ConnectionProvider.getCon();

            // Tạo một câu SQL có 1 tham số (?)
            sql =  sql+"Where "+prmname1+"=?" ;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, prmvalue1);

            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                
              VwDsdoitaccntt dataClass = new VwDsdoitaccntt();
              dataClass.setIdcode(rs.getString("IDCODE"));
              dataClass.setIdDoitac(rs.getString("ID_DOITAC"));
              dataClass.setDoitacname(rs.getString("DOITACNAME"));
              dataClass.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
              dataClass.setIdLoaicongno(rs.getString("ID_LOAICONGNO"));
              dataClass.setIdLoaitiengoi(rs.getString("ID_LOAITIENGOI"));
             
              vwdskhtructuyenktList.add(dataClass);
              
            }

            pstm.close();
    
    return vwdskhtructuyenktList;
}
    
 


    
    
    
}
 
 


