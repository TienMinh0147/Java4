package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.SanPhamDAO;

public final class store_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <title>PS10576 - ASM</title>\n");
      out.write("\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Slick -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\n");
      out.write("        <!-- nouislider -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://uhchat.net/code.php?f=2d81b4\"></script>\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"ex\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <form action=\"ControllerCart\" method=\"POST\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalCenterTitle\">Giỏ Hàng Của bạn</h5>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"submit\" name=\"action\" value=\"Đóng\" class=\"btn btn-secondary\" data-dismiss=\"modal\">\n");
      out.write("                            <input type=\"submit\" name=\"action\" value=\"Thanh toán\" class=\"btn btn-primary\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <header>\n");
      out.write("            <!-- TOP HEADER -->\n");
      out.write("            <div id=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul class=\"header-links pull-left\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +84 334 255 377</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i> ducntps10576@fpt.edu.vn</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-map-marker\"></i> 74 Hàn Hải Nguyên Q.11</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"header-links pull-right\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dollar\"></i> USD</a></li>\n");
      out.write("                            ");
      if (_jspx_meth_c_set_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /TOP HEADER -->\n");
      out.write("\n");
      out.write("            <!-- MAIN HEADER -->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <!-- container -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- LOGO -->\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <div class=\"header-logo\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /LOGO -->\n");
      out.write("\n");
      out.write("                        <!-- SEARCH BAR -->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"header-search\">\n");
      out.write("                                <form>\n");
      out.write("                                    <select class=\"input-select\">\n");
      out.write("                                        <option value=\"0\">All Categories</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <input class=\"input\" placeholder=\"Search here\">\n");
      out.write("                                    <button class=\"search-btn\">Search</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /SEARCH BAR -->\n");
      out.write("\n");
      out.write("                        <!-- ACCOUNT -->\n");
      out.write("                        <div class=\"col-md-3 clearfix\">\n");
      out.write("                            <div class=\"header-ctn\">\n");
      out.write("                                <!-- Cart -->\n");
      out.write("                                <div class=\"dropdown\">\n");
      out.write("                                    <a style=\"cursor: pointer;\" class=\"dropdown-toggle\" data-toggle=\"modal\" data-target=\"#ex\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        <span>Your Cart</span>\n");
      out.write("                                        <div class=\"qty\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Cart -->\n");
      out.write("\n");
      out.write("                                <!-- Menu Toogle -->\n");
      out.write("                                <div class=\"menu-toggle\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                                        <span>Menu</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Menu Toogle -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /ACCOUNT -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /MAIN HEADER -->\n");
      out.write("        </header>\n");
      out.write("        <!-- /HEADER -->\n");
      out.write("\n");
      out.write("        <!-- NAVIGATION -->\n");
      out.write("        <nav id=\"navigation\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- responsive-nav -->\n");
      out.write("                <div id=\"responsive-nav\">\n");
      out.write("                    <!-- NAV -->\n");
      out.write("                    <ul class=\"main-nav nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">Sản phẩm</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">Oppo</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">Apple</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">Huawei</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">SamSung</a></li>\n");
      out.write("                        <li><a href=\"store.jsp\">Xiaomi</a></li>\n");
      out.write("                        <li><a href=\"map.jsp\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /NAV -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /responsive-nav -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- /NAVIGATION -->\n");
      out.write("\n");
      out.write("        <!-- BREADCRUMB -->\n");
      out.write("        <div id=\"breadcrumb\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <ul class=\"breadcrumb-tree\">\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">All Categories</a></li>\n");
      out.write("                            <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                            <li class=\"active\">Headphones (227,490 Results)</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /BREADCRUMB -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- ASIDE -->\n");
      out.write("                    <div id=\"aside\" class=\"col-md-3\">\n");
      out.write("                        <!-- aside Widget -->\n");
      out.write("                        <div class=\"aside\">\n");
      out.write("                            <h3 class=\"aside-title\">Categories</h3>\n");
      out.write("                            <div class=\"checkbox-filter\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-1\">\n");
      out.write("                                    <label for=\"category-1\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Laptops\n");
      out.write("                                        <small>(120)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-2\">\n");
      out.write("                                    <label for=\"category-2\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Smartphones\n");
      out.write("                                        <small>(740)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-3\">\n");
      out.write("                                    <label for=\"category-3\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Cameras\n");
      out.write("                                        <small>(1450)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-4\">\n");
      out.write("                                    <label for=\"category-4\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Accessories\n");
      out.write("                                        <small>(578)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-5\">\n");
      out.write("                                    <label for=\"category-5\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Laptops\n");
      out.write("                                        <small>(120)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"category-6\">\n");
      out.write("                                    <label for=\"category-6\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        Smartphones\n");
      out.write("                                        <small>(740)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /aside Widget -->\n");
      out.write("\n");
      out.write("                        <!-- aside Widget -->\n");
      out.write("                        <div class=\"aside\">\n");
      out.write("                            <h3 class=\"aside-title\">Price</h3>\n");
      out.write("                            <div class=\"price-filter\">\n");
      out.write("                                <div id=\"price-slider\"></div>\n");
      out.write("                                <div class=\"input-number price-min\">\n");
      out.write("                                    <input id=\"price-min\" type=\"number\">\n");
      out.write("                                    <span class=\"qty-up\">+</span>\n");
      out.write("                                    <span class=\"qty-down\">-</span>\n");
      out.write("                                </div>\n");
      out.write("                                <span>-</span>\n");
      out.write("                                <div class=\"input-number price-max\">\n");
      out.write("                                    <input id=\"price-max\" type=\"number\">\n");
      out.write("                                    <span class=\"qty-up\">+</span>\n");
      out.write("                                    <span class=\"qty-down\">-</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /aside Widget -->\n");
      out.write("\n");
      out.write("                        <!-- aside Widget -->\n");
      out.write("                        <div class=\"aside\">\n");
      out.write("                            <h3 class=\"aside-title\">Brand</h3>\n");
      out.write("                            <div class=\"checkbox-filter\">\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-1\">\n");
      out.write("                                    <label for=\"brand-1\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        SAMSUNG\n");
      out.write("                                        <small>(578)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-2\">\n");
      out.write("                                    <label for=\"brand-2\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        LG\n");
      out.write("                                        <small>(125)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-3\">\n");
      out.write("                                    <label for=\"brand-3\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        SONY\n");
      out.write("                                        <small>(755)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-4\">\n");
      out.write("                                    <label for=\"brand-4\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        SAMSUNG\n");
      out.write("                                        <small>(578)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-5\">\n");
      out.write("                                    <label for=\"brand-5\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        LG\n");
      out.write("                                        <small>(125)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand-6\">\n");
      out.write("                                    <label for=\"brand-6\">\n");
      out.write("                                        <span></span>\n");
      out.write("                                        SONY\n");
      out.write("                                        <small>(755)</small>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /aside Widget -->\n");
      out.write("\n");
      out.write("                        <!-- aside Widget -->\n");
      out.write("                        <div class=\"aside\">\n");
      out.write("                            <h3 class=\"aside-title\">Top selling</h3>\n");
      out.write("                            <div class=\"product-widget\">\n");
      out.write("                                <div class=\"product-img\">\n");
      out.write("                                    <img src=\"./img/product01.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-body\">\n");
      out.write("                                    <p class=\"product-category\">Category</p>\n");
      out.write("                                    <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                    <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-widget\">\n");
      out.write("                                <div class=\"product-img\">\n");
      out.write("                                    <img src=\"./img/product02.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-body\">\n");
      out.write("                                    <p class=\"product-category\">Category</p>\n");
      out.write("                                    <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                    <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-widget\">\n");
      out.write("                                <div class=\"product-img\">\n");
      out.write("                                    <img src=\"./img/product03.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-body\">\n");
      out.write("                                    <p class=\"product-category\">Category</p>\n");
      out.write("                                    <h3 class=\"product-name\"><a href=\"#\">product name goes here</a></h3>\n");
      out.write("                                    <h4 class=\"product-price\">$980.00 <del class=\"product-old-price\">$990.00</del></h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /aside Widget -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /ASIDE -->\n");
      out.write("\n");
      out.write("                    <!-- STORE -->\n");
      out.write("                    <div id=\"store\" class=\"col-md-9\">\n");
      out.write("                        <!-- store top filter -->\n");
      out.write("                        <div class=\"store-filter clearfix\">\n");
      out.write("                            <div class=\"store-sort\">\n");
      out.write("                                <label>\n");
      out.write("                                    Sort By:\n");
      out.write("                                    <select class=\"input-select\">\n");
      out.write("                                        <option value=\"0\">Popular</option>\n");
      out.write("                                        <option value=\"1\">Position</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </label>\n");
      out.write("\n");
      out.write("                                <label>\n");
      out.write("                                    Show:\n");
      out.write("                                    <select class=\"input-select\">\n");
      out.write("                                        <option value=\"0\">20</option>\n");
      out.write("                                        <option value=\"1\">50</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"store-grid\">\n");
      out.write("                                <li class=\"active\"><i class=\"fa fa-th\"></i></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-th-list\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /store top filter -->\n");
      out.write("\n");
      out.write("                        <!-- store products -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            ");
 session.setAttribute("DS", new SanPhamDAO().loadSP());
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_set_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /store products -->\n");
      out.write("\n");
      out.write("                        <!-- store bottom filter -->\n");
      out.write("                        <div class=\"store-filter clearfix\">\n");
      out.write("                            <span class=\"store-qty\">Showing 20-100 products</span>\n");
      out.write("                            <ul class=\"store-pagination\">\n");
      out.write("                                <li class=\"active\">1</li>\n");
      out.write("                                <li><a href=\"#\">2</a></li>\n");
      out.write("                                <li><a href=\"#\">3</a></li>\n");
      out.write("                                <li><a href=\"#\">4</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /store bottom filter -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /STORE -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- NEWSLETTER -->\n");
      out.write("        <div id=\"newsletter\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"newsletter\">\n");
      out.write("                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>\n");
      out.write("                            <form>\n");
      out.write("                                <input class=\"input\" type=\"email\" placeholder=\"Enter Your Email\">\n");
      out.write("                                <button class=\"newsletter-btn\"><i class=\"fa fa-envelope\"></i> Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"newsletter-follow\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /NEWSLETTER -->\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <!-- top footer -->\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <!-- container -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">About Us</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-map-marker\"></i>1734 Stonecoal Road</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i>+021-95-51-84</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i>email@email.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Categories</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">Hot deals</a></li>\n");
      out.write("                                    <li><a href=\"#\">Laptops</a></li>\n");
      out.write("                                    <li><a href=\"#\">Smartphones</a></li>\n");
      out.write("                                    <li><a href=\"#\">Cameras</a></li>\n");
      out.write("                                    <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix visible-xs\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Information</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Orders and Returns</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <h3 class=\"footer-title\">Service</h3>\n");
      out.write("                                <ul class=\"footer-links\">\n");
      out.write("                                    <li><a href=\"#\">My Account</a></li>\n");
      out.write("                                    <li><a href=\"#\">View Cart</a></li>\n");
      out.write("                                    <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                                    <li><a href=\"#\">Track My Order</a></li>\n");
      out.write("                                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /top footer -->\n");
      out.write("\n");
      out.write("            <!-- bottom footer -->\n");
      out.write("            <div id=\"bottom-footer\" class=\"section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <ul class=\"footer-payments\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-visa\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-credit-card\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-paypal\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-mastercard\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-discover\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cc-amex\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <span class=\"copyright\">\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /bottom footer -->\n");
      out.write("        </footer>\n");
      out.write("        <!-- /FOOTER -->\n");
      out.write("\n");
      out.write("        <!-- jQuery Plugins -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("shop");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.SHOP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_1.setVar("tc");
    _jspx_th_c_set_1.setValue(new String("0"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("sl");
    _jspx_th_c_set_2.setValue(new String("0"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <table style=\"margin: 0 auto; width: 100%; text-align: center;\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    <tr style=\"height: 60px; border-bottom: 0.5px solid #dbdbdb;\">\n");
        out.write("                                        <td></td>\n");
        out.write("                                        <th style=\"color: red;\">Tổng cộng</th>\n");
        out.write("                                        <td>$");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                                        <td style=\"text-align: center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" items</td>\n");
        out.write("                                        <td></td>\n");
        out.write("                                    </tr>\n");
        out.write("                                </table>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty shop}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr style=\"height: 60px; border-bottom: 0.5px solid #dbdbdb;\">\n");
          out.write("                                                <td><img src=\"admin/hinh/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.getSanPham().getHinh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"25px;\" height=\"35px;\"></td>\n");
          out.write("                                                <td style=\"text-align: left;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.getSanPham().getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.getSanPham().getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td style=\"width: 70px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.getSoLuong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <form action=\"ControllerCart\" method=\"POST\">\n");
          out.write("                                                <td style=\"width: 50px;\"><button style=\"background-color: transparent; border: none;\" type=\"submit \"name=\"action\" value=\"xoa\"><img style=\"width: 30px; height: 30px;\" src=\"admin/images/close.png\"></button></td> \n");
          out.write("                                                <input type=\"hidden\" name=\"txtMaSP1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.getSanPham().getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </form>\n");
          out.write("                                            ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_3.setVar("tc");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tc + (rows.value.getSanPham().getGia() * rows.value.getSoLuong())}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_4.setVar("sl");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sl + rows.value.getSoLuong()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent(null);
    _jspx_th_c_set_5.setVar("dauhieu");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.DAUHIEU}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dauhieu == 'dn'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <li><a href=\"#\">Xin chào ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ten.getHoTen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_set_6.setVar("ten");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.TEN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent(null);
    _jspx_th_c_set_7.setVar("spham");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.DS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty spham}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_1.setVar("rows");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${spham}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <!-- product -->\n");
          out.write("                                    <div class=\"col-md-4 col-xs-6\">\n");
          out.write("                                        <div class=\"product\">\n");
          out.write("                                            <div class=\"product-img\" style=\"text-align: center;\">\n");
          out.write("                                                <img src=\"admin/hinh/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getHinh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 90%; height: 300px; padding-top: 20px;\">\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"product-body\">\n");
          out.write("                                                <p class=\"product-category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getMaLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                <h4 class=\"product-price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <del class=\"product-old-price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getGia() + 100}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</del></h4>\n");
          out.write("                                                <div class=\"product-rating\">\n");
          out.write("                                                    <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    <i class=\"fa fa-star\"></i>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-btns\">\n");
          out.write("                                                    <button class=\"add-to-wishlist\"><i class=\"fa fa-heart-o\"></i><span class=\"tooltipp\">add to wishlist</span></button>\n");
          out.write("                                                    <button class=\"add-to-compare\"><i class=\"fa fa-exchange\"></i><span class=\"tooltipp\">add to compare</span></button>\n");
          out.write("                                                    <button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">quick view</span></button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"add-to-cart\">\n");
          out.write("                                                <form action=\"ControllerCart\" method=\"POST\">\n");
          out.write("                                                    <button type=\"submit\" class=\"add-to-cart-btn\" name=\"action\" value=\"add to cart1\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\n");
          out.write("                                                    <input type=\"hidden\" name=\"txtMaSP\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <input type=\"hidden\" name=\"txtTenSP\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <input type=\"hidden\" name=\"txtGia\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <input type=\"hidden\" name=\"txtHinh\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.getHinh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                </form>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <!-- /product -->\n");
          out.write("                                    <div class=\"clearfix visible-sm visible-xs\"></div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
