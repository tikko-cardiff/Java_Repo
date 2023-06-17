/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstjavafxproject;

/**
 *
 * @author E7470
 */
public class TestClass {
    String postcode;
    String phone;
    String name;
    Choice choice;
    
    public TestClass(String postcode,  String phone,  String name, Choice choice){
        this.postcode = postcode;
        this.phone = phone;
        this.name = name;
        this.choice = choice;
    }
    
    @Override
       public String toString(){
        
        String st = "";
        st += "Postcode: " + postcode;
        st += "   Name: " + name;
        st += "   Phone: " + phone;
        st += "   PhoneType: " + choice;
        return st;
        
    }
 
    
}
