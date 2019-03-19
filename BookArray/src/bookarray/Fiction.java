/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookarray;

/**
 *
 * @author Aaron
 */
//derived class
public class Fiction extends Book{
    
    //constructor for fiction, setting title
    public Fiction(String t){
        
        super(t);
    }
    
    //setPrice method for fiction books
    public void setPrice(){
        
        price = 24.99;
    }
}
