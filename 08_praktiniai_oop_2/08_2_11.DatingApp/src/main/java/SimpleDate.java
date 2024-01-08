import java.time.LocalDate;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        day++;
        if (day > 30) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void advance(int howManyDays) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate newDate = currentDate.plusDays(howManyDays);
//        this.day = newDate.getDayOfMonth();
//        this.month = newDate.getMonthValue();
//        this.year = newDate.getYear();

        while (howManyDays > 0) {
            if (this.day + howManyDays > 30) {
                howManyDays -= (30 - this.day + 1);
                this.day = 1;
                this.month++;
                if (this.month > 12) {
                    this.month = 1;
                    this.year++;
                }
            } else {
                this.day += howManyDays;
                howManyDays = 0;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate date = new SimpleDate(this.day, this.month, this.year);
        date.advance(days);

        return date;

    }

}
