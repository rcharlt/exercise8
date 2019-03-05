package com.company;
import java.util.ArrayList;
// Rylee Charlton 3/5/19, exercise 8
/* This is the class that represents contact info */
class Person {
    public String name;
    public String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Person's name: " + name + ", Person's email: " + email);
    }
}

/* extends the contact class and stores the contact's phone number
            * should override the base class's method that displays the name and email address
            * so that it displays the phone number in addition to the name and email address*/
class Business extends Person {
    private String phoneNumber;


    public Business(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        String message;
        message = "Person's name: " + name + ", Person's email: " + email + ", Person's Phone number: " + phoneNumber;
        System.out.println(message);

    }
}

class Collection{

    ArrayList<Person> contacts = new ArrayList<>();

    public void addContact(Person person){
        contacts.add(person); //add person to array list

    }
    public void iterate(){
        for(Person person: contacts){
            person.display();
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robert", "robert@yahoo.com");
        Business business = new Business("Billy", "billy@gmail.com", "614-555-4435");
        Collection collection = new Collection();

        collection.addContact(person);
        collection.addContact(business);
        collection.iterate();


    }
}

