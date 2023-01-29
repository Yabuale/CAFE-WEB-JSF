/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hp
 */
@ManagedBean
public class Stat {
    int female1;
    int male1;
    int  male;
    int female;
    int pending;
    int delivered;
    int ontsway;
      
    public Stat(){
        
    }

    public int getFemale1() {
        return female1;
    }

    public int getMale1() {
        return male1;
    }

    public int getMale() {
        return male;
    }

    public int getFemale() {
        return female;
    }

    public int getPending() {
        return pending;
    }

    public int getDelivered() {
        return delivered;
    }

    public int getOntsway() {
        return ontsway;
    }
    

   
   
    
     public static int female1() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(SEX) FROM EMPLOYEE WHERE SEX= 'Female'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(SEX)");
                    i=parseInt(s1);



                }
            
        return i;

    
        }
     public static int male1() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(SEX) FROM EMPLOYEE WHERE SEX= 'Male'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(SEX)");
                    i=parseInt(s1);



                }
            
        return i;

    
        }
      public static int female() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(SEX) FROM CSTOMER WHERE SEX= 'Female'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(SEX)");
                    i=parseInt(s1);



                }
            
        return i;

    
        }
     public static int male() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(SEX) FROM CSTOMER WHERE SEX= 'Male'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(SEX)");
                    i=parseInt(s1);
                }
            
        return i;

    
        }
      public static int pending() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(STATUS) FROM ORDERS WHERE STATUS= 'pendng...'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(STATUS)");
                    i=parseInt(s1);
                }
            
        return i;

    
        }
       public static int delivered() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(STATUS) FROM ORDERS WHERE STATUS= 'DEIVERED'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(STATUS)");
                    i=parseInt(s1);
                }
            
        return i;

    
        }
        public static int ontsway() throws SQLException, ClassNotFoundException{
        int i=0;

        
        String query = "SELECT COUNT(STATUS) FROM ORDERS WHERE STATUS= 'ON THE WAY'";
         Statement s5;
          s5 = DBConnection.connMethod().createStatement();
          ResultSet re = s5.executeQuery(query);

  
                
                while (re.next()) {
                    String s1=re.getString("COUNT(STATUS)");
                    i=parseInt(s1);
                }
            
        return i;

    
        }
     public String method() throws SQLException, ClassNotFoundException{
        
        female1= female1();
        male1=male1();
        male=male();
        female=female(); 
        pending=pending();
        delivered=delivered();
        ontsway=ontsway();
        
        return "StatPage.xhtml";
             
     }
    
  

}
    

