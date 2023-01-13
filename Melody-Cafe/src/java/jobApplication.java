/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author hp
 */
@Named(value = "jobApplication")
@Dependent
public class jobApplication {

    /**
     * Creates a new instance of jobApplication
     */
    public jobApplication() {
    }
    public String heloWorld(){
        return "index";
    }
    
}
