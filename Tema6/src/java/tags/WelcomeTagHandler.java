
package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

public class WelcomeTagHandler extends SimpleTagSupport{
   @Override
   public void doTag()throws JspException, IOException{
     JspWriter out = getJspContext().getOut();
     PageContext pageContext = (PageContext)getJspContext();
     HttpSession session = pageContext.getSession();
     Integer contadorVisitas=(Integer)session.getAttribute("ContadorVisitas");
     
     if(contadorVisitas==null){
         contadorVisitas=1;
     }else{
         contadorVisitas++;
     }
     
     session.setAttribute("ContadorVistas", contadorVisitas);
     out.println("Bienvenido a nuestro sitio web, numero de visitas: "+contadorVisitas); 
   }
}
