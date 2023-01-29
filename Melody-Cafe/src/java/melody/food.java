/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;
/**
 *
 * @author hp
 */
public class food {  
    
private String userName;
private String food;   
private String address;   
private String delivery;   
private String status;   
  


public food(String userName,String food,String address,String delivery,String status) {      
this.userName = userName; 
this.food = food; 
this.address= address;
this.delivery = delivery;
this.status = status;

    
}  

    public String getUserName() {
        return userName;
    }

    public String getFood() {
        return food;
    }

    public String getAddress() {
        return address;
    }

    public String getDelivery() {
        return delivery;
    }

    public String getStatus() {
        return status;
    }

}    
