public class Reformatory {
private int weightMeasuredCounts;    
    
    public int weight(Person person) {
        this.weightMeasuredCounts++;
        return person.getWeight();
    }
    
    public void feed (Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return weightMeasuredCounts;
    }

}
