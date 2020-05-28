package controller;

import dao.CartDAOImple;
import dao.UserDAOImple;
import dao.WishlistDAOImple;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteUser extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        String error = "";
        int ma_nguoi_dung = Integer.parseInt(request.getParameter("ma_nguoi_dung"));
        UserDAOImple userDAO = new UserDAOImple();    
        boolean check = userDAO.removeUser(ma_nguoi_dung);
        if(check == false){
            error +="Tài khoản này đang có đơn hàng, không thể xoá!";
        }
        if (error.length() > 0) {
            request.setAttribute("error", error);
        }
        
        String url = "/useradmin.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }    
}
       