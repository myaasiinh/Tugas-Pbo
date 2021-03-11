package com.tugaspbo.contoh_interface;

public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {

        this.volume = 50;

    }


    @Override
    public void powerOn() {

        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android version 29 ");

    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone matikan");
        System.out.println("Handphone tut - tut - tut");

    }

    @Override
    public void powerUp() {
        if (isPowerOn) {
            if (this.volume == MAX_Volume) {

                System.out.println("Handphone volume FULL");
                System.out.println("Handphone sudah" + this.getVolume() + "%");

            } else {

                this.volume += 10;
                System.out.println("Volume sekarang " + this.getVolume());

            }

        } else {

            System.out.println("Nyalakan dong volumenya");

        }

    }


    public int getVolume() {
        return this.volume;
    }

    @Override
    public void powerDown() {

        if (isPowerOn) {
            if (this.volume == MIN_Volume) {

                System.out.println("Handphone volume FULL");
                System.out.println("Handphone sudah" + this.getVolume() + "%");

            } else {

                this.volume += 10;
                System.out.println("Volume sekarang " + this.getVolume());

            }

        } else {

            System.out.println("Nyalakan dong volumenya");

        }

    }
}



