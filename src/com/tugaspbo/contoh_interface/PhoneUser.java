package com.tugaspbo.contoh_interface;

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
