package com.tugaspbo.contoh_interface;

/*
Created at Thursday 11  March 2021
Licensed @myaasiinh
Tugas Pbo Materi Interface(24 Januari 2021).
 */


public class Oppo implements Handphone {

    private int volume;
    private boolean isPowerOn;

    public Oppo() {

        this.volume = 50;

    }


    @Override
    public void powerOn() {

        isPowerOn = true;
        System.out.println("Handphone Hidup");
        System.out.println("Selamat datang di Oppo ");
        System.out.println("Android version 28 ");

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



