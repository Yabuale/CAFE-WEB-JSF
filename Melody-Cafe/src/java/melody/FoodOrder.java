/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author hp
 */
@ManagedBean
public class FoodOrder {
    
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private String s7;
    private String s8;
    private String s9;
    private String userName;
    private String adress;
    
          
    public FoodOrder(){
        
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getS6() {
        return s6;
    }

    public void setS6(String s6) {
        this.s6 = s6;
    }

    public String getS7() {
        return s7;
    }

    public void setS7(String s7) {
        this.s7 = s7;
    }

    public String getS8() {
        return s8;
    }

    public void setS8(String s8) {
        this.s8 = s8;
    }

    public String getS9() {
        return s9;
    }

    public void setS9(String s9) {
        this.s9 = s9;
    }

   
    String chec="";
    public void nullValidator( String s){
        if(s!=null){
            chec=chec+" "+s;
        }
        else{
            chec=chec;
        }
    }
   
    public String methd2(){
        nullValidator( s1);
        nullValidator( s2);
        nullValidator( s3);
        nullValidator( s4);
        nullValidator( s5);
        nullValidator( s6);
        nullValidator( s7);
        nullValidator( s8);
        nullValidator( s9);
        
       
     
    
      String sql2="insert into ORDERS(USERNAME,FOOD,ADRESS,DELIVERY,STATUS) values ('"+userName+"','"+chec+"','"+adress+"','pending...','pendng...')";
        
        Statement s6;
        try {
           
            s6 = DBConnection.connMethod().createStatement();
          
            s6.executeQuery(sql2);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "CustomerPage.xhtml";
        
    }

   
}
