/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Counter {
    private int value;
    private boolean check;
    
    
    public Counter (int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
        }

    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, true);
    }
    
    public Counter() {
        this(0,false);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value++;
    }
    
    public void decrease() {
        
        if (check == false){
            this.value--;
        }
        if (check == true){
            if (this.value <= 0){
                this.value = 0;
            }
            if (this.value > 0) {
                this.value--;
            }
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            this.value = value;
        } else {
            this.value += increaseAmount;
        }
    }
        
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.value -= decreaseAmount;
            }
            if (check == true) {
                if (this.value - decreaseAmount >= 0) {
                    this.value -= decreaseAmount;
                }
                this.value = 0;
            }
        
        }
        
    }
    
}
