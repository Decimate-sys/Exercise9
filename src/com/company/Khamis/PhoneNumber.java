package com.company.Khamis;

/**
 * Created by 112609 on 3/10/2020.
 */
public class PhoneNumber extends Contact {
    private String phoneNumber;

    public PhoneNumber(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contactMethod() {
        System.out.println("Calling " + phoneNumber);
    }
}
