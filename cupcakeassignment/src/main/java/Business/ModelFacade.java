package Business;

import Data.DataMapper;
import java.sql.SQLException;

/**
 The purpose of ModelFacade is to...

 @author peter
 */
public class ModelFacade {

    private DataMapper dm = new DataMapper();
    
    public ModelFacade() {
        
    }

    public static void validate( String username, String password ) throws LoginError {
        if ( password.equals( password ) ) {
            return;
        }
        throw new LoginError();
    }

    public static String[] getToppings() {
        String[] toppings = { "Chocolate", "Blueberry", "Rasberry", "Crispy", "Strawberry", "Rum/Raisin", "Orange", "Lemon", "Blue cheese" };
        return toppings;
    }

    public static String[] getBottoms() {
        String[] bottoms = { "Chocolate", "Vanilla", "Nutmeg", "Pistacio", "Almond" };
        return bottoms;
    }
    
    public void customerSignUp(String name, String username, String password, String email, String phone) throws SQLException, NullPointerException{
        dm.customerSignUp(name, username, password, email, phone);
    }
    
    public Customer customerLogin(String username, String password) throws SQLException, NullPointerException {
        return dm.customerLogin(username, password);
    }

    public Cupcake getCupcake(String topping, String bottom) throws SQLException, NullPointerException {
        return dm.getCupcake(topping, bottom);   
    }
}
