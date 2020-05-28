package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CartDAOImple;
import model.Product;
import dao.ProductDAOImple;
import model.User;
import dao.UserDAOImple;

public final class addproductadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("         <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <title>Thêm sản phẩm</title>\r\n");
      out.write("        <!-- Google font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <!-- Slick -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("        <!-- nouislider -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("        <!-- Font Awesome Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Custom stlylesheet -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>     \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("     \r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <div class=\"container\" style=\"width: 100%\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "taskadmin.jsp", out, false);
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-9\">\r\n");
      out.write("                        <h3 class=\"section-title\">THÊM SẢN PHẨM</h3>\r\n");
      out.write("                        <div class=\"col-md-7 center-block\">\r\n");
      out.write("                            <form action=\"AddProductServlet\" method=\"post\" class=\"billing-details\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Tên sản phẩm:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" name=\"ten_san_pham\" placeholder=\"Tên sản phẩm\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Loại sản phẩm:</label>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" value=\"\"\r\n");
      out.write("                                        placeholder=\"Loại sản phẩm\"\r\n");
      out.write("                                        list=\"categoryList\" onfocus=\"this.value = '';\"                                    \r\n");
      out.write("                                        name=\"loai_san_pham\" /> \r\n");
      out.write("                                    <datalist id=\"categoryList\">\r\n");
      out.write("                                        <option value=\"Điện thoại\">\r\n");
      out.write("                                        <option value=\"Tivi\">\r\n");
      out.write("                                        <option value=\"Máy tính\">\r\n");
      out.write("                                        <option value=\"Máy ảnh\">\r\n");
      out.write("                                        <option value=\"Máy tính bảng\">\r\n");
      out.write("                                    </datalist>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Hình ảnh:</label>\r\n");
      out.write("                                    <input type=\"file\" name=\"hinh_anh_1\" />\r\n");
      out.write("                                    <input type=\"file\" name=\"hinh_anh_2\" />\r\n");
      out.write("                                    <input type=\"file\" name=\"hinh_anh_3\" />\r\n");
      out.write("                                    <input type=\"file\" name=\"hinh_anh_4\" />\r\n");
      out.write("                                    <input type=\"file\" name=\"hinh_anh_5\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Giá bán:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" name=\"gia_ban\" placeholder=\"VNĐ\" />\r\n");
      out.write("                                </div>                          \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <button type=\"submit\" value=\"addproduct\" class=\"primary-btn order-submit\">THÊM SẢN PHẨM</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
