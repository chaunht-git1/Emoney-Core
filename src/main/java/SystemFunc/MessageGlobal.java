package SystemFunc;

 
import ConnectBean.AlertCustom;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class MessageGlobal {

 
    public static void showmessageInfo(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Thông báo", message));
    }
    public static void showmessageWarn(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Cảnh báo!", message));
    }
    public static void showmessageError(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lổi!", message));
    }
    public static void showmessagefatal(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Cảnh báo!", message));
    }
    
     public static void messkhongtimthaykq(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fatal!",AlertCustom.khongketqua ));
    }
    public static void messtimthaykq(Number  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fatal!",AlertCustom.timthaykqbf+message+ AlertCustom.timthaykqat));
    }
    
     public static void messluuthanhcong(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info!",AlertCustom.luuthanhcong));
    }
     
    public static void messluukhongthanhcong(String  message){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Warning!",AlertCustom.luuthanhcong));
    } 
}
