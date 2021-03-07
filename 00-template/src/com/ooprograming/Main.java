package com.ooprograming;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        var Mahasiswa1 = new Mahasiswa("ihsan","bangka","18");
        
        Scanner UserInput = new Scanner(System.in);

        String angka = UserInput.nextLine();
        System.out.println("input ="+ angka);
        UserInput.close();
        System.out.println( "------------------------------");
        System.out.println(Mahasiswa1.name);
        System.out.println(Mahasiswa1.address);
        System.out.println(Mahasiswa1.age);
        
        
        System.out.println( "------------------------------");
        Mahasiswa1.sayHello("Azzam");

      
       
        
    }
}