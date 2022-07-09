package Teme;
//Creeaza o clasa Car:
//        o masina are urmatoarele atribute:
//        numar de roti,
//        viteza maxima,
//        brand,
//        culoare,
//        viteza curenta,
//        treapta curenta de viteza
//b. o masina are urmatoarele comportamente:
//        porneste masina
//        adica initializeaza viteza curenta si treapta curenta de viteza cu 1
//        accelereaza
//        mareste viteza curenta cu o anumita valoare
//        Daca viteza se mareste cu mai mult de 20 (km/ora), se va mari si treapta de viteza cu o unitate
//        deceleraza
//        scade viteza cu o anumita valoare
//        Daca viteza scade cu mai mult de 20 (km/ora), se va trece la o treapta de viteza inferioara (se va scadea treapta de viteza cu o unitate

public class Car {
        final int maxSpeed; //atribut final
        public static final int NUMBER_OF_WHEELS = 4; //constanta
        String brand;
        String color;
        public int currentSpeed;
        private int currentGear;

        public Car(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void startCar() {
            System.out.println("Masina a pornit");
            this.currentGear = 1;
            this.currentSpeed = 1;
        }

        public int getCurrentGear() {
            return currentGear;
        }

        /*
            mareste viteza curenta cu o anumita valoare
            Daca viteza se mareste cu mai mult de 20 (km/ora), se va mari si treapta de viteza cu o unitate
            */
        public void accelerate(int aSpeed) {
            if (this.currentSpeed + aSpeed > maxSpeed) {
                System.out.println("S-a depasit viteza limita!");
            } else {
                this.currentSpeed += aSpeed;
                if (aSpeed > 20) {
                    this.currentGear++;
                }
            }
        }

    }

