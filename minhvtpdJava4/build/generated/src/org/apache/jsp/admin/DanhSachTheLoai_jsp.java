package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.TaiKhoanDAO;
import DAO.TheLoaiDAO;

public final class DanhSachTheLoai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title> ASM</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- NProgress -->\n");
      out.write("        <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Datatables -->\n");
      out.write("        <link href=\"vendors/datatables.net-bs/css/dataTables.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Theme Style -->\n");
      out.write("        <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"nav-md\">\n");
      out.write("        <div class=\"container body\">\n");
      out.write("            <div class=\"main_container\">\n");
      out.write("                <div class=\"col-md-3 left_col\">\n");
      out.write("                    <div class=\"left_col scroll-view\">\n");
      out.write("                        <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Java 4!</span></a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                        <!-- menu profile quick info -->\n");
      out.write("                        <div class=\"profile clearfix\">\n");
      out.write("                            <div class=\"profile_pic\">\n");
      out.write("                                <img src=\"images/minh.jpg\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"profile_info\">\n");
      out.write("                                <span>Welcome,</span>\n");
      out.write("                                <h2>TIEN MINH</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("\n");
      out.write("                        <!-- sidebar menu -->\n");
      out.write("                        <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("                            <div class=\"menu_section\">\n");
      out.write("                                <h3>General</h3>\n");
      out.write("                                <ul class=\"nav side-menu\">\n");
      out.write("                                    <li><a><i class=\"fa fa-home\"></i> Home <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"index.jsp\">Dashboard</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý tài khoản-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý tài khoản <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemTaiKhoan.jsp\">Thêm tài khoản</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachTaiKhoan.jsp\">Danh sách tài khoản</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý thể loại-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý thể loại <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemTheLoai.jsp\">Thêm thể loại</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachTheLoai.jsp\">Danh sách thể loại</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý sản phẩm-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý sản phẩm <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemSanPham.jsp\">Thêm sản phẩm</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachSanPham.jsp\">Danh sách sản phẩm</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý khách hàng-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý khách hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemKhachHang.jsp\">Thêm khách hàng</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachKhachHang.jsp\">Danh sách khách hàng</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý giỏ hàng-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý giỏ hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemGioHang.jsp\">Thêm giỏ hàng</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachGioHang.jsp\">Danh sách giỏ hàng</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--Quản lý chi tiết giỏ hàng-->\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Quản lý chi tiết giỏ hàng <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                                        <ul class=\"nav child_menu\">\n");
      out.write("                                            <li><a href=\"./ThemGioHangChiTiet.jsp\">Thêm chi tiết giỏ hàng</a></li>\n");
      out.write("                                            <li><a href=\"./DanhSachGioHangChiTiet.jsp\">Danh sách chi tiết giỏ hàng</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("                        <!-- /menu footer buttons -->\n");
      out.write("                        <div class=\"sidebar-footer hidden-small\">\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\" href=\"Login.jsp\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /menu footer buttons -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- top navigation -->\n");
      out.write("                <div class=\"top_nav\">\n");
      out.write("                    <div class=\"nav_menu\">\n");
      out.write("                        <nav>\n");
      out.write("                            <div class=\"nav toggle\">\n");
      out.write("                                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                        <img src=\"images/img.jpg\" alt=\"\">John Doe\n");
      out.write("                                        <span class=\" fa fa-angle-down\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\n");
      out.write("                                        <li><a href=\"javascript:;\"> Profile</a></li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"javascript:;\">\n");
      out.write("                                                <span class=\"badge bg-red pull-right\">50%</span>\n");
      out.write("                                                <span>Settings</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"javascript:;\">Help</a></li>\n");
      out.write("                                        <li><a href=\"Login.jsp\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                                        <span class=\"badge bg-green\">6</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a>\n");
      out.write("                                                <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                                                <span>\n");
      out.write("                                                    <span>John Smith</span>\n");
      out.write("                                                    <span class=\"time\">3 mins ago</span>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"message\">\n");
      out.write("                                                    Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a>\n");
      out.write("                                                <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                                                <span>\n");
      out.write("                                                    <span>John Smith</span>\n");
      out.write("                                                    <span class=\"time\">3 mins ago</span>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"message\">\n");
      out.write("                                                    Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a>\n");
      out.write("                                                <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                                                <span>\n");
      out.write("                                                    <span>John Smith</span>\n");
      out.write("                                                    <span class=\"time\">3 mins ago</span>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"message\">\n");
      out.write("                                                    Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a>\n");
      out.write("                                                <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                                                <span>\n");
      out.write("                                                    <span>John Smith</span>\n");
      out.write("                                                    <span class=\"time\">3 mins ago</span>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"message\">\n");
      out.write("                                                    Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <div class=\"text-center\">\n");
      out.write("                                                <a>\n");
      out.write("                                                    <strong>See All Alerts</strong>\n");
      out.write("                                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /top navigation -->\n");
      out.write("\n");
      out.write("                <!-- page content -->\n");
      out.write("                <div class=\"right_col\" role=\"main\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"page-title\">\n");
      out.write("                            <div class=\"title_left\">\n");
      out.write("                                <h3>Danh Sách Thể Loại <small></small></h3>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"title_right\">\n");
      out.write("                                <div class=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\">\n");
      out.write("                                        <span class=\"input-group-btn\">\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"button\">Go!</button>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"x_panel\">\n");
      out.write("                                    <div class=\"x_title\">\n");
      out.write("                                        <h2>Categories Table <small></small></h2>\n");
      out.write("                                        <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                                            <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"dropdown\">\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                                    <li><a href=\"#\">Settings 1</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li><a href=\"#\">Settings 2</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"x_content\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <div class=\"card-box table-responsive\">\n");
      out.write("                                                    <table id=\"datatable-keytable\" class=\"table table-striped table-bordered\">\n");
      out.write("                                                        <thead>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <th>#</th>\n");
      out.write("                                                                <th>Mã loại</th>\n");
      out.write("                                                                <th>Tên loại</th>\n");
      out.write("                                                                <th>#Chức năng</th>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tbody>\n");
      out.write("                                                            ");

                                                                session.setAttribute("THELOAI", new TheLoaiDAO().layDanhSach());
                                                            
      out.write("\n");
      out.write("                                                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        </tbody>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                            <div class=\"x_panel\">\n");
      out.write("                                <div class=\"x_title\">\n");
      out.write("                                    <h2>Pie Graph</h2>\n");
      out.write("                                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                                        <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"dropdown\">\n");
      out.write("                                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\n");
      out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                                <li><a href=\"#\">Settings 1</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li><a href=\"#\">Settings 2</a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"x_content\">\n");
      out.write("\n");
      out.write("                                    <div id=\"echart_pie\" style=\"height:350px;\"></div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /page content -->\n");
      out.write("\n");
      out.write("                <!-- footer content -->\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        Gentelella - Bootstrap Admin Template by <a href=\"https://colorlib.com\">Colorlib</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- /footer content -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("        <!-- NProgress -->\n");
      out.write("        <script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("        <!-- Datatables -->\n");
      out.write("        <script src=\"vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-keytable/js/dataTables.keyTable.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js\"></script>\n");
      out.write("        <script src=\"vendors/datatables.net-scroller/js/dataTables.scroller.min.js\"></script>\n");
      out.write("        <script src=\"vendors/jszip/dist/jszip.min.js\"></script>\n");
      out.write("        <script src=\"vendors/pdfmake/build/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"vendors/pdfmake/build/vfs_fonts.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme Scripts -->\n");
      out.write("        <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("        <script src=\"vendors/echarts/dist/echarts.min.js\"></script>\n");
      out.write("        <script src=\"vendors/echarts/map/js/world.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("tloai");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.THELOAI}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty tloai}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tloai}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getMaLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                        <td>\n");
          out.write("                                                                            <input type=\"button\" name=\"action\" class=\"btn btn-info btn-xs\" value=\"Edit\" data-toggle=\"modal\" data-target=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                            <input class=\"btn btn-danger btn-xs\" type=\"button\" value=\"Delete\" data-toggle=\"modal\" data-target=\"#del");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                            <!-- Modal -->\n");
          out.write("                                                                            <div class=\"modal fade\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
          out.write("                                                                                <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
          out.write("                                                                                    <form action=\"../ControllerTheLoai\" method=\"POST\">\n");
          out.write("                                                                                        <div class=\"modal-content\">\n");
          out.write("                                                                                            <div class=\"modal-header\">\n");
          out.write("                                                                                                <h5 class=\"modal-title\" id=\"exampleModalCenterTitle\">Cập Nhập Thể Loại</h5>\n");
          out.write("                                                                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
          out.write("                                                                                                    <span aria-hidden=\"true\">&times;</span>\n");
          out.write("                                                                                                </button>\n");
          out.write("                                                                                            </div>\n");
          out.write("                                                                                            <div class=\"modal-body\">\n");
          out.write("                                                                                                <div class=\"form-group\">\n");
          out.write("                                                                                                    <label class=\"control-label col-md-12 col-sm-12 col-xs-24\" for=\"first-name\">Mã loại <span class=\"required\">*</span>\n");
          out.write("                                                                                                    </label><br><br>\n");
          out.write("                                                                                                    <div class=\"col-md-12 col-sm-12 col-xs-24\">\n");
          out.write("                                                                                                        <input style=\"width: 540px;\" type=\"text\" id=\"first-name\" name=\"txtMaLoai1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getMaLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
          out.write("                                                                                                    </div>\n");
          out.write("                                                                                                </div><br><br>\n");
          out.write("                                                                                                <div class=\"form-group\">\n");
          out.write("                                                                                                    <label class=\"control-label col-md-12 col-sm-12 col-xs-24\" for=\"last-name\">Tên loại <span class=\"required\">*</span>\n");
          out.write("                                                                                                    </label>\n");
          out.write("                                                                                                    <div class=\"col-md-12 col-sm-12 col-xs-24\">\n");
          out.write("                                                                                                        <input style=\"width: 540px;\" type=\"text\" id=\"last-name\" name=\"txtTenLoai1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"required\" class=\"form-control col-md-7 col-xs-24\">\n");
          out.write("                                                                                                    </div>\n");
          out.write("                                                                                                </div><br><br>\n");
          out.write("                                                                                            </div>\n");
          out.write("                                                                                            <div class=\"modal-footer\">\n");
          out.write("                                                                                                <input type=\"submit\" name=\"action\" value=\"Close\" class=\"btn btn-secondary\" data-dismiss=\"modal\">\n");
          out.write("                                                                                                <input type=\"submit\" name=\"action\" value=\"Save changes\" class=\"btn btn-primary\">\n");
          out.write("                                                                                            </div>\n");
          out.write("                                                                                        </div>\n");
          out.write("                                                                                    </form>\n");
          out.write("                                                                                </div>\n");
          out.write("                                                                            </div>\n");
          out.write("                                                                            <!-- Modal delete -->\n");
          out.write("                                                                            <div class=\"modal fade\" id=\"del");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
          out.write("                                                                                <div style=\"width: 35%; margin: 200px auto;\"  class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
          out.write("                                                                                    <div class=\"modal-content\">\n");
          out.write("                                                                                        <div class=\"modal-body\" style=\"text-align: center; margin-top: 20px;\">\n");
          out.write("                                                                                            <img src=\"images/info.png\" style=\"width: 70px; height: 70px;\">\n");
          out.write("                                                                                            <p style=\"padding-top: 20px; font-size: 30px; font-weight: bold; color: #454544;\">Thông Báo</p>\n");
          out.write("                                                                                            <span style=\"padding-top: 20px; font-size: 20px; color: #454544;\">Bạn có chắc chắn muốn xoá thể loại ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span><br>\n");
          out.write("                                                                                            <form action=\"../ControllerTheLoai\" method=\"POST\">\n");
          out.write("                                                                                                <button style=\"margin-top: 20px; height: 40px; width: 90px; background-color: #3b7eeb; color: #fff;\" type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\n");
          out.write("                                                                                                <button style=\"margin-top: 20px; height: 40px; width: 90px; background-color: #eb4242; border: none; color: #fff;\" type=\"submit\" name=\"action\" value=\"Delete\" class=\"btn btn-primary\">Xoá</button>\n");
          out.write("                                                                                                <input type=\"hidden\" name=\"txtMaLoai\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getMaLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                                                <input type=\"hidden\" name=\"txtTenLoai\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                                            </form>\n");
          out.write("                                                                                        </div>\n");
          out.write("                                                                                    </div>\n");
          out.write("                                                                                </div>\n");
          out.write("                                                                            </div>\n");
          out.write("                                                                        </td>\n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("count");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
