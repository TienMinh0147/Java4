package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>TIEN MINH - ASM</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <link href=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Java 4</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <!-- menu profile quick info -->\n");
      out.write("            <div class=\"profile clearfix\">\n");
      out.write("              <div class=\"profile_pic\">\n");
      out.write("                  <img src=\"images/minh.jpg\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"profile_info\">\n");
      out.write("                <span>Welcome,</span>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <!-- sidebar menu -->\n");
      out.write("            <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("              <div class=\"menu_section\">\n");
      out.write("                <h3>General</h3>\n");
      out.write("                <ul class=\"nav side-menu\">\n");
      out.write("                  <li><a><i class=\"fa fa-home\"></i> Home <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"index.jsp\">Dashboard</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý tài khoản-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý tài khoản <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemTaiKhoan.jsp\">Thêm tài khoản</a></li>\n");
      out.write("                      <li><a href=\"DanhSachTaiKhoan.jsp\">Danh sách tài khoản</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý thể loại-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý thể loại <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemTheLoai.jsp\">Thêm thể loại</a></li>\n");
      out.write("                      <li><a href=\"DanhSachTheLoai.jsp\">Danh sách thể loại</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý sản phẩm-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý sản phẩm <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemSanPham.jsp\">Thêm sản phẩm</a></li>\n");
      out.write("                      <li><a href=\"DanhSachSanPham.jsp\">Danh sách sản phẩm</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý khách hàng-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý khách hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemKhachHang.jsp\">Thêm khách hàng</a></li>\n");
      out.write("                      <li><a href=\"DanhSachKhachHang.jsp\">Danh sách khách hàng</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý giỏ hàng-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý giỏ hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemGioHang.jsp\">Thêm giỏ hàng</a></li>\n");
      out.write("                      <li><a href=\"DanhSachGioHang.jsp\">Danh sách giỏ hàng</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <!--Quản lý chi tiết giỏ hàng-->\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Quản lý chi tiết giỏ hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"ThemGioHangChiTiet.jsp\">Thêm chi tiết giỏ hàng</a></li>\n");
      out.write("                      <li><a href=\"DanhSachGioHangChiTiet.jsp\">Danh sách chi tiết giỏ hàng</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("            <div class=\"sidebar-footer hidden-small\">\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\n");
      out.write("                <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\n");
      out.write("                <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\" href=\"Login.jsp\">\n");
      out.write("                <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("        <div class=\"top_nav\">\n");
      out.write("          <div class=\"nav_menu\">\n");
      out.write("            <nav>\n");
      out.write("              <div class=\"nav toggle\">\n");
      out.write("                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"images/\" alt=\"\">\n");
      out.write("                    <span class=\" fa fa-angle-down\"></span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\n");
      out.write("                    <li><a href=\"javascript:;\"> Profile</a></li>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                        <span class=\"badge bg-red pull-right\">50%</span>\n");
      out.write("                        <span>Settings</span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"javascript:;\">Help</a></li>\n");
      out.write("                    <li><a href=\"Login.jsp\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                    <span class=\"badge bg-green\">6</span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span></span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span></span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>/span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span></span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                       \n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /top navigation -->\n");
      out.write("\n");
      out.write("        <!-- page content -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("        <!-- /page content -->\n");
      out.write("\n");
      out.write("        <!-- footer content -->\n");
      out.write("        \n");
      out.write("        <!-- /footer content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("    <!-- Chart.js -->\n");
      out.write("    <script src=\"vendors/Chart.js/dist/Chart.min.js\"></script>\n");
      out.write("    <!-- gauge.js -->\n");
      out.write("    <script src=\"vendors/gauge.js/dist/gauge.min.js\"></script>\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <script src=\"vendors/bootstrap-progressbar/bootstrap-progressbar.min.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("    <!-- Skycons -->\n");
      out.write("    <script src=\"vendors/skycons/skycons.js\"></script>\n");
      out.write("    <!-- Flot -->\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <!-- Flot plugins -->\n");
      out.write("    <script src=\"vendors/flot.orderbars/js/jquery.flot.orderBars.js\"></script>\n");
      out.write("    <script src=\"vendors/flot-spline/js/jquery.flot.spline.min.js\"></script>\n");
      out.write("    <script src=\"vendors/flot.curvedlines/curvedLines.js\"></script>\n");
      out.write("    <!-- DateJS -->\n");
      out.write("    <script src=\"vendors/DateJS/build/date.js\"></script>\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <script src=\"vendors/jqvmap/dist/jquery.vmap.js\"></script>\n");
      out.write("    <script src=\"vendors/jqvmap/dist/maps/jquery.vmap.world.js\"></script>\n");
      out.write("    <script src=\"vendors/jqvmap/examples/js/jquery.vmap.sampledata.js\"></script>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <script src=\"vendors/moment/min/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendors/bootstrap-daterangepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("\t\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
