/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hp
 */
@ManagedBean
public class Register {
    private String userName;
    private String name;
    private String lname;
    private String email;
    private String phone;
    private String adress;
   

    
    
    
    public Register(){
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

  
    public void btn(){
        
      String sql="insert into USERS(USERNAME,NAME,FNAME,EMAIL,PHONE,ADDRESS,ROLE) values ('"+userName+"','"+name+"','"+lname+"','"+email+"','"+phone+"','"+adress+"','USER')";
   
        Statement s5;
        try {
            s5 = DBConnection.connMethod().createStatement();
            s5.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }
    
    
    
}
