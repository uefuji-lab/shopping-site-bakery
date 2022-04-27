package main;

import bean.Item;
import bean.Product;
import tool.Action;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

public class CartChangeAction extends Action{

    @SuppressWarnings("unchecked")
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    )throws Exception{

        HttpSession session = request.getSession();

        int id = Integer.parseInt(request.getParameter("id"));
        int count = Integer.parseInt(request.getParameter("count"));
        int price = Integer.parseInt(request.getParameter("price"));


        List<Item> cart = (List<Item>)session.getAttribute("cart");
            for(Item i : cart){
                if(i.getProduct().getId()==id){
                    cart.remove(i);
                    i.setCount(count);
                    i.setPrice(price * count);
                    cart.add(i);
                    break;
                }
            }
            return "cart.jsp";

    }
}
