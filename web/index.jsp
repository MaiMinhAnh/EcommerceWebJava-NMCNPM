<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.UserDAOImple"%>
<%@page import="dao.ProductDAOImple"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">       
         <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>5Star</title>
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
            int product_id;
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
            ProductDAOImple productDAO = new ProductDAOImple();
        %>
        <jsp:include page="header.jsp"></jsp:include>       
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title">
                            <h3 class="title">SẢN PHẨM MỚI</h3>                                
                        </div>
                    </div>
                    
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4 class="title">ĐIỆN THOẠI</h4>                                
                        </div>
                        
                        <div class="row">                          
                            <div class="products-tabs">
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick">                                                                         
                                        <%
                                            for (Product p : productDAO.getListByCategory(1)) {
                                                int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
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
                                                <p class="product-category">ĐIỆN THOẠI</p>
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
                                                    <div class="product-btns">
                                                        <button class="add-to-wishlist" data-toggle="modal" data-target="#<%=p.getMa_san_pham()%>"><i class="fa fa-shopping-cart"></i><span class="tooltipp">Mua ngay</span></button>                                                                                                           
                                                        <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">So sánh</span></button>
                                                        <button class="quick-view"><i class="fa fa-heart-o"></i><span class="tooltipp">Yêu thích</span></button>
                                                        
                                                        <div class="modal fade" id="<%=p.getMa_san_pham()%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                                            <div class="modal-dialog modal-dialog-centered" role="document">
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <h5 class="modal-title" id="exampleModalCenterTitle">Modal title</h5>
                                                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                            <span aria-hidden="true">&times;</span>
                                                                        </button>
                                                                    </div>
                                                                    <div class="modal-body">
                                                                        ...
                                                                    </div>
                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                                        <button type="button" class="btn btn-primary">Save changes</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>  
                                                    </div>                                                    
                                                <%} else { %>
                                                <form action="signin.jsp">
                                                    <div class="product-btns">
                                                        <button class="add-to-wishlist"><i class="fa fa-shopping-cart"></i><span class="tooltipp">Mua ngay</span></button>
                                                        <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">So sánh</span></button>
                                                        <button class="quick-view"><i class="fa fa-heart-o"></i><span class="tooltipp">Yêu thích</span></button>
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
                    </div>                
                                    
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4 class="title">TV</h4>                                
                        </div>
                        
                        <div class="row">
                            <div class="products-tabs">
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick" data-nav="#slick-nav-1">
                                        <%  
                                            for (Product p : productDAO.getListByCategory(2)) {                                               
                                                int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
                                                DecimalFormat formatter = new DecimalFormat("###,###,###");
                                        %>
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="image/<%=p.getHinh_anh_1()%>" alt="">
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
                                                    <div class="product-btns" type="button" data-toggle="modal" data-target="#exampleModalCenter">                                                 
                                                        <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">Yêu thích</span></button>  
                                                        <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">So sánh</span></button>
                                                        <button class="quick-view"><i class="fa fa-shopping-cart"></i><span class="tooltipp">Mua ngay</span></button>
                                                    </div>
                                                <%} else { %>
                                                    <form action="signin.jsp">
                                                        <div class="product-btns">
                                                            <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">Yêu thích</span></button>  
                                                            <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">So sánh</span></button>
                                                            <button class="quick-view"><i class="fa fa-shopping-cart"></i><span class="tooltipp">Mua ngay</span></button>
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
                    </div>
                    
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4 class="title">MÁY TÍNH</h4>                                
                        </div>
                        <div class="row">
                            <div class="products-tabs">
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick" data-nav="#slick-nav-1">
                                        <%
                                            for (Product p : productDAO.getListByCategory(3)) {
                                                int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
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
                                                <p class="product-category">MÁY TÍNH</p>
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
                    </div>
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4 class="title">MÁY ẢNH</h4>                                
                        </div>
                        <div class="row">
                            <div class="products-tabs">
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick" data-nav="#slick-nav-1">
                                        <%
                                            for (Product p : productDAO.getListByCategory(4)) {
                                                int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
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
                                                <p class="product-category">MÁY ẢNH</p>
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
                    </div>
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4 class="title">MÁY TÍNH BẢNG</h4>                                
                        </div>
                        <div class="row">
                            <div class="products-tabs">
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick" data-nav="#slick-nav-1">
                                        <%
                                            for (Product p : productDAO.getListByCategory(5)) {
                                                int rating_avg = productDAO.ratingAvgReviewProduct(p.getMa_san_pham());
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
                                                <p class="product-category">MÁY TÍNH BẢNG</p>
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
                    </div>                 
                </div>
            </div>
        </div>
        <script>
            function openForm(e) {
                $('#e').modal('show');
            }         
        </script>
                      
        <jsp:include page="footer.jsp"></jsp:include>       
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>  
        
    </body>
</html>

