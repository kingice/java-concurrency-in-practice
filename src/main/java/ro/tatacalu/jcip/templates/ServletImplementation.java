/**
 * 
 */
package ro.tatacalu.jcip.templates;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author tatacalu
 *
 */
public class ServletImplementation implements Servlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
    }

    // ---------- START Dummy Methods ------------------------------------------
    
    // ----------  END  Dummy Methods ------------------------------------------
    
    // -------------------------------------------------------------------------
    
    @Override
    public void init(ServletConfig config) throws ServletException {}

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {}

}
