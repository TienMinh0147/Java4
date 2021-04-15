package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manager Product</title>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <script src=\"ckeditor/ckeditor.js\"></script>\n");
      out.write("<script src=\"ckfinder/ckfinder.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("                    <h2>Thêm sản phẩm</h2>\n");
      out.write("                    <form action=\"/web/ManagerProductServlet\" method=\"post\">\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <table width=\"95%\">\n");
      out.write("                        <tr><td width=\"150px\"><b>Tên sản phẩm</b></td><td><input type=\"text\" name=\"tensp\" class=\"pendek\"></td></tr>\n");
      out.write("                        <tr><td><b>Giá</b></td><td><input type=\"number\" name=\"gia\" class=\"sedang\"></td></tr>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        <tr><td><b>Loại</b></td><td>\n");
      out.write("                                <select name=\"loai\">\n");
      out.write("                                    <option selected value=\"1\" >-- Xiaomi --</option>\n");
      out.write("                                    <option value=\"2\">Oukitel</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td></tr>\n");
      out.write("                        <tr><td><b>Hình ảnh</b></td><td><input type=\"text\" name=\"hinhanh\" class=\"panjang\"></td></tr>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("var editor = CKEDITOR.replace( 'NoiDung',{\n");
      out.write("  filebrowserImageBrowseUrl : 'ckfinder/ckfinder.html?Type=Images',\n");
      out.write("  filebrowserFlashBrowseUrl : 'ckfinder/ckfinder.html?Type=Flash',\n");
      out.write("  filebrowserImageUploadUrl : 'ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Images',\n");
      out.write("  filebrowserFlashUploadUrl : 'ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Flash',\n");
      out.write("\theight: '500px',\n");
      out.write("  toolbar:[\n");
      out.write("  { name: 'document', items : [ 'Source','-','Templates' ] },\n");
      out.write("  { name: 'clipboard', items : [ 'Cut','Copy','Paste','PasteText','PasteFromWord','-','Undo','Redo' ] },\n");
      out.write("  { name: 'editing', items : [ 'Find','Replace','-','SelectAll','-','SpellChecker', 'Scayt' ] },\n");
      out.write("  { name: 'forms', items : [ 'Form', 'Checkbox', 'Radio', 'TextField', 'Textarea', 'Select', 'Button', 'ImageButton',\n");
      out.write("        'HiddenField' ] },\n");
      out.write("  '/',\n");
      out.write("  { name: 'basicstyles', items : [ 'Bold','Italic','Underline','Strike','Subscript','Superscript','-','RemoveFormat' ] },\n");
      out.write("  { name: 'paragraph', items : [ 'NumberedList','BulletedList','-','Outdent','Indent','-','Blockquote','CreateDiv',\n");
      out.write("  '-','JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock','-','BidiLtr','BidiRtl' ] },\n");
      out.write("  { name: 'links', items : [ 'Link','Unlink','Anchor' ] },\n");
      out.write("  { name: 'insert', items : [ 'Image','MediaEmbed','Flash','Table','HorizontalRule','Smiley','SpecialChar','PageBreak','Iframe' ] },\n");
      out.write("  '/',\n");
      out.write("  { name: 'styles', items : [ 'Styles','Format','Font','FontSize' ] },\n");
      out.write("  { name: 'colors', items : [ 'TextColor','BGColor' ] },\n");
      out.write("  { name: 'tools', items : [ 'Maximize', 'ShowBlocks','-','About' ] }\n");
      out.write("  ]\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("                        <tr><td><b>Mô tả</b></td><td><textarea name=\"mota\" id=\"motaa\"></textarea></td></tr>\n");
      out.write("                        <script>    CKEDITOR.replace( 'motaa' );</script>\n");
      out.write("                        <tr><td></td><td>\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"insert\">\n");
      out.write("                                <input type=\"submit\" class=\"button\" value=\"Thêm\">\n");
      out.write("                                \n");
      out.write("                            </td></tr>\n");
      out.write("                    </table>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
