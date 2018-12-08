public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int beginningValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.beginningValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value = this.value - 1;
        if (this.value < 1) {
            this.value = 0;
        }
    }
    
    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = beginningValue;
    }

    
}
