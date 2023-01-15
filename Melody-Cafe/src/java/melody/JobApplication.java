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
public class JobApplication {
    
    private String name;
    private String lname;
    private String email;
    private String phone;
    private String adress;
    private String exp;
    private String sex;
    
    
    
    List<String> sexList;
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

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

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
    public JobApplication(){
       sexList = new ArrayList<>(); 
       sexList.add("Male");
       sexList.add("Female");
    }
    
    public void insert(){
         String sql="insert into APPICANTS (NAME,FNAME,EMAIL,PHONE,ADRESS,EXP,SEX) values ('"+name+"','"+lname+"','"+email+"','"+phone+"','"+adress+"','"+exp+"','"+sex+"')";
   
        Statement s5;
        try {
            s5 = DBConnection.connMethod().createStatement();
            s5.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
