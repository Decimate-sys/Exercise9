package com.company.Khamis;

/**
 * Created by 112609 on 3/10/2020.
 */
public class Email extends Contact {
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contactMethod() {
        System.out.println("Emailing " + email);
    }
}
