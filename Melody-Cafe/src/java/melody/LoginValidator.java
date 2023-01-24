/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import oracle.jdbc.util.Login;

/**
 *
 * @author hp
 */
@ManagedBean
public class LoginValidator{
    private String userName;
    private String password;
    
    public LoginValidator(){
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String valdate(){
        
        String sql="SELECT * FROM USERS WHERE NAME='"+userName+"' AND PASSWORD='"+password+"'";
        Statement s5;
        try {
            s5 = DBConnection.connMethod().createStatement();
            ResultSet re = s5.executeQuery(sql);
            if(re.next()){
                String Type = re.getString("TYPE");
                if("CUSTOMER".equals(Type)){
                    return "CustomerPage.xhtml";
                    
                }
                else if("ADMIN".equals(Type)){
                 return "AdminPage.xhtml";
                }
                else{
                return "DeliveryPage.xhtml";
                }
            }
            else{ return "RegisterPage.xhtml";}
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "index.xhtml";
        
    }
    
    
}
