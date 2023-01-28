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
    int female1=4;
    int male1=4;
    int  male=4;
    int female=4;
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
     public String method() throws SQLException, ClassNotFoundException{
        
        female1= female1();
        male1=male1();
        male=male();
        female=female(); 
        
        return "StatPage.xhtml";
             
     }
    
  

}
    

