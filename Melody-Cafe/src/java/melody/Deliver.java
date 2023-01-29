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
  
@ManagedBean(name = "delivery2")  
@RequestScoped  
public class Deliver {  
private String userUserName;
private String deliveryGuy;

    public String getUserUserName() {
        return userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    public String getDeliveryGuy() {
        return deliveryGuy;
    }

    public void setDeliveryGuy(String deliveryGuy) {
        this.deliveryGuy = deliveryGuy;
    }

    
    
    
public List<food> deliveryList;  
public List<food> getDeliveryList() {  
    deliveryList = new ArrayList<>(); 
    String sql="SELECT * FROM ORDERS WHERE USERNAME = '"+userUserName+"'";
   
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
public String method(){
    
    String query ="UPDATE ORDERS SET DELIVERY='"+deliveryGuy+"',STATUS= 'ON THE WAY' WHERE USERNAME='"+userUserName+"'";
    
    
    Statement s5;
        
        try {
            s5 = DBConnection.connMethod().createStatement();
            s5.executeQuery(query);
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    return "Delivery2.xhtml";
}
public String method2(){
    String query ="UPDATE ORDERS SET STATUS= 'DEIVERED' WHERE USERNAME='"+userUserName+"'";
    
    
    Statement s5;
        
        try {
            s5 = DBConnection.connMethod().createStatement();
            s5.executeQuery(query);
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
  return "Delivery2.xhtml";  
}
}  