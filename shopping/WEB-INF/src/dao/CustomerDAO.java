package dao;

import bean.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;




public class CustomerDAO extends DAO{
    public Customer search(String login, String password)
        throws Exception{
            Customer customer = null;
            Connection con = getConnection();
            PreparedStatement st;
            st=con.prepareStatement(
                "select * from customer where login=? and password=?");
            st.setString(1, login);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            while(rs.next()){
                customer = new Customer();
                customer.setLogin(rs.getString("login"));
                customer.setPassword(rs.getString("password"));
            }

            st.close();
            con.close();
            return customer;
        }

    public boolean insert(String name, String address, String number, String login, String password)throws Exception{
        Connection con = getConnection();
        con.setAutoCommit(false);

        PreparedStatement st=con.prepareStatement(
            "insert into customer (NAME, ADDRESS, PHONE_NUMBER, LOGIN, PASSWORD) values(?, ?, ?, ?, ?)");
        st.setString(1, name);
        st.setString(2, address);
        st.setString(3, number);
        st.setString(4, login);
        st.setString(5, password);

        int line = st.executeUpdate();
        st.close();

            if(line != 1){
                 con.rollback();
                 con.setAutoCommit(true);
                 con.close();
                 return false;
            }
            
        con.commit();
        con.setAutoCommit(true);
        con.close();
        return true;
    }
    
}
