public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " +
                c1.getArea() + " and a color is " + c1.getColor());

        Circle c2 = new Circle(2.0);

        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " +
                c2.getArea() + " and a color is " + c2.getColor());

        Circle c3 = new Circle(4.0, "blue");

        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " +
                c3.getArea() + " and a color is " + c3.getColor() + " and circumference " + c1.getCircumference());

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is " + c4.getRadius());
        c4.setColor("yellow");
        System.out.println("color is " + c4.getColor());

        System.out.println(c1);
        System.out.println(c4);
        System.out.println("Operator '+' invokes toString() too: " + c2);

        //----------------------------------------------------------------------------------------------------

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        r1.setLength(5);
        r1.setWidth(4);
        System.out.println(r1);
        System.out.println("Width is " + r1.getWidth() + ", length is " + r1.getLength() +
                ", area is " + r1.getArea() + ", perimeter is " + r1.getPerimeter());

        //-------------------------------------------------------------------------------------------------------

        Employee e1 = new Employee(1,"Andrew", "Stevens", 300);

        System.out.println("name: " + e1.getFirstname() + " lastname: " +  e1.getLastName() +
                " fullname: " + e1.getName());
        e1.setSalary(400);
        e1.raiseSalary(10);
        System.out.println("annual salary " + e1.getAnnualSalary());

        System.out.println(e1);

        //-----------------------------------------------------------------------------------------------------

        InvoiceItem inv1 = new InvoiceItem("1", "awesome", 5, 10);
        inv1.setQty(2);
        inv1.setUnitPrice(2.5);
        System.out.println("total " + inv1.getTotal());
        System.out.println(inv1);

        //--------------------------------------------------------------------------------------------------------

        Account a1 = new Account("1", "Andrew", 500);
        Account a2 = new Account("2", "Steven");
        a1.credit(100);
        a1.debit(200);
        a2.debit(500);
        a1.transferTo(a2, 150);
        a2.transferTo(a1, 50);

        System.out.println(a1);
        System.out.println(a2);

        //-------------------------------------------------------------------------------------------------------

        Date date = new Date(1,1,2000);
        date.setDate(12,3,2003);
        date.setYear(1999);

        System.out.println(date);

        //----------------------------------------------------------------------------------------------

        Time time = new Time(5,2,54);
        time.setSecond(59);
        time.nextSecond();
        time.setMinute(59);
        time.setSecond(59);
        time.nextSecond();
        time.setHour(23);
        time.setMinute(59);
        time.setSecond(59);
        time.nextSecond();
        time.nextSecond();
        time.setTime(12,1,1);
        time.previousSecond();
        time.previousSecond();
        time.setSecond(0);
        time.previousSecond();
        time.setHour(0);
        time.setSecond(0);
        time.setMinute(0);
        time.previousSecond();

        System.out.println(time);


    }
}
