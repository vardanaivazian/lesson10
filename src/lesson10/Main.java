package lesson10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human garik = new Human(56, "Garik"); //call to constructor
        Human gasdarik = new Human( "Garik", 78); //call to constructor
        garik.setAge(-5);
        Scanner scanner = new Scanner(System.in);
        System.out.println(Human.x);

        Driver driver = new Driver("Ashot", 45, "Tesla Cybertruck");
        Driver[] drivers = new Driver[5];
        drivers[0] = driver;
        drivers[1] = driver;



        TaxiDriver pyotr = new TaxiDriver("Petros", 18, "Paggany", "Uber");


    }
}
