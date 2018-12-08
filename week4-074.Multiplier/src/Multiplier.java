/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Multiplier {
    private int number;
          
    
    public Multiplier(int num){
        this.number = num;
        
    }
    
    public int multiply(int otherNumber) {
        return (this.number * otherNumber);
    }
    
}
