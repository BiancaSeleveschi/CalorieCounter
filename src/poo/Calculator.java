package poo;

//Creeaza o clasa Calculator care sa aiba urmatoarele comportamente:
//        suma a doua numere
//        diferenta a doua numere
//        factorialul unui numar
public class Calculator {
    int computeSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    int computeDiff(int a, int b) {
        int diff = a - b;
        return diff;
    }
    int computeFact(int a){
        int fact = 1;
        for(int i = 1; i<=a; i++) {
            fact = fact *i;
        }
        return fact;
    }
}

