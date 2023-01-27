/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melody;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author hp
 */
@ManagedBean
public class FoodOrder {
     private String chec;
            
    public FoodOrder(String chec){
        this.chec=chec;
        
    }
   
    public String methd2(){
        
        return chec;
    }

   
}
