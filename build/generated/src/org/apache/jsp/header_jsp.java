package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.WishlistDAOImple;
import dao.UserDAOImple;
import dao.CartDAOImple;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\"/>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
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
            if(username == null) {
        
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div id=\"top-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <ul class=\"header-links pull-left\">\r\n");
      out.write("                        <li><a><i class=\"fa fa-phone\"></i> 0986.866.866</a></li>\r\n");
      out.write("                        <li><a><i class=\"fa fa-envelope-o\"></i> nhom12@gmail.com</a></li>\r\n");
      out.write("                        <li><a><i class=\"fa fa-map-marker\"></i> Số 1, Đại Cồ Việt</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"header-links pull-right\">\r\n");
      out.write("                        <li><a href=\"signup.jsp\"><i class=\"fa fa-user-plus\"></i> Đăng kí</a></li>\r\n");
      out.write("                        <li><a href=\"signin.jsp\"><i class=\"fa fa-user-o\"></i> Đăng nhập</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"header\"> \r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"header-logo\">\r\n");
      out.write("                                <a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("                                      <h1>5Star</h1>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <div class=\"header-search\">\r\n");
      out.write("                                <form action=\"SearchServlet\" method=\"post\">\r\n");
      out.write("                                    <input class=\"input\" placeholder=\"Tên sản phẩm...\" name=\"keyword\">\r\n");
      out.write("                                    <button class=\"search-btn\">Tìm kiếm</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("            \r\n");
      out.write("                        <div class=\"col-md-3 clearfix\">\r\n");
      out.write("                            <div class=\"header-ctn\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <a href=\"signin.jsp\">\r\n");
      out.write("                                        <i class=\"fa fa-heart-o\"></i>\r\n");
      out.write("                                        <span>Yêu thích</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"dropdown\">\r\n");
      out.write("                                    <a href=\"signin.jsp\">\r\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("                                        <span>Giỏ hàng</span>\r\n");
      out.write("                                    </a>                                \r\n");
      out.write("                                </div>                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <nav id=\"navigation\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div id=\"responsive-nav\">\r\n");
      out.write("                        <ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("                            <li><a href=\"index.jsp\">TRANG CHỦ</a></li>\r\n");
      out.write("                            <li><a href=\"smartphone.jsp\">ĐIỆN THOẠI</a></li>\r\n");
      out.write("                            <li><a href=\"tv.jsp\">TV</a></li>\r\n");
      out.write("                            <li><a href=\"laptop.jsp\">MÁY TÍNH</a></li>\r\n");
      out.write("                            <li><a href=\"camera.jsp\">MÁY ẢNH</a></li>\r\n");
      out.write("                            <li><a href=\"tablet.jsp\">MÁY TÍNH BẢNG</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        ");

            } else {
        
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div id=\"top-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <ul class=\"header-links pull-left\">\r\n");
      out.write("                        <li><a><i class=\"fa fa-phone\"></i> 0986.866.866</a></li>\r\n");
      out.write("                        <li><a><i class=\"fa fa-envelope-o\"></i> ducpb07101999@gmail.com</a></li>\r\n");
      out.write("                        <li><a><i class=\"fa fa-map-marker\"></i> Số 1, Đại Cồ Việt</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"header-links pull-right\">\r\n");
      out.write("                        <li><a href=\"myaccount.jsp\"><i class=\"fa fa-user-o\"></i> ");
      out.print(username);
      out.write("</a></li>\r\n");
      out.write("                        <li><a href=\"SignoutServlet\"><i class=\"fa fa-sign-out\"></i> Đăng xuất</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"header\"> \r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"header-logo\">\r\n");
      out.write("                                <a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <div class=\"header-search\">\r\n");
      out.write("                                <form action=\"SearchServlet\" method=\"post\">\r\n");
      out.write("                                    <input class=\"input\" placeholder=\"Tên sản phẩm...\" name=\"keyword\">\r\n");
      out.write("                                    <button class=\"search-btn\">Tìm kiếm</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("            \r\n");
      out.write("                        <div class=\"col-md-3 clearfix\">\r\n");
      out.write("                            <div class=\"header-ctn\">\r\n");
      out.write("                                ");

                                    WishlistDAOImple wishlistDAO = new WishlistDAOImple();
                                    CartDAOImple cartDAO = new CartDAOImple();
                                    UserDAOImple userDAO1 = new UserDAOImple();
                                    
                                    int id = userDAO1.getUser(username).getMa_nguoi_dung();
                                    int qtyWishlist = wishlistDAO.countWishlist(id);
                                    int qtyCart = cartDAO.countCart(id);
                                
      out.write("\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <a href=\"yourwishlist.jsp\">\r\n");
      out.write("                                        <i class=\"fa fa-heart-o\"></i>\r\n");
      out.write("                                        <span>Yêu thích</span>\r\n");
      out.write("                                        <div class=\"qty\">");
      out.print(qtyWishlist);
      out.write("</div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"dropdown\">\r\n");
      out.write("                                    <a href=\"yourcart.jsp\">\r\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("                                        <span>Giỏ hàng</span>\r\n");
      out.write("                                        <div class=\"qty\">");
      out.print(qtyCart);
      out.write("</div>\r\n");
      out.write("                                    </a>                                \r\n");
      out.write("                                </div>                                                             \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <nav id=\"navigation\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div id=\"responsive-nav\">\r\n");
      out.write("                        <ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("                            <li><a href=\"index.jsp\">TRANG CHỦ</a></li>\r\n");
      out.write("                            <li><a href=\"smartphone.jsp\">ĐIỆN THOẠI</a></li>\r\n");
      out.write("                            <li><a href=\"tv.jsp\">TV</a></li>\r\n");
      out.write("                            <li><a href=\"laptop.jsp\">MÁY TÍNH</a></li>\r\n");
      out.write("                            <li><a href=\"camera.jsp\">MÁY ẢNH</a></li>\r\n");
      out.write("                            <li><a href=\"tablet.jsp\">MÁY TÍNH BẢNG</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
