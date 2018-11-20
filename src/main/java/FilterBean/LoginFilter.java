 
package FilterBean;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class LoginFilter implements Filter {
    
    private static final boolean debug = false;
 
    private FilterConfig filterConfig = null;
    
    public LoginFilter() {
    }    
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        if (debug) {
            log("LoginFilter:doFilter()");
        }
  
        
        Throwable problem = null;
        try {
            HttpServletRequest reqt = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;
            HttpSession ses = reqt.getSession(false);

            String reqURI = reqt.getRequestURI();
            String[] chuoi=reqURI.split("/");
            int dem=chuoi.length;
            String test=chuoi[dem-1];
             
          if (chuoi[dem-1].equalsIgnoreCase("emoney-core")  ) {
              
               resp.sendRedirect(reqt.getContextPath() + "/login.xhtml");
 
 
            }
          else if (chuoi[dem-1].equalsIgnoreCase("login.xhtml") ){
              
               chain.doFilter(request, response); 
          }
         
            
            
        } catch (Throwable t) {
 
            problem = t;
            t.printStackTrace();
        }
        
  
    }

    
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

  
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

   
    public void destroy() {        
    }

    
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {                
                log("LoginFilter:Initializing filter");
            }
        }
    }

    /**
     * Return a String representation of this object.
     */
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("LoginFilter()");
        }
        StringBuffer sb = new StringBuffer("LoginFilter(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);        
        
        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);                
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");                
                pw.print(stackTrace);                
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
    
}
