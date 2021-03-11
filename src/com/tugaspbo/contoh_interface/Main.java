package com.tugaspbo.contoh_interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Membuat objek Hp
        Phone Redmi8A = new Xiaomi();
        PhoneUser Yudha = new PhoneUser(Redmi8A);

        //Coba nyalakan Hp
        Yudha.turnOnPhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {

            System.out.println("Aplikasi Interface");
            System.out.println("1.Nyalakan Hp");
            System.out.println("2.Matikan Hp");
            System.out.println("3.Perbesar Volume");
            System.out.println("4.Turunkun Volume");
            System.out.println("5.Keluar");
            System.out.println("Pilih aksi");
            aksi = input.nextLine();


            if(aksi.equalsIgnoreCase("1")) {
                Yudha.turnOnPhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Yudha.turnOffPhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Yudha.turnUpPhone();
            } else if (aksi.equalsIgnoreCase("4")) {
                Yudha.turnDownPhone();
            } else if (aksi.equalsIgnoreCase("5")) {
                System.exit(5);
            } else {
                System.out.println("Kamu salah pilih");
            }

        }

    }

}

