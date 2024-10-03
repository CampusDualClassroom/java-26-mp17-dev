package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Contact> data;

    public Phonebook() {
        this.data = new HashMap<>();
    }

    public Map<String, Contact> getData() {
        return this.data;
    }

    public void addContact(Contact contact) {
        this.data.put(contact.getCode(), contact);
    }

    public void deleteContact(String code) {
        this.data.remove(code);
    }

    public void showPhonebook() {
        System.out.println(this.data);
    }
}
