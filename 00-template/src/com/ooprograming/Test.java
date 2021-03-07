package com.ooprograming;
import java.util.Scanner;

public class Test {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------------PROGRAM CAESAR CIPHER BERDASARKAN ASCII--------------");
        String pesan;
        int key;


        System.out.println("masukan pesan(Kapital)");
        pesan = input.nextLine();
        System.out.println("masukan key");
        key = input.nextInt();
        encrypt(pesan, key);

    }

    public static String encrypt(String pesan,int key)
    {
        String encrypted ="";
        for(int i=0;i<pesan.length();i++)
        {
            int c = pesan.charAt(i);
            if (c == 32)
            {
                encrypted = encrypted + " ";
            }
            else
            {
                c = c + key;
                if(c > 90)
                {
                    c = c - 26;
                }
                encrypted = encrypted + (char)c;
            }
        }
        System.out.println(encrypted);
        return encrypted;
    }

}


