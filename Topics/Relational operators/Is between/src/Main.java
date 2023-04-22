import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long dollars = ; // your budget

        if (dollars < 1000) {
            System.out.println("Buy a laptop");
        } else if (dollars < 2000) {
            System.out.println("Buy a personal computer");
        } else if (dollars < 100_000) {
            System.out.println("Buy a server");
        } else {
            System.out.println("Buy a data center or a quantum computer");
        }

    }
}