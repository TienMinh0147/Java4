package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"container\">\n");
      out.write("                <div class=\"account\">\n");
      out.write("                    <div class=\"col-md-6 login-right\">\n");
      out.write("                    <h2 class=\"account-in\" style=\"color: blue\">????NG NH???P</h2>\n");
      out.write("                    <form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                        ");
if(request.getParameter("error")!=null){
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"color:red\">");
      out.print(request.getParameter("error"));
      out.write("</p>\n");
      out.write("                        </div> \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <div style=\"text-align: left\">\n");
      out.write("                            <span>Username*</span>\n");
      out.write("                            <input type=\"text\" name=\"email\">\n");
      out.write("                        </div> \t\n");
      out.write("                         <div style=\"text-align: left\"> \n");
      out.write("                            <span class=\"word\">Password*</span>\n");
      out.write("                            <input type=\"password\" name=\"pass\">\n");
      out.write("                        </div style=\"text-align: center\">\t\n");
      out.write("                        <div >\n");
      out.write("                        <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("                        <input type=\"submit\" value=\"????ng Nh???p\"> \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>    \n");
      out.write("                        <div  class=\"col-md-6 login-left\" >\n");
      out.write("                        <h2 class=\"account-in\" style=\"color: blue\">????NG K?? T??I KHO???N M???I</h2>\n");
      out.write("                        <h4>KH??CH H??NG M???I!</h4>                   \n");
      out.write("                        <p>B???ng c??ch t???o m???t t??i kho???n v???i c???a h??ng c???a ch??ng t??i, b???n s??? c?? th??? thanh to??n nhanh h??n, l??u tr??? nhi???u ?????a ch??? giao h??ng, xem v?? theo d??i ????n ?????t h??ng c???a b???n trong t??i kho???n c???a b???n v?? h??n th??? n???a.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <a class=\"btn btn-default\" href=\"register.jsp\" style=\"background-color: #0076F9; color: white\"><b>????NG K?? M???I</b></a>\n");
      out.write("                        </div>\n");
      out.write("                </div>                        \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
