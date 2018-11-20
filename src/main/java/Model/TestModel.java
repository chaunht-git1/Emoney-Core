 
package Model;

import DatabaseDao.VwSoduNhanvienListTempDao;
import Model.VWSoduNhanvienListTemp;
import java.util.ArrayList;
import java.util.List;
 
public class TestModel {
    
    
    
    public static void main(String[] args) {
        
        List<VWSoduNhanvienListTemp> nhanvienListTemp=new ArrayList<>();
        VwSoduNhanvienListTempDao dao=new VwSoduNhanvienListTempDao();
        nhanvienListTemp=dao.getAllData("CHAUNHT");
        String kq =null;
        
    }
    
}
