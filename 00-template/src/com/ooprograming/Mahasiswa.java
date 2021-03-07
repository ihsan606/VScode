package com.ooprograming;

class Mahasiswa{
    String name;
    String address;
    String age;
    final String country = "Indonesia";
    

    Mahasiswa(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
        
    }


    void sayHello(String orang) {
        System.out.println("hello " + orang+" " +"my name is " + name);
    }
}