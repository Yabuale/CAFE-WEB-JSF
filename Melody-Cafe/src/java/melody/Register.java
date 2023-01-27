/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    private String sex;
    List<String> sexList;
    private String password;
    private String conf;
    

    
    
     public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public List<String> getSexList(){
        return sexList;
    }

    public void setSexList(List<String> sexList) {
        this.sexList = sexList;
    }
    public Register(){
         sexList = new ArrayList<>(); 
       sexList.add("Male");
       sexList.add("Female");
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }
     

  
    public String btn(){
        
      String sql="insert into CSTOMER(USERNAME,NAME,FNAME,EMAIL,PHONE,ADDRESS,SEX) values ('"+userName+"','"+name+"','"+lname+"','"+email+"','"+phone+"','"+adress+"','"+sex+"')";
      String sql2="insert into USERS(NAME,PASSWORD,TYPE) values ('"+userName+"','"+password+"','CUSTOMER')";
        Statement s5;
        Statement s6;
        try {
            s5 = DBConnection.connMethod().createStatement();
            s6 = DBConnection.connMethod().createStatement();
            s5.executeQuery(sql);
            s6.executeQuery(sql2);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "index.xhtml";
   
    }
    
    
    
}
