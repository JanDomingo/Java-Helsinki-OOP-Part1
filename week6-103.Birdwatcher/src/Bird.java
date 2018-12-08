public class Bird {

    private final String name;
    private final String latinName;
    private int count;
    
    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void increaseCount(){
            this.count++;
    }
    
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.count + " observations";
    }
    
}

    
    
    