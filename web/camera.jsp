<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.UserDAOImple"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAOImple"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
         <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Máy ảnh</title>
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <%
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
        %>
        <jsp:include page="header.jsp"></jsp:include> 
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">                      
                        <div class="col-md-12">
                            <div class="section-title">
                                <h3 class="title">MÁY ẢNH</h3>                                
                            </div>
                            <div class="row">
                                <div class="products-tabs">
                                    <div id="tab1" class="tab-pane active">
                                        <div class="products-slick" data-nav="#slick-nav-1">
                                            <%
                                                ProductDAOImple productDAO4 = new ProductDAOImple();
                                                for (Product p : productDAO4.getListByCategory(4)) {
                                                    int rating_avg = productDAO4.ratingAvgReviewProduct(p.getMa_san_pham());
                                                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                                            %>
                                            <div class="product">
                                                <div class="product-img">
                                                    <img src="image/<%=p.getHinh_anh_1()%>" alt="" >
                                                    <div class="product-label">
                                                    <% int sale;
                                                        if(p.getSale() != 0) { 
                                                            sale = (int)(p.getSale()*100);
                                                    %>
                                                        <span class="sale">-<%=sale%>%</span>
                                                    <% } %>
                                                    </div>
                                                </div>                                         
                                                <div class="product-body">
                                                    <p class="product-category">TV</p>
                                                    <h3 class="product-name"><a href="product.jsp?ma_san_pham=<%=p.getMa_san_pham()%>"><%=p.getTen_san_pham()%></a></h3>
                                                    <h4 class="product-price"><%=formatter.format((int)(p.getGia_ban() * (1 - p.getSale())))%> VNĐ</h4>
                                                    <div class="product-rating">
                                                        <% if(rating_avg != 0) { 
                                                        for(int j=1 ;j<= rating_avg; j++) { %>
                                                        <i class="fa fa-star"></i>
                                                        <% }
                                                        } else { %>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                        <% } %>
                                                    </div>                                                 
                                                    <% if(username != null) { %>
                                                        <form action="WishlistServlet" method="post">
                                                            <div class="product-btns">                                                 
                                                                <input type="hidden" value="<%=id%>" name="ma_nguoi_dung"/>
                                                                <input type="hidden" value="<%=p.getMa_san_pham()%>" name="ma_san_pham"/>
                                                                <input type="hidden" value="<%=p.getTen_san_pham()%>" name="ten_san_pham" />
                                                                <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">Yêu thích</span></button>                                                                                                    
                                                            </div>
                                                        </form>
                                                        <%} else { %>
                                                        <form action="signin.jsp">
                                                            <div class="product-btns">
                                                                <button class="add-to-wishlist">
                                                                    <i class="fa fa-heart-o"></i>
                                                                    <span class="tooltipp">Yêu thích</span>
                                                                </button>
                                                            </div>
                                                        </form>
                                                    <% } %>                                          
                                                </div>                                                                                   
                                            </div> 
                                            <%
                                                }
                                            %>    
                                        </div>
                                    </div>                                   
                                </div>                                  
                            </div> 
                            <div id="slick-nav-1" class="products-slick-nav"></div>                  
                        </div>                                          
                    </div>                                
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
