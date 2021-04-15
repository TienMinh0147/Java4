package org.apache.jsp;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HONDA TEAM</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"fontawesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                    pager: true\n");
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
      out.write("\n");
      out.write("        <!--Hiệu ứng tuyết rơi-->\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("            window.snowStormConfigs = {\n");
      out.write("                'snowColor': '#00FF00'        //Thay đổi màu sắc của bông tuyết tại đây\n");
      out.write("                , 'snowCharacter': '&bull;'    //Thay đổi hình dạng của bông tuyết tại đây\n");
      out.write("            }\n");
      out.write("            setTimeout(function () {\n");
      out.write("                (function (d, s, id) {\n");
      out.write("                    var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                    if (d.getElementById(id))\n");
      out.write("                        return;\n");
      out.write("                    js = d.createElement(s);\n");
      out.write("                    js.id = id;\n");
      out.write("                    js.src = \"//static.pep.vn/library/pepvn/blog-xtraffic/effects/snow-storm/main.min.js\";\n");
      out.write("                    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                }(document, 'script', 'blog-xtraffic-snow-storm'));\n");
      out.write("            }, 100);\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://www.trungtamtinhoc.edu.vn/api/snowstorm.js\"></script>\n");
      out.write("        <!--<script type='text/javascript' src='https://hoangluyen.com/demo/js/snow.mini.js'></script>-->\n");
      out.write("\n");
      out.write("        <!--Hiệu ứng mai rơi -->\n");
      out.write("        <script type='text/javascript'>\n");
      out.write("//<![CDATA[\n");
      out.write("            var pictureSrc = \"https://1.bp.blogspot.com/-CXx9jt2JMRk/Vq-Lh5fm88I/AAAAAAAASwo/XivooDn_oSY/s1600/hoamai.png\"; //the location of the snowflakes\n");
      out.write("            var pictureWidth = 15; //the width of the snowflakes\n");
      out.write("            var pictureHeight = 15; //the height of the snowflakes\n");
      out.write("            var numFlakes = 10; //the number of snowflakes\n");
      out.write("            var downSpeed = 0.01; //the falling speed of snowflakes (portion of screen per 100 ms)\n");
      out.write("            var lrFlakes = 10; //the speed that the snowflakes should swing from side to side\n");
      out.write("\n");
      out.write("\n");
      out.write("            if (typeof (numFlakes) != 'number' || Math.round(numFlakes) != numFlakes || numFlakes < 1) {\n");
      out.write("                numFlakes = 10;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//draw the snowflakes\n");
      out.write("            for (var x = 0; x < numFlakes; x++) {\n");
      out.write("                if (document.layers) { //releave NS4 bug\n");
      out.write("                    document.write('<layer id=\"snFlkDiv' + x + '\"><imgsrc=\"' + pictureSrc + '\" height=\"' + pictureHeight + '\"width=\"' + pictureWidth + '\" alt=\"*\" border=\"0\"></layer>');\n");
      out.write("                } else {\n");
      out.write("                    document.write('<div style=\"position:absolute; z-index:9999;\"id=\"snFlkDiv' + x + '\"><img src=\"' + pictureSrc + '\"height=\"' + pictureHeight + '\" width=\"' + pictureWidth + '\" alt=\"*\"border=\"0\"></div>');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//calculate initial positions (in portions of browser window size)\n");
      out.write("            var xcoords = new Array(), ycoords = new Array(), snFlkTemp;\n");
      out.write("            for (var x = 0; x < numFlakes; x++) {\n");
      out.write("                xcoords[x] = (x + 1) / (numFlakes + 1);\n");
      out.write("                do {\n");
      out.write("                    snFlkTemp = Math.round((numFlakes - 1) * Math.random());\n");
      out.write("                } while (typeof (ycoords[snFlkTemp]) == 'number');\n");
      out.write("                ycoords[snFlkTemp] = x / numFlakes;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//now animate\n");
      out.write("            function flakeFall() {\n");
      out.write("                if (!getRefToDivNest('snFlkDiv0')) {\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                var scrWidth = 0, scrHeight = 0, scrollHeight = 0, scrollWidth = 0;\n");
      out.write("//find screen settings for all variations. doing this every time allows for resizing and scrolling\n");
      out.write("                if (typeof (window.innerWidth) == 'number') {\n");
      out.write("                    scrWidth = window.innerWidth;\n");
      out.write("                    scrHeight = window.innerHeight;\n");
      out.write("                } else {\n");
      out.write("                    if (document.documentElement && (document.documentElement.clientWidth || document.documentElement.clientHeight)) {\n");
      out.write("                        scrWidth = document.documentElement.clientWidth;\n");
      out.write("                        scrHeight = document.documentElement.clientHeight;\n");
      out.write("                    } else {\n");
      out.write("                        if (document.body && (document.body.clientWidth || document.body.clientHeight)) {\n");
      out.write("                            scrWidth = document.body.clientWidth;\n");
      out.write("                            scrHeight = document.body.clientHeight;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if (typeof (window.pageYOffset) == 'number') {\n");
      out.write("                    scrollHeight = pageYOffset;\n");
      out.write("                    scrollWidth = pageXOffset;\n");
      out.write("                } else {\n");
      out.write("                    if (document.body && (document.body.scrollLeft || document.body.scrollTop)) {\n");
      out.write("                        scrollHeight = document.body.scrollTop;\n");
      out.write("                        scrollWidth = document.body.scrollLeft;\n");
      out.write("                    } else {\n");
      out.write("                        if (document.documentElement && (document.documentElement.scrollLeft || document.documentElement.scrollTop)) {\n");
      out.write("                            scrollHeight = document.documentElement.scrollTop;\n");
      out.write("                            scrollWidth = document.documentElement.scrollLeft;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("//move the snowflakes to their new position\n");
      out.write("                for (var x = 0; x < numFlakes; x++) {\n");
      out.write("                    if (ycoords[x] * scrHeight > scrHeight - pictureHeight) {\n");
      out.write("                        ycoords[x] = 0;\n");
      out.write("                    }\n");
      out.write("                    var divRef = getRefToDivNest('snFlkDiv' + x);\n");
      out.write("                    if (!divRef) {\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("                    if (divRef.style) {\n");
      out.write("                        divRef = divRef.style;\n");
      out.write("                    }\n");
      out.write("                    var oPix = document.childNodes ? 'px' : 0;\n");
      out.write("                    divRef.top = (Math.round(ycoords[x] * scrHeight) + scrollHeight) + oPix;\n");
      out.write("                    divRef.left = (Math.round(((xcoords[x] * scrWidth) - (pictureWidth / 2)) + ((scrWidth / ((numFlakes + 1) * 4)) * (Math.sin(lrFlakes * ycoords[x]) - Math.sin(3 * lrFlakes * ycoords[x])))) + scrollWidth) + oPix;\n");
      out.write("                    ycoords[x] += downSpeed;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//DHTML handlers\n");
      out.write("            function getRefToDivNest(divName) {\n");
      out.write("                if (document.layers) {\n");
      out.write("                    return document.layers[divName];\n");
      out.write("                } //NS4\n");
      out.write("                if (document[divName]) {\n");
      out.write("                    return document[divName];\n");
      out.write("                } //NS4 also\n");
      out.write("                if (document.getElementById) {\n");
      out.write("                    return document.getElementById(divName);\n");
      out.write("                } //DOM (IE5+, NS6+, Mozilla0.9+, Opera)\n");
      out.write("                if (document.all) {\n");
      out.write("                    return document.all[divName];\n");
      out.write("                } //Proprietary DOM - IE4\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            window.setInterval('flakeFall();', 100);\n");
      out.write("//]]>\n");
      out.write("        </script> \n");
      out.write("        <!--Nhạc nền-->\n");
      out.write("    <iframe src=\"http://www.nhaccuatui.com/mh/background/veUXnnnyDqhM\" width=\"1\" height=\"1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>      \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
