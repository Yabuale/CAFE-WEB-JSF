/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;
/**
 *
 * @author hp
 */
public class Customer {  
private String userName;    
private String name;
private String fname;   
private String email;   
private String phone;   
private String adress;   
private String sex;   


public Customer(String userName,String name,String fname,String email,String phone,String adress,String sex ) {    
this.userName=userName;
this.name = name; 
this.fname = fname; 
this.email= email;
this.phone = phone;
this.adress = adress;
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

   
  

    public String getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }

    


}    
