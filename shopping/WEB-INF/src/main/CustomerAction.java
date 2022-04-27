package main;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;



public class CustomerAction extends Action{
    @SuppressWarnings("unchecked")
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    )throws Exception{
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String number = request.getParameter("number");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if(name.isEmpty() || address.isEmpty() || number.isEmpty() || login.isEmpty() || password.isEmpty()){
            return "customer-error-empty.jsp";
        }

        CustomerDAO dao = new CustomerDAO();
        if(!dao.insert(name, address, number, login, password)){
            return "customer-error-insert.jsp";
        }
        
        session.removeAttribute("data");
        return "customer-out.jsp";
    }
}