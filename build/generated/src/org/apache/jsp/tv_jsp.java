package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import dao.UserDAOImple;
import model.Product;
import dao.ProductDAOImple;

public final class tv_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("         <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <title>TV</title>\r\n");
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
      out.write("    <body>\r\n");
      out.write("        ");

            String username = null;
            Cookie[] cookies = request.getCookies();
            if(cookies !=null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("username")) 
                        username = cookie.getValue();
                }
            }
            UserDAOImple userDAO = new UserDAOImple();
            int id = userDAO.getUser(username).getMa_nguoi_dung();
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">                      \r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <div class=\"section-title\">\r\n");
      out.write("                                <h3 class=\"title\">TV</h3>                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"products-tabs\">\r\n");
      out.write("                                    <div id=\"tab1\" class=\"tab-pane active\">\r\n");
      out.write("                                        <div class=\"products-slick\" data-nav=\"#slick-nav-2\">\r\n");
      out.write("                                            ");

                                                ProductDAOImple productDAO = new ProductDAOImple();
                                                for (Product p : productDAO.getListByCategory(2)) {
                                                    int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
                                                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"product\">\r\n");
      out.write("                                                <div class=\"product-img\">\r\n");
      out.write("                                                    <img src=\"image/");
      out.print(p.getHinh_anh_1());
      out.write("\" alt=\"\" >\r\n");
      out.write("                                                    <div class=\"product-label\">\r\n");
      out.write("                                                    ");
 int sale;
                                                        if(p.getSale() != 0) { 
                                                            sale = (int)(p.getSale()*100);
                                                    
      out.write("\r\n");
      out.write("                                                        <span class=\"sale\">-");
      out.print(sale);
      out.write("%</span>\r\n");
      out.write("                                                    ");
 } 
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>                                         \r\n");
      out.write("                                                <div class=\"product-body\">\r\n");
      out.write("                                                    <p class=\"product-category\">TV</p>\r\n");
      out.write("                                                    <h3 class=\"product-name\"><a href=\"product.jsp?ma_san_pham=");
      out.print(p.getMa_san_pham());
      out.write('"');
      out.write('>');
      out.print(p.getTen_san_pham());
      out.write("</a></h3>\r\n");
      out.write("                                                    <h4 class=\"product-price\">");
      out.print(formatter.format((int)(p.getGia_ban() * (1- p.getSale()))));
      out.write(" VNĐ</h4>\r\n");
      out.write("                                                    <div class=\"product-rating\">\r\n");
      out.write("                                                        ");
 if(rating_avg != 0) { 
                                                        for(int j=1 ;j<= rating_avg; j++) { 
      out.write("\r\n");
      out.write("                                                        <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                        ");
 }
                                                        } else { 
      out.write("\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        ");
 } 
      out.write("\r\n");
      out.write("                                                    </div>                                                 \r\n");
      out.write("                                                    ");
 if(username != null) { 
      out.write("\r\n");
      out.write("                                                        <form action=\"WishlistServlet\" method=\"post\">\r\n");
      out.write("                                                            <div class=\"product-btns\">                                                 \r\n");
      out.write("                                                                <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"ma_nguoi_dung\"/>\r\n");
      out.write("                                                                <input type=\"hidden\" value=\"");
      out.print(p.getMa_san_pham());
      out.write("\" name=\"ma_san_pham\"/>\r\n");
      out.write("                                                                <input type=\"hidden\" value=\"");
      out.print(p.getTen_san_pham());
      out.write("\" name=\"ten_san_pham\" />\r\n");
      out.write("                                                                <button class=\"add-to-wishlist\"><i class=\"fa fa-heart-o\"></i><span class=\"tooltipp\">Yêu thích</span></button>                                                                                                    \r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                        ");
} else { 
      out.write("\r\n");
      out.write("                                                        <form action=\"signin.jsp\">\r\n");
      out.write("                                                            <div class=\"product-btns\">\r\n");
      out.write("                                                                <button class=\"add-to-wishlist\">\r\n");
      out.write("                                                                    <i class=\"fa fa-heart-o\"></i>\r\n");
      out.write("                                                                    <span class=\"tooltipp\">Yêu thích</span>\r\n");
      out.write("                                                                </button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                    ");
 } 
      out.write("                                         \r\n");
      out.write("                                                </div>                                                                                   \r\n");
      out.write("                                            </div> \r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("    \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>                                   \r\n");
      out.write("                                </div>                                  \r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div id=\"slick-nav-2\" class=\"products-slick-nav\"></div>                  \r\n");
      out.write("                        </div>                                          \r\n");
      out.write("                    </div>                                \r\n");
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
