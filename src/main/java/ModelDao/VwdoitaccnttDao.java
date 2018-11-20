 
package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwDoitacCntt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
 
public class VwdoitaccnttDao {
    
    
    String sql="select * from  KH.VW_DOITAC_CNTT ";
    private List<VwDoitacCntt> vwdskhtructuyenktList=new ArrayList<>();
    
    
public List<VwDoitacCntt> findAll( ) throws SQLException{
    
        Connection con=ConnectionProvider.getCon();
        

            // Tạo một câu SQL có 1 tham số (?)
         //   sql = sql;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            //pstm.setString(1, Id);

            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) { 
              VwDoitacCntt dataClass = new VwDoitacCntt();
              dataClass.setIdDoitac(rs.getString("ID_DOITAC"));
              dataClass.setDoitacname(rs.getString("DOITACNAME"));
 
              this.vwdskhtructuyenktList.add(dataClass);
            }

            pstm.close();
    
    return vwdskhtructuyenktList;
}

public List<VwDoitacCntt> findOneParaString(   String prmname1,String prmvalue1) throws SQLException{
       
        Connection con=ConnectionProvider.getCon();

            // Tạo một câu SQL có 1 tham số (?)
            sql =  sql+"Where "+prmname1+"=?" ;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, prmvalue1);

            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                
              VwDoitacCntt dataClass = new VwDoitacCntt();
              dataClass.setIdDoitac(rs.getString("ID_DOITAC"));
              dataClass.setDoitacname(rs.getString("DOITACNAME"));
 
             
              vwdskhtructuyenktList.add(dataClass);
              
            }

            pstm.close();
    
    return vwdskhtructuyenktList;
}
    
 


    
    
    
}
 
 


