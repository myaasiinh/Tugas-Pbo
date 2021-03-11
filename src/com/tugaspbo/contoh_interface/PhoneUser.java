package com.tugaspbo.contoh_interface;

/*
Created at Thursday 11  March 2021
Licensed @myaasiinh
Tugas Pbo Materi Interface(24 Januari 2021).
 */



public class PhoneUser {

    private Phone phone;

    public  PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnPhone(){
        this.phone.powerOn();
    }

    void turnOffPhone(){
        this.phone.powerOff();
    }

    void turnUpPhone(){
        this.phone.powerUp();
    }

    void turnDownPhone(){
        this.phone.powerDown();
    }
}
