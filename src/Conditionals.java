public class Conditionals {
    public static void main(String[] args) {
        int temperature = 20;
        System.out.println(temperature);
        temperature = 120;
        System.out.println(temperature);
        temperature = 70;
        if (temperature > 100) { // temperatura e mai mare de 100 grade [100, infinit]
            System.out.println("apa fierbe");
        } else if (temperature > 50 && temperature < 100) { // temperatura e intre 50 si 100 grade [50, 100]
            System.out.println("Apa nu fierbe inca");
        } else if (temperature > 0 && temperature < 50) { // temperatura e intre 0 si 50 grade [0, 50]
            System.out.println("Apa nu prea fierbe");
        } else { // temperatura [-infinit,0]
            /*...*/
            System.out.println("Apa a inghetat");

//            int h = 13;
//            int i = 14;
//            if (h > i) {
//                System.out.println(h);
//            } else if (h < i) {
//                System.out.println(i);
//            } else {
//                System.out.println(h);

                }
            }
        }
