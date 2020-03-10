package com.company.Khamis;
/*Create an abstract class for contacts that stores a contact's name and defines an abstract method contact().
Create one class that makes use of the abstract contact class that stores an email address and implements the
contact() method using the email address and another class that stores a phone number and implements the
contact() method using the phone number. The implementation of the contact() method should simply print a string
with the appropriate information like "Emailing aneuman1@cscc.edu" or "Calling 123-456-7890".

Abstract methods are declared methods lacking a body or implementation. Abstract methods are declared by prefixing
a method header with the abstract reserved word. Abstract methods must be declared in abstract classes. Abstract
classes are classes that may or may not contain abstract methods and cannot be used to create instances directly;
 in order to create an instance, a subclass must be created that provides an implementation of any abstract methods.
 Classes are declared abstract by prefixing the class declaration with the abstract reserved word.
*/

public class Main {

    public static void main(String[] args) {
Email e1= new Email("Neuman", "aneuman1@cscc.edu");
PhoneNumber p1 = new PhoneNumber("Neuman", "123-456-7890");
e1.contactMethod();
p1.contactMethod();
    }
}
