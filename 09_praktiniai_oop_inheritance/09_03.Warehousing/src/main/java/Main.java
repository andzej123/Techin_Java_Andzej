

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes



        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000, 1000);
//        juice.takeFromWarehouse(11.3);
//        juice.addToWarehouse(1);
//        juice.printAnalysis();

        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
        System.out.println(pwh.takeFromWarehouse(4.9));











    }

}
