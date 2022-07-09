package Proiect;

import java.util.Scanner;

public class CalorieCounter {

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        printMenu();
        performSelectedAction(productCatalog);
        Product product = new Product();
    }


    public static void printMenu() {
        Scanner console = new Scanner(System.in);
        boolean EXIT = false;
        int productCatalog = console.nextInt();

        System.out.println("MENIU:\n" +
                "            \"1. Adauga produs in calculator si calculeaza-i caloriile\"\n" +
                "            \"2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog\"\n" +
                "            \"3. Afiseaza toate produsele din catalog si caloriile pentru fiecare\"\n" +
                "            \"4. Sterge un produs din catalog\"\n" +
                "            \"5. Gaseste produs dupa nume\"\n" +
                "            \"6. Iesi din aplicatie\"\n");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Alege actiunea cu numarul: ");
    }

    public static void performSelectedAction(ProductCatalog productCatalog) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String productName = console.next();
        int grameGrasimi = console.nextInt();
        int grameCarbohidrati = console.nextInt();
        int grameProteine = console.nextInt();
        Product product = new Product(productName, grameGrasimi, grameCarbohidrati, grameProteine);


        switch (number) {
            case 1:
                System.out.println("Adauga produs in calculator si calculeaza-i caloriile");
                productCatalog.addProduct(product);
                for (int i = 0; i < productCatalog.productList.length; i++) {
                    if (productCatalog.productList[i] != null) {
                        System.out.println(productCatalog.productList[i]);
                    }
                }
                break;
            case 2:
                System.out.println("Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
                int totalCalories = product.computeCalories(grameGrasimi, grameCarbohidrati, grameProteine);
                System.out.println(totalCalories);
                break;
            case 3:
                System.out.println("Afiseaza toate produsele din catalog si caloriile pentru fiecare");

                for (int i = 0; i < productCatalog.productList.length; i++) {
                    System.out.print(productCatalog.productList[i] + " Calorii: " + productCatalog.productList[i].computeCalories(
                            productCatalog.productList[i].grameGrasimi, productCatalog.productList[i].grameCarbohidrati, productCatalog.productList[i].grameProteine));
                }
                break;
            case 4:
                System.out.println("Sterge un produs din catalog");
                productCatalog.deleteProduct(productName);
                break;
            case 5:
                System.out.println("Gaseste produs dupa nume");
                productCatalog.getProductByName(productName);
                break;
            case 6:
                System.out.println("Iesi din aplicatie");
                break;
            default:
                System.out.println("Optiunea selectata nu exista");

        }
    }
}

