package com.enigma.di;

public class App {

    static String address = "Jakarta";
    String alamat = "Jakarta";

    public static void main(String[] args) {
        System.out.println("hello world");

        String name = "Sintia Dewi"; //var string
        String fullName = "Sintia D";
        Integer umur = 24;
        int umur2 = 25;
        // byte short int log float double boolean -- Tipe Data Primitive
        // String, Collection(List, Set, Map) -- Tipe Data Non-Primitive

        // Looping for, foreach, while, do while
        /*for (int i = 0; i < 5; i++ ){
            System.out.println(i);
        }*/

        // if else
//        if (umur == 25) {
//            System.out.println("Benar");
//            //Eksekusi program True
//        }else{
//            System.out.println("Salah");
//            //Eksekusi program else
//        }

//        int[] numbers = new int[5];
//        numbers[0] = 5;
//        numbers[1] = 4;
//        numbers[2] = 3;
//        numbers[3] = 2;
//        numbers[4] = 1;
//
//        for (int i = 0; i < numbers.length; i++ ) {
//            System.out.println(numbers[i]);
//        }

//        String[] names = {"Sintia", "Dewi"};
//
//        for (int i = 0; i < names.length; i++ ) {
//            System.out.println(names[i]);
//        }

        //Memanggil variable non static di method harus dibuat instance object baru (contoh class App)
        App app = new App(); //buat object pemanggil function

        Integer resultSum = app.sum(5, 5);
        System.out.println(resultSum);
        app.printName(name);
    }//method berupa function untuk menjalankan program pertama kali

    public Integer sum(Integer angka1, Integer angka2){
        Integer result = angka1 + angka2;
        return result;
    }

    public void printName (String name) {
        System.out.println(name);
    }
}
