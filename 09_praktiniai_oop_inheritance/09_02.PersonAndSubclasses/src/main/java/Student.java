public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return this.credits;
    }

    public void studentHelp() {

    }

    @Override
    public String toString() {
        return getName() + "\n  " + getAddress() + "\n  Study credits " + credits;
    }
}
