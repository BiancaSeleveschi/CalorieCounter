package poo;

import Teme.Car;

//        // String dogName = "Labus";
//        Dog dogLabus = new Dog();
//        dogLabus.age = 3;
//        dogLabus.name = "Labus";
//        dogLabus.colour = "maro";
//        System.out.println(dogLabus.age);
//        System.out.println(dogLabus.name);
//        System.out.println(dogLabus.colour);
//        dogLabus.bark();
//        dogLabus.run();
//
//        Dog dogRex = new Dog("Rex", "maro", 7);
//        System.out.println("Catelil" + dogRex.name + "are culoare" + dogRex.colour + "age" + dogRex);
//
//        Calculator calculator = new Calculator();
//        int sum = calculator.computeSum(1, 2);
//        System.out.println("sum = " + sum);
//        int diff = calculator.computeDiff(34,18);
//        System.out.println("diff = " + diff);
//        int factorial = calculator.computeFact(12);
//        System.out.println("factorial = " + factorial);

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //1. cream o masina = un obiect de tip Car
            Car myCar = new Car(180);
            Scanner console = new Scanner(System.in);
            int option;

            do {
                //2. afisam meniul de optiuni pt jucator/sofer - DA
                printMenu();
                //3. citim optiunea introdusa de utilizator - DA
                option = console.nextInt();
                //4.executam actiunea dorita de utilizator per baza optiunii introduse - DA
                performSelectedAction(myCar, option, console);
            } while (option != 6);

        }

        public static void performSelectedAction(Car car, int option, Scanner console) {
            switch (option) {
                case 1:
                    car.startCar();
                    break;
                case 2:
                    System.out.println("Introduceti viteza cu care vreti sa accelerati:");
                    int accSpeed = console.nextInt();
                    car.accelerate(accSpeed);
                    System.out.println("Viteza masinii este acum: " + car.currentSpeed);
                    System.out.println("Treapta de viteza este acum: " + car.getCurrentGear());
                    break;
                case 3:
                    System.out.println("Introduceti viteza cu care vreti sa decelerati:");
                    int decelerateSpeed = console.nextInt();
                    car.accelerate(decelerateSpeed);
                    System.out.println("Viteza masinii este acum: " + car.currentSpeed);
                    break;
                case 6:
                    System.out.println("Ai iesit din aplicatie");
                    break;
                default:
                    System.out.println("Optiunea introduse este invalida, mai incearca odata!");
            }
        }


        public static void printMenu() {
            System.out.println("Meniu soferului");
            System.out.println("1. Porneste masina");
            System.out.println("2. Accelereaza");
            System.out.println("3. Decelereaza");
            System.out.println("4. Converteste o distanta din km in mile");
            System.out.println("5. Afiseaza detaliile masinii");
            System.out.println("6. Iesi din aplicatie");
            System.out.println("Alege optiunea: ");
        }
    }




