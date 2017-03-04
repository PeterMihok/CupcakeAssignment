/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.SQLException;

/**
 *
 * @author peter
 */
public class main {
    
    public static void main(String[] args) throws SQLException {
        DataMapper dm = new DataMapper();
        dm.customerSignUp("Peter", "peterpp", "peter", "peter@peter.com", "123456");
    }
}
