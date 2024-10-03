package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Contact contact = new Contact("Fernando Miguel", "Juan de los Santos Requejo León", "3748");
        Contact contact2 = new Contact("Santiago", "Fernández Rocha", "3748");

        System.out.println(contact.getCode());
        System.out.println(contact2.getCode());
    }
}
