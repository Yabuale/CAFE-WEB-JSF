/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;
/**
 *
 * @author hp
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;  
import java.util.ArrayList;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
  
@ManagedBean(name = "customer")  
@RequestScoped  
public class CustomerTable {    
public List<Customer> customerList;  
public List<Customer> getCustomerList() {  
    customerList = new ArrayList<>(); 
    String sql="SELECT * FROM CSTOMER";
        Statement s5;
        
    try {
        s5 = DBConnection.connMethod().createStatement();
        ResultSet re = s5.executeQuery(sql);
        while (re.next()) {
                         String USERNAME = re.getString("USERNAME");
                        String NAME = re.getString("NAME");
                        String FNAME = re.getString("FNAME");
                        String EMAIL = re.getString("EMAIL");
                        String PHONE = re.getString("PHONE");
                        String ADRESS = re.getString("ADDRESS");
                        
                        String SEX = re.getString("SEX");
                   customerList.add(new Customer(USERNAME,NAME,FNAME,EMAIL,PHONE ,ADRESS ,SEX ));

        }
                        
                        
                    
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    }
           
        
   
 
 
return customerList;  
}    
}  