package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>contact</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"contact\">                   \n");
      out.write("                    <div class=\"col-md-6 contact-top\">\n");
      out.write("                        <h3>Th??ng tin li??n h???</h3>\n");
      out.write("                        <div class=\"left-content\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <p><strong>Tr??? s??? ch??nh v?? Nh?? m??y xe m??y th??? nh???t, th??? hai:</strong><br> Ph?????ng Ph??c Th???ng, th??? x?? Ph??c Y??n, t???nh V??nh Ph??c, Vi???t Nam<br> Tel: (84) 211 3868888<br> Fax: (84) 211 3868910</p>\n");
      out.write("                                <p>&nbsp;</p>\n");
      out.write("                                <p><strong>Nh?? m??y th??? 3:</strong></p>\n");
      out.write("                                <p>Khu c??ng ?????ng V??n II, Duy Ti??n, H?? Nam<br> Tel: (84) 3 51396 6666<br> Fax: (84) 3 513572 666</p>\n");
      out.write("                                <p>&nbsp;</p>\n");
      out.write("                                <p><strong>V??n ph??ng ?????i di???n H?? N???i:</strong><br> T???ng 7, Vi???t Tower, 1 Th??i H??, ?????ng ??a, H?? N???i<br> Tel: (84) 4 6256 7567<br> Fax: (84) 4 3836 0001</p>\n");
      out.write("                                <p>&nbsp;</p>\n");
      out.write("                                <p><strong>V??n ph??ng ?????i di???n H??? Ch?? Minh:</strong><br> T???ng 8, Zen Plaza, 54-56 Nguy???n Tr??i, Qu???n 1, H??? Ch?? Minh<br> Tel: (84) 8 3925 6949<br> Fax: (84) 8 3925 6948</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 contact-top\">\n");
      out.write("                        <h3>H??y ??i???n v??o m???u b??n d?????i ????? ???????c ch??ng t??i gi???i ????p th???c m???c c???a b???n s???m nh???t!</h3>\n");
      out.write("                        <div>\n");
      out.write("                            <span>H??? T??n </span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>Email </span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>S??? ??i???n Tho???i</span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>N???i Dung</span>\t\t\n");
      out.write("                            <textarea> </textarea>\t\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"G???i\" >\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
