package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CartDAOImple;
import dao.ProductDAOImple;
import model.User;
import dao.UserDAOImple;

public final class useradmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tài khoản khách hàng</title>\r\n");
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

            String error = "";
            if (request.getAttribute("error") != null) {
                    error = (String) request.getAttribute("error");
            }
	
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
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-9\">\r\n");
      out.write("                        <h3 class=\"section-title\">TÀI KHOẢN KHÁCH HÀNG</h3>\r\n");
      out.write("                        ");
 if(error != "") { 
      out.write("\r\n");
      out.write("                            <div class=\"alert alert-danger\">");
      out.print(error);
      out.write("</div>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                        <table class=\"table\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th class=\"text-center\">STT</th>\r\n");
      out.write("                                    <th class=\"text-center\">Tên người dùng</th>\r\n");
      out.write("                                    <th class=\"text-center\">Ngày sinh</th>\r\n");
      out.write("                                    <th class=\"text-center\">Giới tính</th>\r\n");
      out.write("                                    <th class=\"text-center\">Email</th>\r\n");
      out.write("                                    <th class=\"text-center\">Số điện thoại</th>\r\n");
      out.write("                                    <th class=\"text-center\">Địa chỉ</th>\r\n");
      out.write("                                    <th class=\"text-center\">Thao tác</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            ");

                                int i = 1;
                                UserDAOImple userDAO = new UserDAOImple();
                                for (User u : userDAO.getListUser()) {
                            
      out.write("\r\n");
      out.write("                            <tbody class=\"text-center\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>");
      out.print(i);
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(u.getUser__name());
      out.write("</td>                                                  \r\n");
      out.write("                                    <td>");
      out.print(u.getNgay_sinh());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(u.getGioi_tinh());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(u.getEmail());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(u.getSdt());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(u.getDia_chi());
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <form action=\"DeleteUser\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" value=\"");
      out.print(u.getMa_nguoi_dung());
      out.write("\" name=\"ma_nguoi_dung\" />\r\n");
      out.write("                                            <button class=\"primary-btn\">\r\n");
      out.write("                                                <span></span>Xoá\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                            ");
 
                                i++; 
                            }    
                            
      out.write("\r\n");
      out.write("                        </table>\r\n");
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
}
