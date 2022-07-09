package poo;

//Creeaza clasa Dog:
//        un caine are atributele: nume, culoare, age;
//        un caine are comportamentele: bark(latra), run(fuge)
public class Dog {
    String name;
    String colour;
    int age;


    Dog(){}

    Dog(String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;

    }

    void bark() {
        System.out.println(name + "latra");
    }
    void run(){
        System.out.println(name + "fuge");


    }

}

