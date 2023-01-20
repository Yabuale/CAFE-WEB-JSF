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
  
@ManagedBean(name = "product")  
@RequestScoped  
public class DataTable {    
public List<Applicant> productsList;  
public List<Applicant> getProductList() {  
    productsList = new ArrayList<>(); 
    String sql="SELECT * FROM APPICANTS";
   
        Statement s5;
        
    try {
        s5 = DBConnection.connMethod().createStatement();
        ResultSet re = s5.executeQuery(sql);
        while (re.next()) {
                        String NAME = re.getString("NAME");
                        String FNAME = re.getString("FNAME");
                        String EMAIL = re.getString("EMAIL");
                        String PHONE = re.getString("PHONE");
                        String ADRESS = re.getString("ADRESS");
                        String EXP = re.getString("EXP");
                        String SEX = re.getString("SEX");
    productsList.add(new Applicant(NAME,FNAME,EMAIL,PHONE ,ADRESS,EXP,SEX ));

        }
                        
                        
                    
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    }
           
        
   
 
 
return productsList;  
}    
}  