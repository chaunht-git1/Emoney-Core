 
package ApiFunction;

import LocalModel.DmXacminhToday;
import java.util.ArrayList;
import java.util.List;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
 
public class DmxcaminhtodayRest {
 
    private static final String BASE_URI = "http://emoney-web.dongamoneytransfer.com.vn/ServerRestKieuhoi/webresources/dmxacminhtoday";

  

    public List<DmXacminhToday> findAll()  {
        List<DmXacminhToday> list = Client.create().resource(BASE_URI).get(new GenericType<List<DmXacminhToday>>(){});
        return  list;
    }
 
}
