/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

/**
 *
 * @author hp
 */import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class login {

    /**
     * Creates a new instance of login
     */
    
    
    public String userName;

public void setuserName(String userName) {
        this.userName = userName;
    }

public String getuserName() {
        return userName;
    }
    
private String Name;
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
private String LName;

    public void setLName(String LName) {
        this.LName = LName;
    }
    public String getLName() {
        return LName;
    }
private String Email;

    public void setEmail(String Email) {
        this.Email =Email;
    }
    public String getEmail() {
        return Email;
    }

private String Phone;

    public void setPhone(String Phone) {
        this.Phone =Phone;
    }
    public String getLPhone() {
        return Phone;
    }
private String Adress;

    public void setAdress(String Adress) {
        this.Adress =Adress;
    }
    public String getAdress() {
        return Adress;
    }
private String Password;
    public void setPassword(String Password) {
        this.Password =Password;
    }
    

private String Conform;
public String getConform() {
        return Adress;
    }
    public void setConform(String Conform) {
        this.Conform =Conform;
    }
    
    
    public String btn(){
        
        
        return LName;
    }
    
}
