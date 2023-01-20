/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;
/**
 *
 * @author hp
 */
public class Applicant {  
    
private String name;
private String fname;   
private String email;   
private String phone;   
private String adress;   
private String exp;   
private String sex;   


public Applicant(String name,String fname,String email,String phone,String adress,String exp,String sex ) {      
this.name = name; 
this.fname = fname; 
this.email= email;
this.phone = phone;
this.adress = adress;
this.exp = exp;
this.sex = sex; 
    
}  

public String getName() {  
return name;  
}  

    public String getFname() {
        return fname;
    }

    

    public String getEmail() {
        return email;
    }

    

    public String getPhone() {
        return phone;
    }

    

    public String getAdress() {
        return adress;
    }

    

    public String getExp() {
        return exp;
    }

  

    public String getSex() {
        return sex;
    }


}    
