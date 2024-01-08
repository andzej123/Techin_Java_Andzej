
public class HealthStation {

    private int weightCount;

    public HealthStation() {
        weightCount = 0;
    }


    public int weigh(Person person) {
        weightCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weightCount;
    }

}
