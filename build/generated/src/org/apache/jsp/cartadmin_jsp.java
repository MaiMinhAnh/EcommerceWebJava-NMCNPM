package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.CartAdmin;
import dao.CartDAOImple;
import model.Product;
import dao.ProductDAOImple;
import model.User;
import dao.UserDAOImple;

public final class cartadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("         <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <title>Chi tiết đơn hàng</title>\r\n");
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
      out.write("    <body>\r\n");
      out.write("        ");
 
            String ma_loai_san_pham = "";
            if (request.getParameter("ma_loai_san_pham") != null) {
                ma_loai_san_pham = request.getParameter("ma_loai_san_pham");
            }
            
            String ma_san_pham = "";
            if (request.getParameter("ma_san_pham") != null) {
                ma_san_pham = request.getParameter("ma_san_pham");
            }
                                     
            ProductDAOImple productDAO = new ProductDAOImple();
            Product p = productDAO.getProduct(Integer.parseInt(ma_san_pham));
            
            CartDAOImple cartDAO = new CartDAOImple();
            CartAdmin ca = cartDAO.getCart(Integer.parseInt(ma_loai_san_pham));
        
      out.write("\r\n");
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
      out.write("                        <h3 class=\"section-title\">CHI TIẾT ĐƠN HÀNG</h3>\r\n");
      out.write("                        <div class=\"col-md-5 col-md-push-2\">\r\n");
      out.write("                            <div id=\"product-main-img\">\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_1());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_2());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_3());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_4());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_5());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>   \r\n");
      out.write("                        </div>                    \r\n");
      out.write("                        <div class=\"col-md-2  col-md-pull-5\">\r\n");
      out.write("                            <div id=\"product-imgs\">\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_1());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_2());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_3());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_4());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-preview\">\r\n");
      out.write("                                    <img src=\"image/");
      out.print(p.getHinh_anh_5());
      out.write("\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-5\"> \r\n");
      out.write("                            <h3>");
      out.print(ca.getTen_san_pham());
      out.write("</h3>\r\n");
      out.write("                            <form action=\"CartAdminServlet\" method=\"post\" class=\"billing-details\" enctype=\"multipart/form-data\">     \r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(ca.getId_cart());
      out.write("\" name=\"id_cart\" />\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(ca.getMa_san_pham());
      out.write("\" name=\"ma_san_pham\" />\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Tên sản phẩm:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getTen_san_pham());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Số lượng:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getSo_luong());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Giá bán:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getGia_ban());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Tổng giá trị đơn hàng:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getThanh_tien());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Tên khách hàng:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getTen_khach_hang());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Số điện thoại:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getSdt());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Nơi giao hàng:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" readonly name=\"username\" value=\"");
      out.print(ca.getDia_chi());
      out.write("\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Ngày mua hàng:</label>\r\n");
      out.write("                                    <input class=\"input\" readonly type=\"date\" value=\"");
      out.print(ca.getNgay_mua());
      out.write("\" name=\"date\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Trạng thái:</label>\r\n");
      out.write("                                    <input class=\"input\" type=\"text\" value=\"");
      out.print(ca.getTrang_thai());
      out.write("\"\r\n");
      out.write("                                        list=\"statusList\" onfocus=\"this.value = '';\"\r\n");
      out.write("                                        onblur=\"if (this.value == '') {this.value = '");
      out.print(ca.getTrang_thai());
      out.write("';}\"\r\n");
      out.write("                                        name=\"trang_thai\"> \r\n");
      out.write("                                        <datalist id=\"statusList\">\r\n");
      out.write("                                            <option value=\"Đang xử lí\">\r\n");
      out.write("                                            <option value=\"Đang vận chuyển\">\r\n");
      out.write("                                            <option value=\"Đã giao\">   \r\n");
      out.write("                                        </datalist>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"submit\" name=\"update\" value=\"CẬP NHẬT\" class=\"primary-btn order-submit\" />\r\n");
      out.write("                                <input type=\"submit\" name=\"delete\" value=\"XOÁ\" class=\"primary-btn order-submit\" />\r\n");
      out.write("                            </form>                         \r\n");
      out.write("                        </div>        \r\n");
      out.write("                            \r\n");
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
      out.write("        <script src=\"js/main.js\"></script>      \r\n");
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
