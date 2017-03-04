package Data;

import Business.Bottom;
import Business.Cupcake;
import Business.Customer;
import Business.Topping;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class DataMapper {

    private final Connection con;

    public DataMapper() {
        con = new DBConnector().getConnection();
    }
    
    public void customerSignUp(String name, String username, String password, String email, String phone) throws SQLException, NullPointerException {
        PreparedStatement createCustomer = null;
        String createCustomerString  = "INSERT INTO customer(name, username, password, email, phone) VALUES (?, ?, ?, ?, ?)";
        createCustomer = con.prepareStatement(createCustomerString);
        con.setAutoCommit(false);
        createCustomer.setString(1, name);
        createCustomer.setString(2, username);
        createCustomer.setString(3, password);
        createCustomer.setString(4, email);
        createCustomer.setString(5, phone);
        int rowAffected = createCustomer.executeUpdate();
        if (rowAffected == 1) {
            con.commit();
        } else {
            con.rollback();
        }
    }

    public Customer customerLogin(String username, String password) throws SQLException, NullPointerException {
        ResultSet rs = null;
        Customer customer = null;
        PreparedStatement getCustomer = null;
        String customerLoginString = "SELECT * FROM customer WHERE username = ? AND password = ?;";
        getCustomer = con.prepareStatement(customerLoginString);
        getCustomer.setString(1, username);
        getCustomer.setString(2, password);
        rs = getCustomer.executeQuery();
        if(rs.next()){
            customer = new Customer(rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5));
        }
        return customer;
    }
    
    public Cupcake getCupcake(String topping, String bottom) throws SQLException{
        ResultSet rs = null;
        Cupcake cupcake = null;
        PreparedStatement getCupcake = null;
        String getCupcakeString = "SELECT topping.name, topping.price, bottom.name, bottom.price FROM topping INNER JOIN topping.name = ? AND bottom.name = ? ";
        getCupcake = con.prepareStatement(getCupcakeString);
        getCupcake.setString(1, topping);
        getCupcake.setString(2, bottom);
        rs = getCupcake.executeQuery();
        if(rs.next()){
            Topping selectedTopping = new Topping(rs.getString(1),
                                  rs.getDouble(2));
            Bottom selectedBottom = new Bottom(rs.getString(3),
                                rs.getDouble(4));
            cupcake = new Cupcake(selectedTopping, selectedBottom);
        }
        return cupcake;
    }
}
