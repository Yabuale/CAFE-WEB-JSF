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
  
@ManagedBean(name = "delivery")  
@RequestScoped  
public class Delivery {    
public List<food> deliveryList;  
public List<food> getDeliveryList() {  
    deliveryList = new ArrayList<>(); 
    String sql="SELECT * FROM ORDERS WHERE STATUS = 'pendng...'";
   
        Statement s5;
        
    try {
        s5 = DBConnection.connMethod().createStatement();
        ResultSet re = s5.executeQuery(sql);
        while (re.next()) {
                         String USERNAME = re.getString("USERNAME");
                        String FOOD = re.getString("FOOD");
                        String ADRESS = re.getString("ADRESS");
                        String DELIVERY = re.getString("DELIVERY");
                        String STATUS = re.getString("STATUS");
                        
                        
                   deliveryList.add(new food(USERNAME,FOOD,ADRESS,DELIVERY,STATUS));

        }
                        
                        
                    
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    }
           
        
   
 
 
return deliveryList;  
}    
}  