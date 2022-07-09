public class Main {
    public static void main(String[] args) {
////        String city = "Floresti";
////        String country;
////        country = "Olanda";
////        int population;
////        population = 1000000;
////
////        String productName = "mustar";
////        double price = 185.31;
////        boolean isavalable = true;
////        char nutriscor = 'b';
//
////        System.out.println(city);
//
//        double newPrice = 20.99;
//        double newPrice2 = 10.22;
//        double totalPrice;
//        totalPrice = newPrice + newPrice2;
//        double totalPricePerson = totalPrice / 5;
//        boolean ismoreexpensive = newPrice > newPrice2;
//        System.out.println(totalPrice);
//        System.out.println(totalPricePerson);
//        System.out.println(ismoreexpensive);
//        System.out.println(newPrice <= 2);
//        System.out.println(newPrice == newPrice2);
//        System.out.println(10 / 3);
//
//        boolean isavalable2 = true;
//        boolean isaffortable = newPrice2 < 10;
//        boolean isAA = isavalable2 && isaffortable;
//        System.out.println(isAA);
//        System.out.println(isaffortable || isavalable2);
//        System.out.println(!isavalable2);
//
//
//        int a = 14;
//        int b = 13;
//        if (a > b) {
//            System.out.println(a);
//        } else if (a < b) {
//            System.out.println(b);
//        }

        Employee employee = new Employee();
        employee.lastName = "Popescu";
        employee.firstName = "Ion";
        employee.salary = 12000;

        System.out.println(employee.getNameInitials());
        System.out.println(employee.predictRaise(employee.salary));

    }
}
