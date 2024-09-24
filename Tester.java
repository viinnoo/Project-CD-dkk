package Inventory;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        System.out.println("Pilih 1. CD atau 2. DVD");
        int pilihan = kemil.nextInt();
        kemil.nextLine();

        if(pilihan == 1){

            System.out.println("Name: ");
            String name = kemil.nextLine();
            System.out.println("Artist: ");
            String artist = kemil.nextLine();
            System.out.println("Label: ");
            String label = kemil.nextLine();
            System.out.println("Number: ");
            int number = kemil.nextInt();
            System.out.println("Number Song: ");
            int numSong = kemil.nextInt();
            System.out.println("Quantity: ");
            int quantity = kemil.nextInt();
            System.out.println("Price: ");
            double price = kemil.nextDouble();

            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
            
        }else if (pilihan == 2){
            System.out.println("Name: ");
            String name = kemil.nextLine();
            System.out.println("Studio: ");
            String studio = kemil.nextLine();
            System.out.println("Number: ");
            int number = kemil.nextInt();
            System.out.println("Quantity: ");
            int quantity = kemil.nextInt();
            System.out.println("Rating: ");
            int rating = kemil.nextInt();
            System.out.println("Lenght: ");
            int lenght = kemil.nextInt();
            System.out.println("Price: ");
            double price = kemil.nextDouble();

            DVD dvd1 = new DVD(number, name, quantity, price, lenght, rating, studio);
            dvd1.print();
        }else {
            System.out.println("Input Salah");
        }
    }
}
