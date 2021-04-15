package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chi tiết sản phẩm</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            Product product = new Product();
            String productID = "";
            if (request.getParameter("productID") != null) {
                productID = request.getParameter("productID");
                product = productDAO.getProduct(Long.parseLong(productID));
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"single\">\n");
      out.write("                    <div class=\"col-md-9 top-in-single\">\n");
      out.write("                        <div class=\"col-md-5 single-top\">\t\n");
      out.write("\n");
      out.write("                            <a href=\"optionallink.html\">\n");
      out.write("                                <img class=\"etalage_thumb_image img-responsive\" src=\"");
      out.print(product.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </div>\t\n");
      out.write("                    <div class=\"col-md-7 single-top-in\">\n");
      out.write("                        <div class=\"single-para\">\n");
      out.write("                            <h4>");
      out.print(product.getProductName());
      out.write("</h4>\n");
      out.write("                            <div class=\"para-grid\">\n");
      out.write("                                <span class=\"add-to\">");
      out.print(String.format("%,.0f", product.getProductPrice()));
      out.write(" VNĐ</span><br />\n");
      out.write("                                <a style=\"margin-left: 72px;margin-top: 7px; background-color: #0076F9\" href=\"CartServlet?command=plus&productID=");
      out.print(product.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">MUA NGAY</a>\t\t\t\t\t\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <p>");
      out.print(product.getProductDescription());
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <!--                    <div class=\"content-top-in\">\n");
      out.write("                                            <div class=\"col-md-4 top-single\">\n");
      out.write("                                                <div class=\"col-md\">\n");
      out.write("                                                    <img  src=\"images/pic8.jpg\" alt=\"\" />\t\n");
      out.write("                                                    <div class=\"top-content\">\n");
      out.write("                                                        <h5>Mascot Kitty - White</h5>\n");
      out.write("                                                        <div class=\"white\">\n");
      out.write("                                                            <a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("                                                            <div class=\"clearfix\"></div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-4 top-single\">\n");
      out.write("                                                <div class=\"col-md\">\n");
      out.write("                                                    <img  src=\"images/pic9.jpg\" alt=\"\" />\t\n");
      out.write("                                                    <div class=\"top-content\">\n");
      out.write("                                                        <h5>Mascot Kitty - White</h5>\n");
      out.write("                                                        <div class=\"white\">\n");
      out.write("                                                            <a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("                                                            <div class=\"clearfix\"></div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-4 top-single-in\">\n");
      out.write("                                                <div class=\"col-md\">\n");
      out.write("                                                    <img  src=\"images/pic10.jpg\" alt=\"\" />\t\n");
      out.write("                                                    <div class=\"top-content\">\n");
      out.write("                                                        <h5>Mascot Kitty - White</h5>\n");
      out.write("                                                        <div class=\"white\">\n");
      out.write("                                                            <a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("                                                            <div class=\"clearfix\"></div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                    \n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>-->\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <div class=\"fb-comments\" data-href=\"http://localhost:8080/shop/single.jsp?productID=");
      out.print(productID);
      out.write("\" data-width=\"850\" data-numposts=\"5\"></div>      \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <!--                    <div class=\"single-bottom\">\n");
      out.write("                                            <h4>Categories</h4>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single-bottom\">\n");
      out.write("                                            <h4>Product Categories</h4>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>feugiat(5)</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i> feugiat (4)</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("                                                <li><a href=\"#\"><i> </i> feugiat(2)</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>-->\n");
      out.write("                    <!--                    <div class=\"single-bottom\">\n");
      out.write("                                            <h4>Product Categories</h4>\n");
      out.write("                                            <div class=\"product\">\n");
      out.write("                                                <img class=\"img-responsive fashion\" src=\"images/st1.jpg\" alt=\"\">\n");
      out.write("                                                <div class=\"grid-product\">\n");
      out.write("                                                    <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                                                    <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product\">\n");
      out.write("                                                <img class=\"img-responsive fashion\" src=\"images/st2.jpg\" alt=\"\">\n");
      out.write("                                                <div class=\"grid-product\">\n");
      out.write("                                                    <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                                                    <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product\">\n");
      out.write("                                                <img class=\"img-responsive fashion\" src=\"images/st3.jpg\" alt=\"\">\n");
      out.write("                                                <div class=\"grid-product\">\n");
      out.write("                                                    <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                                                    <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
