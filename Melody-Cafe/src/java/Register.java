/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author hp
 */
@Named(value = "register")
@Dependent
public class Register implements Serializable{

private String userName;

public void setUserName(String userName) {
        this.userName = userName;
    }

public String getUserName() {
        return userName;
    }
    
private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
private String lname;

    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getLname() {
        return lname;
    }
private String email;

    public void setEmail(String email) {
        this.email =email;
    }
    public String getEmail() {
        return email;
    }

private String phone;

    public void setPhone(String phone) {
        this.phone =phone;
    }
    public String getPhone() {
        return phone;
    }
private String adress;

    public void setAdress(String adress) {
        this.adress =adress;
    }
    public String getAdress() {
        return adress;
    }
private String pwd;
    public void setPwd(String pwd) {
        this.pwd =pwd;
    }
    public String getPwd() {
        return pwd;
    }

private String conform;
public String getConform() {
        return conform;
    }
    public void setConform(String conform) {
        this.conform =conform;
    }
    
    
    public void btn(){
        String s1=userName;
      String sql="insert into USERS(USERNAME,NAME,FNAME,EMAIL,PHONE,ADDRESS,ROLE) values ('"+s1+"','"+name+"','"+getLname()+"','"+email+"','"+phone+"','"+adress+"','USER')";
    try {
        Statement s5= DBConnection.connMethod().createStatement();
        s5.executeQuery(sql);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 
}
