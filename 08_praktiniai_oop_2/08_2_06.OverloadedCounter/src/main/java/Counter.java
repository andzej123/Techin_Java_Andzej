public class Counter {

    private int value;

    public Counter(int startValue) {
        value = startValue;
    }

    public Counter() {
        value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void decrease(int decreasyBy) {
        if (decreasyBy > 0) {
            value -= decreasyBy;
        }
    }

    public Counter dec() {
        value--;
        return this;
    }



    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
