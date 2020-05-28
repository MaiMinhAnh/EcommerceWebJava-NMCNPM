package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;
import java.util.List;
import java.sql.Date;
import model.Review;
import model.Product;
import java.text.DecimalFormat;
import dao.UserDAOImple;
import java.text.NumberFormat;
import dao.ProductDAOImple;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Sản phẩm</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String error = "";
            if (request.getAttribute("error") != null) {
                    error = (String) request.getAttribute("error");
            }
            
            String ma_san_pham = "";
            String ten_ma_loai_san_pham = "";
            String username = null;
            Cookie[] cookies = request.getCookies();
            if(cookies !=null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("username")) 
                        username = cookie.getValue();
                }
            }
            
            //lấy mã người dùng
            UserDAOImple userDAO = new UserDAOImple();
            User u = userDAO.getUser(username);
            int id = u.getMa_nguoi_dung();
            
            //lấy mã sản phẩm
            if (request.getParameter("ma_san_pham") != null) {
                    ma_san_pham = request.getParameter("ma_san_pham");
            }          
            
            //định dạng tiền
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumFractionDigits(0);
            DecimalFormat formatter = new DecimalFormat("###,###,###");
        
            //tính toán lượng rating
            ProductDAOImple productDAO = new ProductDAOImple();
            Product p = productDAO.getProduct(Integer.parseInt(ma_san_pham));
            
            List<Review> list = productDAO.getListReviewProduct(Integer.parseInt(ma_san_pham));
            int rating_avg = 0;
            int sum = 0;
            int rating[] = {0,0,0,0,0,0};
            if(list.size() != 0) { 
                for(int i=0; i<list.size(); i++) {
                    if(list.get(i).getSo_luong_sao() == 0) rating[0]++;
                    if(list.get(i).getSo_luong_sao() == 1) rating[1]++;
                    if(list.get(i).getSo_luong_sao() == 2) rating[2]++;
                    if(list.get(i).getSo_luong_sao() == 3) rating[3]++;
                    if(list.get(i).getSo_luong_sao() == 4) rating[4]++;
                    if(list.get(i).getSo_luong_sao() == 5) rating[5]++;
                }
                sum = rating[0] + rating[1] + rating[2] + rating[3] + rating[4] + rating[5];
            }
            if(sum != 0) { 
                rating_avg = (rating[0]*0 + rating[1]*1 + rating[2]*2 + rating[3]*3 + rating[4]*4 +rating[5]*5)/sum;
            }
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"product-details\">\r\n");
      out.write("                        <h2 class=\"product-name\">TÊN SẢN PHẨM: ");
      out.print(p.getTen_san_pham());
      out.write("</h2>\r\n");
      out.write("                        <div>      \r\n");
      out.write("                            <div class=\"product-rating\">\r\n");
      out.write("                                Đánh giá: \r\n");
      out.write("                                ");
 for(int j=1 ;j<=rating_avg; j++) { 
      out.write("\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                                ");
 for(int k=1 ;k<=(5-rating_avg); k++) { 
      out.write("\r\n");
      out.write("                                    <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h3 class=\"product-price\">\r\n");
      out.write("                                ");
      out.print(formatter.format((int)(p.getGia_ban() * (1 - p.getSale()))));
      out.write(" VNĐ \r\n");
      out.write("                                ");
 if(p.getSale() != 1) { 
      out.write("\r\n");
      out.write("                                <del class=\"product-old-price\">");
      out.print(formatter.format((int)(p.getGia_ban())));
      out.write(" VNĐ</del>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>&MediumSpace;</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-5 col-md-push-2\">\r\n");
      out.write("                        <div id=\"product-main-img\">\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_1());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_2());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_3());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_4());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_5());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                    </div>                    \r\n");
      out.write("                    <div class=\"col-md-2  col-md-pull-5\">\r\n");
      out.write("                        <div id=\"product-imgs\">\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_1());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_2());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_3());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_4());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-preview\">\r\n");
      out.write("                                <img src=\"image/");
      out.print(p.getHinh_anh_5());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-5\">\r\n");
      out.write("                        ");
 if(username != null) { 
      out.write("\r\n");
      out.write("                            <div class=\"order-details\">\r\n");
      out.write("                                <div class=\"section-title text-center\">\r\n");
      out.write("                                        <h3 class=\"title\">ĐẶT HÀNG</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <form  action=\"CartServlet\" method=\"post\">\r\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"ma_nguoi_dung\"/>\r\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(username);
      out.write("\" name=\"username\"/>\r\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(ma_san_pham);
      out.write("\" name=\"ma_san_pham\" />\r\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(p.getSale());
      out.write("\" name=\"sale\" />\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Tên sản phẩm:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"input\" readonly value=\"");
      out.print(p.getTen_san_pham());
      out.write("\" name=\"ten_san_pham\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Số lượng:</label>\r\n");
      out.write("                                        <input type=\"number\" min=\"1\" value=\"1\" class=\"input\" name=\"so_luong\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Giá bán:</label>\r\n");
      out.write("                                        <input type=\"text\" readonly=\" \"class=\"input\" name=\"gia_ban\" value=\"");
      out.print((int)p.getGia_ban());
      out.write("\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Số điện thoại:</label>\r\n");
      out.write("                                        <input class=\"input\" type=\"text\" value=\"");
      out.print( u.getSdt());
      out.write("\" onfocus=\"this.value = '';\"\r\n");
      out.write("                                        onblur=\"if (this.value == '') {this.value = '");
      out.print(u.getSdt());
      out.write("';}\" name=\"sdt\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Địa chỉ:</label>\r\n");
      out.write("                                        <input class=\"input\" type=\"text\" value=\"");
      out.print( u.getDia_chi());
      out.write("\" onfocus=\"this.value = '';\"\r\n");
      out.write("                                            onblur=\"if (this.value == '') {this.value = '");
      out.print(u.getDia_chi());
      out.write("';}\" name=\"dia_chi\" />\r\n");
      out.write("                                    </div>                                  \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <button class=\"primary-btn order-submit center-block\">ĐẶT HÀNG</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>   \r\n");
      out.write("                        ");
 
                        } else { 
                        
      out.write("\r\n");
      out.write("                            <div class=\"alert alert-info\">Vui lòng <a href=\"signin.jsp\">đăng nhập</a> để tiếp tục...</div>\r\n");
      out.write("                        ");
 } 
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div id=\"product-tab\">\r\n");
      out.write("                            <ul class=\"tab-nav\">\r\n");
      out.write("                                <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab1\">Mô tả</a></li>\r\n");
      out.write("                                <li><a data-toggle=\"tab\" href=\"#tab2\">Chi tiết</a></li>\r\n");
      out.write("                                <li><a data-toggle=\"tab\" href=\"#tab3\">Đánh giá</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"tab-content\">\r\n");
      out.write("                                <!-- tab1  -->\r\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane fade in active\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-12\">\r\n");
      out.write("                                            <p>Realme 2 Pro là một chiếc điện thoại tầm trung được đánh giá là một trong những dòng điện thoại tầm trung đáng giá mua nhất, với cấu hình và thiết kế của chiếc điện thoại cận cao cấp.</p>\r\n");
      out.write("                                            <p>Màn hình của Realme 2 Pro có thiết kế giống như Oppo F9 với phần tai thỏ hình giọt nước chỉ đủ chứa camera selfie, thiết kế này giúp tối ưu diện tích sử dụng màn hình. So với các đối thủ tầm trung khác thì cạnh dưới của màn hình máy mỏng hơn.</p>\r\n");
      out.write("                                            <p>Mặt lưng của máy được hãng sử dụng chất liệu nhựa bóng nhưng không bị cảm giác rẻ tiền. Tuỳ vào góc nhìn và điều kiện ánh sáng mặt lưng sẽ có các màu khác nhau. Các cạnh của máy được bo cong để người dùng cầm nắm chắc chắn hơn. Do mặt lưng của máy là kính nên dễ để lại vân tay, các bạn nên sử dụng ốp để mặt lưng được thẩm mỹ hơn. Camera kép của máy lồi lên được đặt nằm ngang phía bên trái của máy và ngay phía dưới là cảm biến vân tay.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div id=\"tab2\" class=\"tab-pane fade in\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-12\">\r\n");
      out.write("                                            <p>Realme 2 Pro được trang bị vi xử lý Qualcomm Snapdragon 660 8 nhân mạnh mẽ. Đây là con chip thuộc phân khúc điện thoại cao cấp nên không ngạc nhiên khi điểm đo hiệu năng của máy từ AnTuTu lên đến hơn 130.000 điểm. Máy có bộ nhớ trong là 64GB và RAM 6GB. Thoải mái để người dùng chiến các game có cấu hình đồ hoạ nặng như: Liên quân mobile, Alphat 9, PUBG mobile, …. mà không bị lag giật, máy sau khi chơi cũng không bị quá nóng mà chỉ hơi ấm.</p>\r\n");
      out.write("                                            <p>Dung lượng pin của máy lên đến 3500mAh. Đủ để đáp ứng cho người dùng lướt Instagram, Facebook, zalo, … trong một ngày dài sử dụng mà không cần sạc.</p>\r\n");
      out.write("                                            <p>Realme 2 Pro được cài đặt hệ điều hành Android 8.1 (Oreo) với giao diện Color OS 5.2. Và máy cũng được hỗ trợ cài đặt điều khiển bằng cử chỉ thay cho các hành động vuốt cùng với một số tiện ích khác như chế độ lái xe thông minh (tắt tiếng thông báo khi bạn đang lái xe), tối ưu hoá các phần mềm chạy ngầm giúp tiết kiệm pin…</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>                            \r\n");
      out.write("                                <div id=\"tab3\" class=\"tab-pane fade in\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div id=\"rating\">\r\n");
      out.write("                                                <div class=\"rating-avg\">\r\n");
      out.write("                                                    <span>");
      out.print(rating_avg);
      out.write("</span>\r\n");
      out.write("                                                    <div class=\"rating-stars\">\r\n");
      out.write("                                                        ");
 for(int j=1 ;j<=rating_avg; j++) { 
      out.write("\r\n");
      out.write("                                                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                        ");
 } 
      out.write("\r\n");
      out.write("                                                        ");
 for(int k=1 ;k<=(5-rating_avg); k++) { 
      out.write("\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        ");
 } 
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"rating\">\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 100%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[5]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 80%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[4]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 60%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[3]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 40%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[2]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 20%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[1]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <div class=\"rating-stars\">\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"rating-progress\">\r\n");
      out.write("                                                            <div style=\"width: 0%;\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <span class=\"sum\">");
      out.print(rating[0]);
      out.write("</span>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <div id=\"reviews\">\r\n");
      out.write("                                                <ul class=\"reviews\">\r\n");
      out.write("                                                    <h4>Đánh giá mới nhất</h4>\r\n");
      out.write("                                                    ");
                                                                                                          
                                                        int temp = list.size();
                                                        if(temp >= 3) {
                                                        for (int i=temp-3; i<temp; i++) {
                                                            Review r = list.get(i);                                                                      
                                                            int t = r.getSo_luong_sao();
                                                            int f = 5 - t;                                                         
                                                    
      out.write("\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                            <div class=\"review-heading\">\r\n");
      out.write("                                                                <h5 class=\"name\">");
      out.print(r.getTen_nguoi_danh_gia());
      out.write("</h5>\r\n");
      out.write("                                                                <p class=\"date\">");
      out.print(r.getThoi_gian());
      out.write("</p>\r\n");
      out.write("                                                                <div class=\"review-rating\">\r\n");
      out.write("                                                                    ");
 for(int j=1 ;j<=t; j++) { 
      out.write("\r\n");
      out.write("                                                                        <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                                    ");
 } 
      out.write("\r\n");
      out.write("                                                                    ");
 for(int k=1 ;k<=f; k++) { 
      out.write("\r\n");
      out.write("                                                                        <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                                    ");
 } 
      out.write("\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"review-body\">\r\n");
      out.write("                                                                <p>");
      out.print(r.getDanh_gia());
      out.write("</p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </li>   \r\n");
      out.write("                                                    ");
 }} else if(temp == 1 || temp == 2) { 
                                                        for(int i=0; i<temp; i++) {
                                                            Review r = list.get(i);                                                                      
                                                            int t = r.getSo_luong_sao();
                                                            int f = 5 - t;
                                                        
      out.write("\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                            <div class=\"review-heading\">\r\n");
      out.write("                                                                <h5 class=\"name\">");
      out.print(r.getTen_nguoi_danh_gia());
      out.write("</h5>\r\n");
      out.write("                                                                <p class=\"date\">");
      out.print(r.getThoi_gian());
      out.write("</p>\r\n");
      out.write("                                                                <div class=\"review-rating\">\r\n");
      out.write("                                                                    ");
 for(int j=1 ;j<=t; j++) { 
      out.write("\r\n");
      out.write("                                                                        <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                                    ");
 } 
      out.write("\r\n");
      out.write("                                                                    ");
 for(int k=1 ;k<=f; k++) { 
      out.write("\r\n");
      out.write("                                                                        <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                                                                    ");
 } 
      out.write("\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"review-body\">\r\n");
      out.write("                                                                <p>");
      out.print(r.getDanh_gia());
      out.write("</p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </li>   \r\n");
      out.write("                                                    ");
 }} 
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div id=\"review-form\">\r\n");
      out.write("                                                <div style=\"color: red\">");
      out.print(error);
      out.write("</div>\r\n");
      out.write("                                                <form class=\"review-form\" action=\"ReviewServlet\" method=\"post\">                                        \r\n");
      out.write("                                                    <input type=\"hidden\" name=\"ma_san_pham\" value=\"");
      out.print(ma_san_pham);
      out.write("\">\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"username\" value=\"");
      out.print(username);
      out.write("\">\r\n");
      out.write("                                                    <input class=\"input\" type=\"text\" placeholder=\"Tên\" name=\"name\">\r\n");
      out.write("                                                    <input class=\"input\" type=\"email\" placeholder=\"Địa chỉ email\" name=\"email\">\r\n");
      out.write("                                                    <textarea class=\"input\" placeholder=\"Đánh giá\" name=\"reviewtext\"></textarea>\r\n");
      out.write("                                                    <div class=\"input-rating\">\r\n");
      out.write("                                                        <span>Đánh giá: </span>\r\n");
      out.write("                                                        <div class=\"stars\">\r\n");
      out.write("                                                            <input id=\"star5\" name=\"rating\" value=\"5\" type=\"radio\"><label for=\"star5\"></label>\r\n");
      out.write("                                                            <input id=\"star4\" name=\"rating\" value=\"4\" type=\"radio\"><label for=\"star4\"></label>\r\n");
      out.write("                                                            <input id=\"star3\" name=\"rating\" value=\"3\" type=\"radio\"><label for=\"star3\"></label>\r\n");
      out.write("                                                            <input id=\"star2\" name=\"rating\" value=\"2\" type=\"radio\"><label for=\"star2\"></label>\r\n");
      out.write("                                                            <input id=\"star1\" name=\"rating\" value=\"1\" type=\"radio\"><label for=\"star1\"></label>                                                         \r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <button class=\"primary-btn\">Gửi</button>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
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
